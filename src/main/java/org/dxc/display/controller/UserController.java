package org.dxc.display.controller;

import org.dxc.display.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@RequestMapping("/user")
	public User userDetails(User user) {
		User p=new User();
		p.setUsername("Ganga");
		p.setEmail("gangaajitha@gmail.com");
		p.setMobileNo("9876543237");
		return p;
	}


}
