package comassignment.jpa3.oneToMany;

import javax.persistence.Embeddable;

@Embeddable
public class AuthorAddressOne {

    private String streetNumber;
    private String location;
    private String state;

    public AuthorAddressOne() {
    }

    public AuthorAddressOne(String streetNumber, String location, String state) {
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
