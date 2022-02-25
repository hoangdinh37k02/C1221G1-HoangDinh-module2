package ss8_cleancode.pratice.refactoringmethod;

public class Cylinder {
    private double radius = 1.0;
    private double height = 2.0;

    public Cylinder(){

    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getVolume(double radius, double height){
        double baseArea = getBaseArea(radius);
        double volumeofcylinder = baseArea*height;
        return volumeofcylinder;
    }

    private static double getBaseArea(double radius){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height + " has volume " + getVolume(this.radius, this.height)+
                '}';
    }
}
