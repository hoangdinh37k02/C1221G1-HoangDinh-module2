package ss6_inheritance.excercise.circle;

public class Circle {
    private double radius =1.0;
    private String color = "blue";
    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Cirle with color of "
                + getColor()
                + " and "
                + "has area "+ getArea();
    }
}
