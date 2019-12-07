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
	//1.�û�/�ο�ע��
	public int register(User user){
		return (Integer) this.getHibernateTemplate().save(user);
	}
	//1.1�û����ظ�У��
	public List nameRepeat(User user){
		List listRepeat=this.getHibernateTemplate().find("select u.userName from User as u where u.userName=?",user.getUserName());
		return listRepeat;
		
	}
	//2.�û�/�ο͵�¼
	public List login(User user){
		List listLogin=this.getHibernateTemplate().find("from User as u where u.userName=? and u.userPass=?",user.getUserName(),user.getUserPass());
		return listLogin;
	}
	//3.�޸ĸ�����Ϣ
	//3.1�������Ϣ
	public List findOne(User user){
		List listOne=this.getHibernateTemplate().find("from User as u where u.userId=?",user.getUserId());
		return listOne;
	}
	//3.2�޸�
	public void updateInfo(User user){
		this.getHibernateTemplate().update(user);
	}
	//4.�޸�����
}
