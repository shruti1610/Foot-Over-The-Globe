package com.gtu.FootOverTheGlobe.dao;

import com.gtu.FootOverTheGlobe.domain.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TripDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Place> placeList()
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from place_details");
		query.addEntity(Place.class);
		List<Place> places = query.list();
		tx.commit();
		session.close();

		return places;
	}


	public List<Car> carList()
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from car_details");
		query.addEntity(Car.class);
		List<Car> cars = query.list();
		tx.commit();
		session.close();

		return cars;
	}


	public List<Hotel> hotelList()
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from hotel_details");
		query.addEntity(Hotel.class);
		List<Hotel> hotels = query.list();
		tx.commit();
		session.close();

		return hotels;
	}



	public List<Restaurant> restaurantList()
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from restaurant");
		query.addEntity(Restaurant.class);
		List<Restaurant> restaurants = query.list();
		tx.commit();
		session.close();

		return restaurants;
	}



	public List<Guide> guideList()
	{
		Session session = sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();

		SQLQuery query = session.createSQLQuery("select * from guide");
		query.addEntity(Guide.class);
		List<Guide> guides = query.list();
		tx.commit();
		session.close();

		return guides;
	}
	/*public boolean createTrip(ArrayList<Hotel> hotel, ArrayList<Restaurant> restaurant, ArrayList<Guide> guide, ArrayList<Car> car, ArrayList<Place> place, String startDate, String endDate)
	{

		return true;
	}*/


	public ParentModel addData(ParentModel trip) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(trip);
		tx.commit();
		session.close();
		return trip;
	}

}
