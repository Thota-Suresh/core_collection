package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.demo.dao.MyDAO;
import com.test.demo.model.User;
@Service
public class SecurityService implements UserDetailsService { 
	   @Autowired 
	   private MyDAO userRepository; 
	   
	   @Override 
	   public UserDetails loadUserByUsername(String username) 
	   throws UsernameNotFoundException { 
	      User user = userRepository.findUserByUsername(username) ;
	         return user; 
	   } 
	   public void createUser(UserDetails user) { 
	      userRepository.save((User) user); 
	   } 
	}