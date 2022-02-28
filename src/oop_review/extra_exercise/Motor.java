package oop_review.extra_exercise;

public class Motor extends Vehicle{
    private int capacity;

    public Motor(){}

    public Motor(int capacity) {
        this.capacity = capacity;
    }

    public Motor(String numberPlate, String manufacturer, int yearOfManufacture, String owner, int capacity) {
        super(numberPlate, manufacturer, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
