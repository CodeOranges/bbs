package com.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Manager;
import com.service.ManagerService;
import com.validation.ManagerValidator;

@Controller
public class ManagerAction {

	ManagerService service;
	ManagerValidator mv;
	@Resource
public void setMv(ManagerValidator mv) {
		this.mv = mv;
	}
@Resource
	public void setService(ManagerService service) {
		this.service = service;
	}
	//1.µÇÂ¼
@RequestMapping("loginManager.do")
	public String loginManager(@ModelAttribute("command")Manager manager,BindingResult bindingResult,HttpSession session){
		mv.validate(manager, bindingResult);
		if(bindingResult.hasErrors()){
			return "index";
		}else{
			List listManager=service.loginManager(manager);
			session.setAttribute("listManager", listManager);
			return "redirect:managerAll.do";
		}	
	}
}
