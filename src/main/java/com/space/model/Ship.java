package com.space.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Entity
@Table(name = "ship")
public class Ship {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "planet")
    private String planet;

    @Column(name = "shipType")
    private ShipType shipType;

    @Column(name = "prodDate")
    private Date prodDate;

    @Column(name = "isUsed")
    private Boolean isUsed;

    @Column(name = "speed")
    private Double speed;

    @Column(name = "crewSize")
    private Integer crewSize;

    @Column(name = "rating")
    private Double rating;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null&&name.length()!=0&&name.length()<=50) this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        if(planet!=null&&planet.length()!=0&&planet.length()<=50)  this.planet = planet;

    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        if(prodDate!=null){
            Calendar calendar = new GregorianCalendar(2800, 0 , 1);
            Date dateAfter = calendar.getTime();
            calendar.set(3019,0,1);
            Date dateBefore = calendar.getTime();
            if(prodDate.getTime()>=dateAfter.getTime()&&prodDate.getTime()<=dateBefore.getTime())this.prodDate = prodDate;
        }
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        double roundSpeed = Math.round(speed*100)/100;
        if(roundSpeed>=0.01&&roundSpeed<=0.99) this.speed = speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        if(crewSize!=null&&crewSize>=1&&crewSize<=9999) this.crewSize = crewSize;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        if(rating!=null) this.rating = (double)(Math.round(rating*100)/100);
    }
}
