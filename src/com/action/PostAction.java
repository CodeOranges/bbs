package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.Session;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.JavaScriptUtils;

import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;
import com.service.PostService;

@Controller
public class PostAction {

	PostService service;
@Resource
	public void setService(PostService service) {
		this.service = service;
	}
//1.用户发表帖子
//1.1外键相连，需要查找到当前用户的信息
@RequestMapping("loginPost.do")
public String loginPost(User user,HttpSession session){
	List loginPost=service.loginPost(user);
	session.setAttribute("loginPost", loginPost);
	return "user/addPost";

	
}
//1.2发表帖子
@RequestMapping("addPost.do")
	public String addPost(PostList postList,HttpSession session){
		int n=service.addPost(postList);
		return "points/add3points";

	}

//2.查看自己的帖子
@RequestMapping("listPostSelf.do")
	public String listPostSelf(PostList postList,HttpSession session){
		List listPostSelf=service.listPostSelf(postList);
		session.setAttribute("listPostSelf", listPostSelf);
		return "user/myPost";
	}
//3.修改帖子
//3.1查找一篇帖子的详细内容
@RequestMapping("listPostDetail.do")
public String listPostDetail(PostList postList,User user,HttpSession session){
	List listPostDetail=service.listPostDetail(postList,user);
	session.setAttribute("listPostDetail", listPostDetail);
	return "user/updatePost";
}
//3.1.1管理员查看详细内容
@RequestMapping("managerDetail.do")
public String managerDetail(PostList postList,User user,HttpSession session){
	List managerDetail=service.listPostDetail(postList,user);
	session.setAttribute("managerDetail", managerDetail);
	return "manager/managerShowOne";
}

//3.2修改帖子
@RequestMapping("updatePost.do")
		public ModelAndView updatePost(PostList postList){
			service.updatePost(postList);
			int postId=postList.getPostId();
			return new ModelAndView("redirect:/listPostDetail.do?postId="+postId);
		}

//4.删除帖子
@RequestMapping("deletePost.do")
public String deletePost(PostList postList){
	service.deletePost(postList);
	return "points/minus3points";
}

//4.1管理员删除帖子
@RequestMapping("managerDelete.do")
public String managerDelete(PostList postList){
	service.deletePost(postList);
	return "redirect:managerAll.do";
}

//5.查看全部帖子
@RequestMapping("TouristAll.do")
		public String TouristAll(User user,PostList postList,HttpSession session){
			List TouristAll=service.listAll(postList, user);
			session.setAttribute("TouristAll", TouristAll);
			return "touristIndex";
		}
//6.管理员查看帖子
@RequestMapping("managerAll.do")
public String managerAll(User user,PostList postList,HttpSession session){
	List managerAll=service.listAll(postList, user);
	session.setAttribute("managerAll", managerAll);
	return "manager/managerIndex";
}
//7.用户查看全部帖子
@RequestMapping("listAll.do")
public String listAll(PostList postList,User user,HttpSession session){
	List listAll=service.listAll(postList, user);
	session.setAttribute("listAll", listAll);
	return "user/userIndex";
	
}

//8.评论
//7.1查看帖子详细内容
@RequestMapping("postDet.do")
public String postDet(User user,PostList postList,HttpSession session){
	List postDet=service.postDet(user, postList);
	session.setAttribute("postDet", postDet);
	return "user/postComment";
	
}
//7.1.1查评论
@RequestMapping("listPostDetail1.do")
		public ModelAndView listPostDetail1(PostComment postComment,User user,HttpSession session){
			List listPostDetail1=service.listPostDetail1(postComment, user);
			session.setAttribute("listPostDetail1", listPostDetail1);
			int postId=postComment.getPostId();
			return new ModelAndView("redirect:/postDet.do?postId="+postId);
		}

@RequestMapping("postComment.do")
public String postComment(PostComment postComment,PostList postList,HttpSession session){
	List pComment=service.pComment(postComment, postList);
	session.setAttribute("pComment", pComment);
	return "user/postComment";
}

//7.2添加评论
@RequestMapping("addComment.do")
public String addComment(PostComment postComment){
	int n=service.addComment(postComment);
	return "points/add1point";

}

//7.3查看我的评论
@RequestMapping("listComment.do")
public String listComment(User user,PostComment postComment,PostList postList,HttpSession session){
	List listComment=service.listComment(user, postComment,postList);
	session.setAttribute("listComment", listComment);
	return "user/myComment";

}

//7.4删除我的评论
@RequestMapping("deleteComment.do")
public String deleteComment(PostComment postComment){
	service.deleteComment(postComment);
	return "user/userIndex";
}
//8.模糊查询
@RequestMapping("listVague.do")
public String listVague(PostList postList,User user,HttpSession session){
	List listVague=service.listVague(postList,user);
	session.setAttribute("listVague", listVague);
	return "listvague";
}
@RequestMapping("listVague2.do")
public String listVague2(PostList postList,User user,HttpSession session){
	List listVague2=service.listVague(postList,user);
	session.setAttribute("listVague2", listVague2);
	return "listvague2";
}

}
