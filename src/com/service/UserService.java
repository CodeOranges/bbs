package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.UserDao;
import com.entity.User;
@Component
public class UserService {
	UserDao userDao;
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//1.�û�/�ο�ע��
	public int register(User user){
		return userDao.register(user);
	}
	//1.1�û����ظ�У��
	public List nameRepeat(User user){
			return userDao.nameRepeat(user);
		}
	//2.�û�/�ο͵�¼
	public List login(User user){
		return userDao.login(user);
	}
	//3.�޸ĸ�����Ϣ
	//3.1�������Ϣ
	public List findOne(User user){
		return userDao.findOne(user);
	}
	//3.2�޸�
	public void updateInfo(User user){
		userDao.updateInfo(user);
	}
	//4.�޸�����
}
