package com.gtu.FootOverTheGlobe.service;

import java.util.HashMap;
import java.util.Map;

import com.gtu.FootOverTheGlobe.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtu.FootOverTheGlobe.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public  boolean login(String email, String password)
	{
		return userDao.login(email,password);

	}

	public Map<String,Object> registration(String email, String password, String mobile_no, String user_name)
	{
		Map<String,Object> map = new HashMap<>();
		
		boolean b = userDao.registration(email,password,mobile_no,user_name);
		if(b)
		{
			map.put("message", "Registered Successfully.");
			map.put("status",true);
		}
		else
		{
			map.put("message", "Invalid User.");
			map.put("status",false);
		}
		return map;
	}

    public User addUser(User user) {
		return userDao.addUser(user);
    }

}
