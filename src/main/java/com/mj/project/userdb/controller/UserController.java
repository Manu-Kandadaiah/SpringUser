package com.mj.project.userdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mj.project.userdb.entity.User;
import com.mj.project.userdb.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value="/add-user" , method=RequestMethod.POST)
	public ModelAndView addUser(User user) {
		
		return service.addUser(user);
		
	}
	
	@RequestMapping(value="/display-user", method = RequestMethod.GET)
	public ModelAndView displayStudents() {
		return service.getAllUser();
	}
	
	@RequestMapping(value="/find-user")
	public ModelAndView findUser(String userName) {
		return service.findUser(userName);
	}
}
