package ss7_abstractandinterface.exercise.interfacecolorable;

public class ReTangle extends Shape implements Colorable{
    private double width = 1.0;
    private double length = 1.0;

    public ReTangle(){

    }

    public ReTangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public ReTangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color for all sides");
    }
}
