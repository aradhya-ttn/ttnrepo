package comassignment.jpa3.entities;

import javax.persistence.*;

//1.Create a class Address for Author with instance variables streetNumber, location, State.
@Embeddable
public class AuthorAddress {

    private String streetNumber;
    private String location;
    private String state;

    public AuthorAddress() {
    }

    public AuthorAddress(String streetNumber, String location, String state) {
        this.streetNumber = streetNumber;
        this.location = location;
        this.state = state;

    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
