package com.action;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.struts.ActionSupport;

import com.service.PageService;

public class PageAction {

	PageService pageService;

	public void setPageService(PageService pageService) {
		this.pageService = pageService;
	}
	
	int allPage;
	int pageSize=3;
	int allRows;
	int page=1;
	int offset;
	@RequestMapping("findPage.do")
	public String findPage() throws Exception{
		allRows=pageService.findRows();
		offset=(page-1)*pageSize;
		if(allRows%pageSize==0){
			allPage=allRows/pageSize;
		}else{
			allPage=allRows/pageSize+1;
		}
		List page=pageService.getListForPage(offset, pageSize);
		if(page!=null)
			return "user/userIndex";
		return "fail";
	}
}
