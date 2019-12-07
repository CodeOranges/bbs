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
//1.�û���������
//1.1�����������Ҫ���ҵ���ǰ�û�����Ϣ
	public List loginPost(User user){
		return postDao.loginPost(user);
}
	//1.2��������
	public int addPost(PostList postList){
		return postDao.addPost(postList);
	}
	//2.�鿴�Լ�������
		public List listPostSelf(PostList postList){
			return postDao.listPostSelf(postList);
		}
		//3.�޸�����
		//3.1����һƪ���ӵ���ϸ����
		public List listPostDetail(PostList postList,User user){
			return postDao.listPostDetail(postList,user);
		}
		//3.1.1������
		public List postDet(User user,PostList postList){
			return postDao.postDet(user, postList);
		}
		public List listPostDetail1(PostComment postComment,User user){
			return postDao.listPostDetail1(postComment, user);
		}
		//3.2�޸�����
		public void updatePost(PostList postList){
			postDao.updatePost(postList);
		}
		//4.ɾ������
		public void deletePost(PostList postList){
			postDao.deletePost(postList);
		}
		//5.�鿴ȫ������
		public List listAll(PostList postList,User user){
			return postDao.listAll(postList, user);
		}
		
		//6.�������
		public int addComment(PostComment postComment){
			return postDao.addComment(postComment);
		}
		//7.�鿴�ҵ�����
		public List listComment(User user,PostComment postComment,PostList postList){
			return postDao.listComment(user, postComment,postList);
		}
		
		public List pComment(PostComment postComment,PostList postList){
			return postDao.pComment(postComment, postList);
		}
		//8.ɾ���ҵ�����
		public void deleteComment(PostComment postComment) {
			 postDao.deleteComment(postComment);
		}
		
		//9.ģ����ѯ�����ձ���ģ����ѯ��
		public List listVague(PostList postList,User user){
			return postDao.listVague(postList,user);
		}
		
}
