package oop_review.extra_exercise;

import java.util.Scanner;

public class Oto extends Vehicle{
    private int numberOfSeat;
    private String typeOf;

    public Oto(){}

    public Oto(int numberOfSeat, String typeOf){
        this.numberOfSeat=numberOfSeat;
        this.typeOf=typeOf;
    }

    public Oto(String numberPlate, String manufacturer, int yearOfManufacture, String host, int numberOfSeat, String typeOf) {
        super(numberPlate, manufacturer, yearOfManufacture, host);
        this.numberOfSeat = numberOfSeat;
        this.typeOf = typeOf;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }

    @Override
    public void add() {
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập biển số: ");
        setNumberPlate(input.nextLine());
        System.out.print("Nhập nhà sx: ");
        setManufacturer(input.nextLine());
        System.out.print("Nhập năm sx: ");
        setYearOfManufacture(input.nextInt());
        System.out.print("Nhập tên chủ sở hữu: ");
        setHost(input.nextLine());setHost(input.nextLine());
        System.out.print("Nhập số ghế: ");
        setNumberOfSeat(input.nextInt());
        System.out.print("Nhập loại xe:");
        setTypeOf(input.nextLine());setTypeOf(input.nextLine());
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
