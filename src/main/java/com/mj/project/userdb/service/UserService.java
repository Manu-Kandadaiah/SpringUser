package com.mj.project.userdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.mj.project.userdb.entity.User;
import com.mj.project.userdb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public ModelAndView addUser(User user) {
		
		userRepository.addUser(user);
		
		ModelAndView mav =new ModelAndView();
		mav.setViewName("index.jsp");
		
		return mav;
	}
	
	public ModelAndView getAllUser() {
		
		List<User> users= userRepository.getAllUser();
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayUser.jsp");
		mav.addObject("key", users);
		
		return mav;
	}
	
	public ModelAndView findUser(String userName) {
		
		List<User> users= userRepository.findUser(userName);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayFinded.jsp");
		mav.addObject("key1", users);
		
		return mav;
	}
}
