package ss7_abstractandinterface.exercise.interfacecolorable;

import ss6_inheritance.pratice.ReTangle;

public class Square extends Shape {
    private double side = 1.0;
    public Square(){};

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area " + getArea()+
                '}';
    }
}
