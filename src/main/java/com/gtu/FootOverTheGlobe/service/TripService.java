package com.gtu.FootOverTheGlobe.service;

import com.gtu.FootOverTheGlobe.dao.TripDao;
import com.gtu.FootOverTheGlobe.dao.UserDao;
import com.gtu.FootOverTheGlobe.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TripService {
	
	@Autowired
	TripDao tripDao;

	public Map<String,Object>  getTripData()
	{
		Map<String,Object> map = new HashMap<>();

		List<Place> places = tripDao.placeList();
		List<Car> cars = tripDao.carList();
		List<Hotel> hotels = tripDao.hotelList();
		List<Restaurant> restaurants = tripDao.restaurantList();
		List<Guide> guides = tripDao.guideList();

		map.put("places",places);
		map.put("cars",cars);
		map.put("hotels",hotels);
		map.put("restaurants",restaurants);
		map.put("guides",guides);

		return map;
	}
	/*public Map<String,Object> createTrip(ArrayList<Hotel> hotel, ArrayList<Restaurant> restaurant, ArrayList<Guide> guide, ArrayList<Car> car, ArrayList<Place> place, String startDate, String endDate)
	{
		Map<String,Object> map = new HashMap<>();

		boolean b = tripDao.createTrip(hotel,restaurant,guide,car,place,startDate,endDate);
		if(b)
		{
			map.put("message", "Added Successfully.");
			map.put("status",true);
		}
		else
		{
			map.put("message", "Failed.");
			map.put("status",false);
		}
		return map;
	}*/

	public ParentModel addData(ParentModel trip) {
		return tripDao.addData(trip);
	}

}
