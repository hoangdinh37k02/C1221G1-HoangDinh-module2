package oop_review.extra_exercise;

public class Oto extends Vehicle{
    private int numberOfSeat;
    private String typeOf;

    public Oto(){}

    public Oto(int numberOfSeat, String typeOf){
        this.numberOfSeat=numberOfSeat;
        this.typeOf=typeOf;
    }

    public Oto(String numberPlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeat, String typeOf) {
        super(numberPlate, manufacturer, yearOfManufacture, owner);
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

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}
