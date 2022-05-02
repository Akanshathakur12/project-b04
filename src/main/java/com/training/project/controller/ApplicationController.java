package com.training.project.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.model.User;
import com.training.project.service.UserService;

@Controller
public class ApplicationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user",new User());
		return mav;
	}
	
	
	 @PostMapping("/login") 
	 public String login(@ModelAttribute("user") User user)
	 {
	  
	  User oauthUser = userService.login(user.getUsername(), user.getPassword());
	  
	  System.out.println(oauthUser);
	  if(Objects.nonNull(oauthUser)) {
		  return "redirect:/";
	  }
	  else
		  return "redirect:/login";
	  }
	 @GetMapping("/")
		public ModelAndView home() {
			return new ModelAndView("home");
		}
	 
	 @GetMapping("/registerUser")
		public ModelAndView registerCustomerPage() {
			return new ModelAndView("registeruser");
		}
		
		@GetMapping("/registerSeller")
		public ModelAndView registerDriverPage() {
			return new ModelAndView("registerSeller");
		}
		
	 @RequestMapping(value= {"/logout"},method=RequestMethod.POST)
	 public String logoutDo(HttpServletRequest request,HttpServletResponse response) {
		 
		  return "redirect:/login";
	 
	 }
	 
}