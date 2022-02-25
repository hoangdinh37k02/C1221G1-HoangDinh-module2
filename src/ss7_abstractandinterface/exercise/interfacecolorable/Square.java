package ss7_abstractandinterface.exercise.interfacecolorable;

import ss6_inheritance.pratice.ReTangle;

public class Square extends Shape implements Colorable{
    private double side = 1;

    public Square(){};

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color for all sides");
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide() +" has area is: "+getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
