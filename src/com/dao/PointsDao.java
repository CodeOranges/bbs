package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Points;
import com.entity.PointsDetail;
import com.entity.PostComment;
import com.entity.PostList;
import com.entity.User;
@Component
@Repository
@Transactional
public class PointsDao extends HibernateDaoSupport {
	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory)
	{
	    super.setSessionFactory(sessionFactory);
	}
	
	//1.ͳ��ÿ���û��ķ�����
	public Long postCount(PostList postList,PointsDetail points){
			Long postCount=(Long) this.getHibernateTemplate().find("select count(*) from PostList as pl where pl.userId=?",postList.getUserId()).listIterator().next();
			return postCount.longValue();
	}
	
	//2.ͳ��ÿ���û���������
		public Long postComment(PostComment postComment,PointsDetail points){
			Long postC=(Long) this.getHibernateTemplate().find("select count(*) from PostComment as pc where pc.userId=?",postComment.getUserId()).listIterator().next();
				return postC.longValue();
		}
		
	//3.ÿ��һ�����Ӽ�3�֣���һ�����ۼ�1�֣�ɾ��һƪ���ӿ�3��
		public int pointsChange(Points points){
			return (Integer) this.getHibernateTemplate().save(points);
		}
		//4.�鿴�ҵĻ���
		public List myPoints(PointsDetail points,User user){
			List mypoints=this.getHibernateTemplate().find("from PointsDetail where pdId=(select MAX(p.pdId) from User as u,PointsDetail as p where u.userId=p.userId and p.userId=?)",points.getUserId());
			return mypoints;
		}
		
		//4.1�������
		public Long sumPoints(Points points,PointsDetail pointsDetail){
			Number sum=(Number) this.getHibernateTemplate().find("select sum(userPoints) from Points as p where p.userId=?",points.getUserId()).listIterator().next();
			return sum.longValue();
		}
		
		//5.���detail��Ϣ
		public int addDetail(PointsDetail points){
			return (Integer) this.getHibernateTemplate().save(points);
		}
		
		
		
		
		
		
		
		
		
		
}
