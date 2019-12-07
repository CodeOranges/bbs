package com.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.functors.NonePredicate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.service.UserService;
import com.validation.UserValidator;
import com.validation.userLoginValidator;
@Controller
public class UserAction {
	UserService service;
	userLoginValidator u;
	UserValidator userValidator;
	@Resource
	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}
	@Resource
	public void setService(UserService service) {
		this.service = service;
	}
	@Resource
	public void setU(userLoginValidator u) {
		this.u = u;
	}
	//1.用户/游客注册
	@RequestMapping("register.do")
	public String register(@ModelAttribute("command")User user,BindingResult bindingResult,HttpSession session){

			int n=service.register(user);
			session.setAttribute("userName", user.getUserName());
			if(n>0)
				return "index";
			else
				return "fail";
	}
	//1.1用户名重复校验
	@RequestMapping("nameRepeat.do")
	public String nameRepeat(User user,HttpSession session){
		List listRepeat=service.nameRepeat(user);
		if(listRepeat.size()>0){
			return "fail2";
		}else{
			return "index";
		}
	}
	//2.用户/游客登录		
	@RequestMapping("loginUser.do")
	public String login(@ModelAttribute("command")User user,BindingResult bindingResult,HttpSession session){
		u.validate(user, bindingResult);
		if(bindingResult.hasErrors()){
			return "index";
		}else{
			List listLogin=service.login(user);
			if(listLogin.size()>0){
				session.setAttribute("listLogin", listLogin);
				return "redirect:listAll.do";
			}
				
			else{
				return "index";
			}
		}		
	}
	//3.修改个人信息
	//3.1查个人信息
	@RequestMapping("findOne.do")
	public String findOne(User user,HttpSession session){
		List listOne=service.findOne(user);
		session.setAttribute("listOne", listOne);
		return "user/showOne";
	}
	//3.2修改个人信息
	@RequestMapping("updateInfo.do")
	public ModelAndView updateInfo(User user,HttpSession session){
		service.updateInfo(user);
		int userId=user.getUserId();
		return new ModelAndView("redirect:/findOne.do?userId="+userId);
	}
	//4.修改密码
		@RequestMapping("updatePass.do")
		public String updatePass(User user,HttpSession session){
			service.updateInfo(user);
			return "index";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
