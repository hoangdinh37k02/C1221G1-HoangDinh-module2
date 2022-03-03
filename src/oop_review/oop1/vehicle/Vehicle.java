package oop_review.oop1.vehicle;

public class Vehicle {
    private int value;
    private double cylinder;

    public Vehicle(){}

    public Vehicle(int value, double cylinder) {
        this.value = value;
        this.cylinder = cylinder;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getCylinder() {
        return cylinder;
    }

    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    public double getTax(){
        if (this.getCylinder()<100){
            return this.value*0.01;
        } else if (this.getCylinder()<200){
            return this.value*0.03;
        } else {
            return this.value*0.05;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "value=" + value + " VND"+
                ", cylinder=" + cylinder + "cc"+
                '}';
    }
}
