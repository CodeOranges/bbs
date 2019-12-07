package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.PostDao;
import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;

@Component
public class PostService {

	PostDao postDao;
@Resource
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
//1.用户发表帖子
//1.1外键相连，需要查找到当前用户的信息
	public List loginPost(User user){
		return postDao.loginPost(user);
}
	//1.2发表帖子
	public int addPost(PostList postList){
		return postDao.addPost(postList);
	}
	//2.查看自己的帖子
		public List listPostSelf(PostList postList){
			return postDao.listPostSelf(postList);
		}
		//3.修改帖子
		//3.1查找一篇帖子的详细内容
		public List listPostDetail(PostList postList,User user){
			return postDao.listPostDetail(postList,user);
		}
		//3.1.1查评论
		public List postDet(User user,PostList postList){
			return postDao.postDet(user, postList);
		}
		public List listPostDetail1(PostComment postComment,User user){
			return postDao.listPostDetail1(postComment, user);
		}
		//3.2修改帖子
		public void updatePost(PostList postList){
			postDao.updatePost(postList);
		}
		//4.删除帖子
		public void deletePost(PostList postList){
			postDao.deletePost(postList);
		}
		//5.查看全部帖子
		public List listAll(PostList postList,User user){
			return postDao.listAll(postList, user);
		}
		
		//6.添加评论
		public int addComment(PostComment postComment){
			return postDao.addComment(postComment);
		}
		//7.查看我的评论
		public List listComment(User user,PostComment postComment,PostList postList){
			return postDao.listComment(user, postComment,postList);
		}
		
		public List pComment(PostComment postComment,PostList postList){
			return postDao.pComment(postComment, postList);
		}
		//8.删除我的评论
		public void deleteComment(PostComment postComment) {
			 postDao.deleteComment(postComment);
		}
		
		//9.模糊查询（按照标题模糊查询）
		public List listVague(PostList postList,User user){
			return postDao.listVague(postList,user);
		}
		
}
