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
        Scanner inputTruck=new Scanner(System.in);
        System.out.print("Nhập biển số: ");
        setNumberPlate(inputTruck.nextLine());
        System.out.print("Nhập nhà sx: ");
        setManufacturer(inputTruck.nextLine());
        System.out.print("Nhập năm sx: ");
        setYearOfManufacture(inputTruck.nextInt());
        System.out.print("Nhập tên chủ sở hữu: ");
        setHost(inputTruck.nextLine());setHost(inputTruck.nextLine());
        System.out.print("Nhập tải trọng: ");
        setTruckLoad(inputTruck.nextInt());
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
