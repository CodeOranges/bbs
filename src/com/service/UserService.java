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
	//1.用户/游客注册
	public int register(User user){
		return userDao.register(user);
	}
	//1.1用户名重复校验
	public List nameRepeat(User user){
			return userDao.nameRepeat(user);
		}
	//2.用户/游客登录
	public List login(User user){
		return userDao.login(user);
	}
	//3.修改个人信息
	//3.1查个人信息
	public List findOne(User user){
		return userDao.findOne(user);
	}
	//3.2修改
	public void updateInfo(User user){
		userDao.updateInfo(user);
	}
	//4.修改密码
}
