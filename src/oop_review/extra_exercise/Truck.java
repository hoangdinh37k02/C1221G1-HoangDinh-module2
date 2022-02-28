package oop_review.extra_exercise;

public class Truck extends Vehicle{
    private int truckLoad;

    public Truck(){}

    public Truck(int truckLoad) {
        this.truckLoad = truckLoad;
    }

    public Truck(String numberPlate, String manufacturer, int yearOfManufacture, String owner, int truckLoad) {
        super(numberPlate, manufacturer, yearOfManufacture, owner);
        this.truckLoad = truckLoad;
    }

    public int getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(int truckLoad) {
        this.truckLoad = truckLoad;
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
