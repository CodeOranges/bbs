package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;
@Component
@Repository
@Transactional
public class PostDao extends HibernateDaoSupport {
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory)
	{
	    super.setSessionFactory(sessionFactory);
	}
	//1.用户发表帖子
	//1.1外键相连，需要查找到当前用户的信息
	public List loginPost(User user){
		List loginPost=this.getHibernateTemplate().find("from User as u where userId=?",user.getUserId());
		return loginPost;
	}
	//1.2发表帖子
	public int addPost(PostList postList){
		return (Integer) this.getHibernateTemplate().save(postList);
	}
	//2.查看自己的全部帖子
	public List listPostSelf(PostList postList){
		List listPostSelf=this.getHibernateTemplate().find("from PostList as p where p.userId=?",postList.getUserId());
		return listPostSelf;
	}
	//3.修改帖子
	//3.1查找一篇帖子的详细内容
	public List listPostDetail(PostList postList,User user){
		List listPostDetail=this.getHibernateTemplate().find("from PostList as p,User as u where p.userId=u.userId and p.postId=?",postList.getPostId());
		return listPostDetail;
	}
	
	//3.2修改帖子
	public void updatePost(PostList postList){
		this.getHibernateTemplate().update(postList);
	}
	//4.删除自己的帖子
	public void deletePost(PostList postList){
		this.getHibernateTemplate().delete(postList);
	}
	//5级联查询，查找postList中userid对应的username
	public List listAll(PostList postList,User user){
		List listAll=this.getHibernateTemplate().find("from PostList as p,User as u where p.userId=u.userId");
		return listAll;
	}
	
	//6.添加评论
	public int addComment(PostComment postComment){
		return (Integer) this.getHibernateTemplate().save(postComment);
	}
	//7.查看我的评论
	public List listComment(User user,PostComment postComment,PostList postList){
		List listComment=this.getHibernateTemplate().find("from User as u,PostComment as pc,PostList as pl where u.userId=pc.userId and pl.postId=pc.postId and u.userId=?",user.getUserId());
		return listComment;
	}
	//查看帖子详细内容
	public List pComment(PostComment postComment,PostList postList){
		List pComment=this.getHibernateTemplate().find("from PostList pl left join pl.postC where pl.postId=?",postList.getPostId());
		return pComment;
	}
	//查帖子的详细内容（评论不重复）
	public List postDet(User user,PostList postList){
		List postDet=this.getHibernateTemplate().find("from User u,PostList pl where u.userId=pl.userId and pl.postId=?",postList.getPostId());
		return postDet;
	}
	
		public List listPostDetail1(PostComment postComment,User user){
			List listPostDetail1=this.getHibernateTemplate().find("from PostComment as pc,User as u where pc.userId=u.userId and pc.postId=?",postComment.getPostId());
			return listPostDetail1;
		}
	//8.删除我的评论
	public void deleteComment(PostComment postComment){
		this.getHibernateTemplate().delete(postComment);
	}
	
	//9.模糊查询（按照标题模糊查询）
	public List listVague(PostList postList,User user){
		List listVague=this.getHibernateTemplate().find("from PostList pl,User u where pl.userId=u.userId and pl.topic like '%"+postList.getTopic()+"%'");
		return listVague;
	}
	
	
	
	
	
}
