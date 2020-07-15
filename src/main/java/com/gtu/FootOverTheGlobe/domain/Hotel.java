
package com.gtu.FootOverTheGlobe.domain;

        import javax.persistence.*;

@Entity
@Table(name = "hotel_details")
public class Hotel {

    @Id
    @GeneratedValue
    Long id;

    @Column(name ="hotel_name")
    String hotelName;

    @Column(name ="city")
    String city;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
