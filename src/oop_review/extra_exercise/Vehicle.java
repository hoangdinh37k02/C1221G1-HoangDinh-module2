package oop_review.extra_exercise;

public abstract class Vehicle {
    private String numberPlate;
    private String manufacturer;
    private int yearOfManufacture;
    private String host;

    public Vehicle(){}

    public Vehicle(String numberPlate, String manufacturer, int yearOfManufacture, String host) {
        this.numberPlate = numberPlate;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.host = host;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public abstract void add();

    public abstract void display();

    public abstract void delete();


}
