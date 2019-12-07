package com.dao;

import java.sql.SQLException;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.entity.PostList;

public class PageDao extends HibernateDaoSupport {

	public List<PostList> getListForPage(final String hql,final int offset,final int length){
		try {
			List list=getHibernateTemplate().executeFind(new HibernateCallback() {
				public Object doInHibernate(Session session) throws HibernateException,SQLException{
					List list2=session.createQuery(hql).setFirstResult(offset).setMaxResults(length).list();
					return list2;
				}
			});
			return list;
		} catch (RuntimeException e) {
			// TODO: handle exception
			throw null;
		}
	}
	
	public int findRows(String hql){
		return getHibernateTemplate().find(hql).size();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
