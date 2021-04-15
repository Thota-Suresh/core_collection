package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.demo.dao.MyDAO;
import com.test.demo.model.User;
@Service
public class SecurityService implements UserDetailsService{
	
	@Autowired
	private MyDAO dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = dao.findbyUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("user 404");
		}
		return new UserPrincipal(user);
	}

}
