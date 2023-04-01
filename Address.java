package com.payslip;

public class Address {
    private String door_no;
    private String street;
    private String Area;
    private String city;
    private int pin;
    public Address(){}

    public Address(String door_no, String street, String area, String city, int pin) {
        this.door_no = door_no;
        this.street = street;
        Area = area;
        this.city = city;
        this.pin = pin;
    }

//    public String getDoor_no() {
//        return door_no;
//    }

    public void setDoor_no(String door_no) {
        this.door_no = door_no;
    }

//    public String getStreet() {
//        return street;
//    }

    public void setStreet(String street) {
        this.street = street;
    }

//    public String getArea() {
//        return Area;
//    }

    public void setArea(String area) {
        Area = area;
    }

//    public String getCity() {
//        return city;
//    }

    public void setCity(String city) {
        this.city = city;
    }

//    public int getPin() {
//        return pin;
//    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "door_no='" + door_no + '\'' +
                ", street='" + street + '\'' +
                ", Area='" + Area + '\'' +
                ", city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}
