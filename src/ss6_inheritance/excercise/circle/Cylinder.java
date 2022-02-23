package ss6_inheritance.excercise.circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){};

    public Cylinder (double height){
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolum(){
        return super.getArea()*Math.PI;
    }


    @Override
    public String toString() {
        return "A Cylinder with color of "
                + getColor()
                + " and "
                + " has volum " + getVolum();
    }

}
