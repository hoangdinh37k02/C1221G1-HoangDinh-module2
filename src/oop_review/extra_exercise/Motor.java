package oop_review.extra_exercise;

import java.util.Scanner;

public class Motor extends Vehicle{
    private int capacity;

    public Motor(){}

    public Motor(int capacity) {
        this.capacity = capacity;
    }

    public Motor(String numberPlate, String manufacturer, int yearOfManufacture, String host, int capacity) {
        super(numberPlate, manufacturer, yearOfManufacture, host);
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
        Scanner inputmotor=new Scanner(System.in);
        System.out.println("Nhập biển số");
        setNumberPlate(inputmotor.nextLine());
        System.out.println("Nhập nhà sx");
        setManufacturer(inputmotor.nextLine());
        System.out.println("Nhập năm sx");
        setYearOfManufacture(inputmotor.nextInt());
        System.out.println("Nhập CSH");
        setHost(inputmotor.nextLine());setHost(inputmotor.nextLine());
        System.out.println("Nhập dung tích");
        setCapacity(inputmotor.nextInt());
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
