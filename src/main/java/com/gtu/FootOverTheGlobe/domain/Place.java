package com.gtu.FootOverTheGlobe.domain;

import javax.persistence.*;

@Entity
@Table(name = "place_details")
public class Place {

    @Id
    @GeneratedValue
    Long id;

    @Column(name ="place_name")
    String placeName;

    @Column(name ="place_dec")
    String placeDec;

    @Column(name ="city_id")
    Long cityId;

    @Column(name ="city_name")
    String cityName;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDec() {
        return placeDec;
    }

    public void setPlaceDec(String placeDec) {
        this.placeDec = placeDec;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;


    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
