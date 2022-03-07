
public class Subscriber extends SubscriberAddress {

    public String firstName;
    public String lastName;
    public String email;
    public int age;

    public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email, int age) {
        super(subscriberAddress);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String email) {
        super(subscriberAddress);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
