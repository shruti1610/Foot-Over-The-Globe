package com.gtu.FootOverTheGlobe.dao;

import com.gtu.FootOverTheGlobe.domain.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean login(String email, String password)
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from user where email_id = '"+email+"' and password ='"+password+"' ");
		query.addEntity(User.class);
		List<User> users = query.list();
		tx.commit();
		session.close();

		if(users.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean registration(String email, String password, String mobile_no, String user_name)
	{
		
		return true;
	}


	public User addUser(User user) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(user);
		tx.commit();
		session.close();
		return user;
	}
}
