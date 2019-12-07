package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Manager;
@Component
@Repository
@Transactional
public class ManagerDao extends HibernateDaoSupport {
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory)
	{
	    super.setSessionFactory(sessionFactory);
	}
	//1.登录
	public List loginManager(Manager manager){
		List listManager=this.getHibernateTemplate().find("from Manager as m where m.managerName=? and m.managerPass=?",manager.getManagerName(),manager.getManagerPass());
		return listManager;
	}
	//2.查看所有用户的帖子
	//3.删除用户的帖子
}
