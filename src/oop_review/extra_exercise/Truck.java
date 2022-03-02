package oop_review.extra_exercise;

import java.util.Scanner;

public class Truck extends Vehicle{
    private int truckLoad;

    public Truck(){}

    public Truck(int truckLoad) {
        this.truckLoad = truckLoad;
    }

    public Truck(String numberPlate, String manufacturer, int yearOfManufacture, String host, int truckLoad) {
        super(numberPlate, manufacturer, yearOfManufacture, host);
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
        Scanner inputtruck=new Scanner(System.in);
        System.out.println("Nhập biển số: ");
        setNumberPlate(inputtruck.nextLine());
        System.out.println("Nhập nhà sx: ");
        setManufacturer(inputtruck.nextLine());
        System.out.println("Nhập năm sx: ");
        setYearOfManufacture(inputtruck.nextInt());
        System.out.println("Nhập tên chủ sở hữu: ");
        setHost(inputtruck.nextLine());setHost(inputtruck.nextLine());
        System.out.println("Nhập tải trọng: ");
        setTruckLoad(inputtruck.nextInt());
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
