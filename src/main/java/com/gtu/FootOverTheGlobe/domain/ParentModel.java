package com.gtu.FootOverTheGlobe.domain;

import java.util.ArrayList;
import java.util.List;

public class ParentModel {


    private ArrayList<Hotel> hotel = new ArrayList<>();
    private ArrayList<Restaurant> restaurant = new ArrayList<>();
    private ArrayList<Guide> guide = new ArrayList<>();
    private ArrayList<Car> car = new ArrayList<>();
    private ArrayList<Place> place = new ArrayList<>();
    String startDate,endDate;

    public ParentModel(ArrayList<Hotel> hotel, ArrayList<Restaurant> restaurant, ArrayList<Guide> guide, ArrayList<Car> car, ArrayList<Place> place, String startDate, String endDate) {
        this.hotel = hotel;
        this.restaurant = restaurant;
        this.guide = guide;
        this.car = car;
        this.place = place;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ArrayList<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(ArrayList<Hotel> hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(ArrayList<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<Guide> getGuide() {
        return guide;
    }

    public void setGuide(ArrayList<Guide> guide) {
        this.guide = guide;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public ArrayList<Place> getPlace() {
        return place;
    }

    public void setPlace(ArrayList<Place> place) {
        this.place = place;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
