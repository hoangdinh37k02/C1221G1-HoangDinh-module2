package ss7_abstractandinterface.exercise.interfacecolorable;

public class Circle extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public void howToColor() {
        System.out.println("Color for all sides");
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
