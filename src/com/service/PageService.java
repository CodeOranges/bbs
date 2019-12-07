package com.service;

import java.util.List;

import com.dao.PageDao;
import com.entity.PostList;

public class PageService {

	PageDao pageDao;
	
	public void setPageDao(PageDao pageDao) {
		this.pageDao = pageDao;
	}

	public int findRows(){
		return pageDao.findRows("select count(*) from PostList pl group by pl.postId");
	}
	
	public List<PostList> getListForPage(int offset,int pageSize){
		return pageDao.getListForPage("from PostList pl order by pl.postId asc", offset, pageSize);
	}
}
