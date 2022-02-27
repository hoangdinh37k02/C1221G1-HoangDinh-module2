package ss4_oop.exercise.fan;

public class Fan {
    public final int SLOW=1;
    public final int MEDIUM=2;
    public final int FAST=3;

    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public Fan(){}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        if (this.on){
            System.out.println( "Fan is on with speed=" + speed +", radius=" + radius +", color= " + color);
        } else {
            System.out.println("Fan is off radius=" + radius +", color= " + color);
        }
    }

}
