package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.PointsDao;
import com.entity.Points;
import com.entity.PointsDetail;
import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;

@Component
public class PointsService {
	PointsDao pointsDao;

	@Resource
	public void setPointsDao(PointsDao pointsDao) {
		this.pointsDao = pointsDao;
	}
	//1.统计每个用户的发帖数
		public Long postCount(PostList postList,PointsDetail points){
			return pointsDao.postCount(postList,points);
		}
	//2.统计每个用户的评论数
		public Long postComment(PostComment postComment,PointsDetail points){
			return pointsDao.postComment(postComment,points);
		}
	//3.每发一个帖子加3分，发一条评论加1分，删除一篇帖子扣3分
		public int pointsChange(Points points){
			return pointsDao.pointsChange(points);
		}
		
		//4.查看我的积分
		public List myPoints(PointsDetail points,User user){
			return pointsDao.myPoints(points, user);
		}
		
		//4.1积分求和
		public Long sumPoints(Points points,PointsDetail pointsDetail){
			return pointsDao.sumPoints(points,pointsDetail);
		}
		
		//5.添加detail信息
		public int addDetail(PointsDetail points){
			return pointsDao.addDetail(points);
		}
		
		
		
		
		
}
