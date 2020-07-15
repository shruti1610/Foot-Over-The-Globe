package com.gtu.FootOverTheGlobe.domain;

import javax.persistence.*;

@Entity
@Table(name = "guide")
public class Guide {

    @Id
    @GeneratedValue
    Long id;

    @Column(name ="guide_name")
    String guideName;

    @Column(name ="language_id")
    String languageId;

    @Column(name ="location")
    String location;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
