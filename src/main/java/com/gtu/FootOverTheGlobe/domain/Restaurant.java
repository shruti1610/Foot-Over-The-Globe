package com.gtu.FootOverTheGlobe.domain;

import javax.persistence.*;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue
    Long id;

    @Column(name ="rest_name")
    String restName;


    @Column(name ="rest_add")
    String restAdd;


    @Column(name ="rest_desc")
    String restDesc;

    @Column(name ="rest_price")
    Long restPrice;

    @Column(name ="user_id")
    Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAdd() {
        return restAdd;
    }

    public void setRestAdd(String restAdd) {
        this.restAdd = restAdd;
    }

    public String getRestDesc() {
        return restDesc;
    }

    public void setRestDesc(String restDec) {
        this.restDesc = restDec;
    }

    public Long getRestPrice() {
        return restPrice;
    }

    public void setRestPrice(Long restPrice) {
        this.restPrice = restPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
