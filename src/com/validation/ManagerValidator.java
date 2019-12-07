package com.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.entity.Manager;
import com.entity.User;
@Component
public class ManagerValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Manager.class.isAssignableFrom(arg0);
	}

	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		Manager manager=(Manager) arg0;
		ValidationUtils.rejectIfEmpty(arg1, "managerName", "managerName.required","请输入管理员名");
		ValidationUtils.rejectIfEmpty(arg1, "managerPass", "managerPass.required","请输入密码");


	}

}
