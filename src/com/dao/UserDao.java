package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.User;

@Component
@Repository
@Transactional
public class UserDao extends HibernateDaoSupport {
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory)
	{
	    super.setSessionFactory(sessionFactory);
	}
	//1.用户/游客注册
	public int register(User user){
		return (Integer) this.getHibernateTemplate().save(user);
	}
	//1.1用户名重复校验
	public List nameRepeat(User user){
		List listRepeat=this.getHibernateTemplate().find("select u.userName from User as u where u.userName=?",user.getUserName());
		return listRepeat;
		
	}
	//2.用户/游客登录
	public List login(User user){
		List listLogin=this.getHibernateTemplate().find("from User as u where u.userName=? and u.userPass=?",user.getUserName(),user.getUserPass());
		return listLogin;
	}
	//3.修改个人信息
	//3.1查个人信息
	public List findOne(User user){
		List listOne=this.getHibernateTemplate().find("from User as u where u.userId=?",user.getUserId());
		return listOne;
	}
	//3.2修改
	public void updateInfo(User user){
		this.getHibernateTemplate().update(user);
	}
	//4.修改密码
}
