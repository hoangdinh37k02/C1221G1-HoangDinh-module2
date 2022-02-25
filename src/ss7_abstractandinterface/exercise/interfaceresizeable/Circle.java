package ss7_abstractandinterface.exercise.interfaceresizeable;

public class Circle extends Shape implements Resizeable{
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
    public void resize(double percent) {
        this.setRadius(radius+radius*percent);
        System.out.println("Area after increase the radius "+ percent*100+ "% is: "+getArea());
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()+ " area " + getArea();
    }
}
