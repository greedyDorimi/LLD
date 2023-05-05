public class Activity {
    private Integer id;
    private ActivityType activityType;
    private Person person;
    private Address address;

    public Activity(Integer id, ActivityType activityType, Person person, Address address) {
        this.id = id;
        this.activityType = activityType;
        this.person = person;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
