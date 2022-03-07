
public class SubscriberAddress {

    public String streetName;
    public int streetNumber;
    public String city;
    public String country;
    public int zipCode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public SubscriberAddress(SubscriberAddress subscriberAddress) {
    }
}
