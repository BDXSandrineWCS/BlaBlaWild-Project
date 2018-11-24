package fr.wcs.blablawild;

import java.util.Date;

public class TripModel {

    private String firstname;
    private String lastname;
    private Date dateTrip;
    private int price;

    //constructor

    public TripModel(){
        super();
    }

    public TripModel(String firstname, String lastname, Date date, int price) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateTrip = date;
        this.price = price;
    }

    //getters and setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateTrip() {
        return dateTrip;
    }

    public void setDateTrip(Date date) {
        this.dateTrip = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
