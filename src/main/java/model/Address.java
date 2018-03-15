package model;

public class Address {

    private String city;

    private String state;

    private String street;

    private int number;

    private int userId;

    public Address(String city, String state, String street, int number, int userId) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.number = number;
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUserId() {
        return userId;
    }
}
