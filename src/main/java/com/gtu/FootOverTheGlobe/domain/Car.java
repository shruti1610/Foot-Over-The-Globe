package com.gtu.FootOverTheGlobe.domain;

import javax.persistence.*;

@Entity
@Table(name = "car_details")
public class Car {

    @Id
    @GeneratedValue
    Long id;

    @Column(name ="car_name")
    String carName;

    @Column(name ="capacity")
    String capacity;

    @Column(name ="car_facilities")
    String carFacilities;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getCarFacilities() {
        return carFacilities;
    }

    public void setCarFacilities(String carFacilities) {
        this.carFacilities = carFacilities;
    }
}
