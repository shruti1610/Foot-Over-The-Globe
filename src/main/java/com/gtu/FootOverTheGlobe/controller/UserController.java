package com.gtu.FootOverTheGlobe.controller;

import java.util.HashMap;
import java.util.Map;

import com.gtu.FootOverTheGlobe.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gtu.FootOverTheGlobe.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	@ResponseBody
	public Map<String, Object> userLogin( HttpServletRequest request) throws Exception

		{


		String email = request.getParameter("email").toString();
		String password = request.getParameter("password").toString();

		boolean user=userService.login(email,password);
			System.out.println(email);

		Map<String,Object> result= new HashMap<>();
		result.put("email", email);
		result.put("login", user);
		result.put("password", password);
		return result;
	}

	
	@RequestMapping("/registration")
	@ResponseBody
	public /*Map<String, Object>*/ String userRegistration(@RequestBody Map<String, Object> request) throws Exception
	{
		String email = (String) request.get("email");
		String password = (String) request.get("password");
		String mobile_no = (String) request.get("mobile_no");
		String user_name = (String) request.get("user_name");
		System.out.println(email);
		User user = new User();
		user.setEmailId(email);
		user.setMobileNo(mobile_no);
		user.setPassword(password);
		user.setUserName(user_name);

		user  = userService.addUser(user);
		Map<String,Object> map = new HashMap();
		map.put("user",user);
		return map.toString();
	}
	
	
	
	
}