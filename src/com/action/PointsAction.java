package com.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Points;
import com.entity.PointsDetail;
import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;
import com.service.PointsService;

@Controller
public class PointsAction {

	PointsService pointsService;

	@Resource
	public void setPointsService(PointsService pointsService) {
		this.pointsService = pointsService;
	}
	//1.统计每个用户的发帖数
	@RequestMapping("pCount.do")
		public ModelAndView postCount(PostList postList,PointsDetail points,HttpSession session){
			Long pCount=pointsService.postCount(postList,points);
			Long p=points.getPostCounts()+pCount;
			int userId=postList.getUserId();
			//points.setPostCounts(p);
			session.setAttribute("pCount", p);
				return new ModelAndView("redirect:/pComment.do?userId="+userId);

		}
	
	//2.统计每个用户的评论数
		@RequestMapping("pComment.do")
			public ModelAndView postComment(PostComment postComment,PointsDetail points,HttpSession session){
				Long pComment=pointsService.postComment(postComment,points);
				Long pp=points.getPostComments()+pComment;
				int userId=postComment.getUserId();
				//points.setPostComments(pp);
				session.setAttribute("pComment", pp);
				return new ModelAndView("redirect:/sum.do?userId="+userId);
			}
		
		//6.1积分求和
		@RequestMapping("sum.do")
			public String sumPoints(Points points,PointsDetail pointsDetail,HttpSession session){
				Long n=pointsService.sumPoints(points,pointsDetail);
				Long p=pointsDetail.getSumPoints()+n;
				//pointsDetail.setSumPoints(p);
				session.setAttribute("sum", p);
				return "points/detail";
								
			}
		//3.发帖+3分
		@RequestMapping("plus3Points.do")
		public String plus3Points(Points points){
			int p3=points.getUserPoints()+3;
			points.setUserPoints(p3);
			int n=pointsService.pointsChange(points);
			int userId=points.getUserId();
			return "redirect:listAll.do";
		}
		
		//4.发表评论+1分
		@RequestMapping("plus1Point.do")
		public String plus1Point(Points points){
			int p1=points.getUserPoints()+1;
			points.setUserPoints(p1);
			int n=pointsService.pointsChange(points);
			return "redirect:listAll.do";
		}
		
		//5.删除帖子-3分
		@RequestMapping("minus3Points.do")
		public String minusPoint(Points points){
			int mp=points.getUserPoints()-3;
			points.setUserPoints(mp);
			int n=pointsService.pointsChange(points);
			int userId=points.getUserId();
			return "redirect:listAll.do";
		}
		
		//6.查看我的积分
		@RequestMapping("myPoints.do")
		public String myPoints(PointsDetail points,User user,HttpSession session){
			List mypoints=pointsService.myPoints(points, user);
			session.setAttribute("mypoints", mypoints);
			return "points/myPoints";
		}
		
		
		//7.添加detail信息
		@RequestMapping("addDetail.do")
		public ModelAndView addDetail(PointsDetail points){
			int n=pointsService.addDetail(points);
			int userId=points.getUserId();
			if(n>0)
				return new ModelAndView("redirect:/myPoints.do?userId="+userId);
			else
				return new ModelAndView("fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
