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
	//1.ͳ��ÿ���û��ķ�����
		public Long postCount(PostList postList,PointsDetail points){
			return pointsDao.postCount(postList,points);
		}
	//2.ͳ��ÿ���û���������
		public Long postComment(PostComment postComment,PointsDetail points){
			return pointsDao.postComment(postComment,points);
		}
	//3.ÿ��һ�����Ӽ�3�֣���һ�����ۼ�1�֣�ɾ��һƪ���ӿ�3��
		public int pointsChange(Points points){
			return pointsDao.pointsChange(points);
		}
		
		//4.�鿴�ҵĻ���
		public List myPoints(PointsDetail points,User user){
			return pointsDao.myPoints(points, user);
		}
		
		//4.1�������
		public Long sumPoints(Points points,PointsDetail pointsDetail){
			return pointsDao.sumPoints(points,pointsDetail);
		}
		
		//5.���detail��Ϣ
		public int addDetail(PointsDetail points){
			return pointsDao.addDetail(points);
		}
		
		
		
		
		
}
