package com.gtu.FootOverTheGlobe.controller;

import com.gtu.FootOverTheGlobe.domain.*;
import com.gtu.FootOverTheGlobe.service.TripService;
import com.gtu.FootOverTheGlobe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/trip")
public class TripController {

	@Autowired


	TripService tripService;

	@PostMapping("/details")
	@ResponseBody
	public Map<String,Object> Trip() throws Exception
	{
		return  tripService.getTripData(); }

	/*@PostMapping("/details")
	@ResponseBody
	public Map<String,Object> createTrip(@RequestBody ParentModel parentModel) throws Exception
	{

		return null;
	}*/



}