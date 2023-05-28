package model;


public class Order {

    private String button;
    private String name;
    private String lastName;
    private String address;
    private String metroStation;
    private String phone;
    private String orderDate ;
    private String rentalPeriod;
    private String scooterColour;
    private String orderComment;

    private String orderTrue;

    public String getButton() {

        return button;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {

        return lastName;
    }

    public String getAddress() {

        return address;
    }

    public String getMetroStation() {

        return metroStation;
    }

    public String getPhone() {

        return phone;
    }

    public String getOrderDate() {

        return orderDate;
    }

    public String getRentalPeriod() {

        return rentalPeriod;
    }

    public String getScooterColour() {

        return scooterColour;
    }

    public String getOrderComment() {

        return orderComment;
    }

    public String getOrderTrue() {

        return orderTrue;
    }

    public Order(String button, String name, String lastName, String address, String metroStation, String phone, String orderDate, String rentalPeriod, String scooterColour, String orderComment) {

        this.button = button;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.orderDate = orderDate;
        this.rentalPeriod = rentalPeriod;
        this.scooterColour = scooterColour;
        this.orderComment = orderComment;
        this.orderTrue = orderTrue;

    }

}
