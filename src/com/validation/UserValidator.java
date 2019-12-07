package com.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.entity.User;
@Component
public class UserValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(arg0);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		User user=(User) arg0;
		ValidationUtils.rejectIfEmpty(arg1, "userName", "userName.required","请输入用户名");
		ValidationUtils.rejectIfEmpty(arg1, "userPass", "userPass.required","请输入密码");
		ValidationUtils.rejectIfEmpty(arg1, "userEmail", "userEmail.required","请输入有效邮箱地址");
		ValidationUtils.rejectIfEmpty(arg1, "userNickName", "userNickName.required","请输入昵称");


	}

}
