package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.ManagerDao;
import com.entity.Manager;

@Component
public class ManagerService {

	ManagerDao managerDao;
	@Resource
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	//1.µÇÂ¼
	public List loginManager(Manager manager){
		return managerDao.loginManager(manager);
	}
}
