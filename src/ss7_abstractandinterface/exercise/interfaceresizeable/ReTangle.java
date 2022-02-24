package ss7_abstractandinterface.exercise.interfaceresizeable;

public class ReTangle extends Shape implements Resizeable {
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
    public void resize(double percent) {
        this.setWidth(width+width*percent);
        this.setLength(length+length*percent);
        System.out.println("the area after increase width and length to "+ percent+ " % is " + this.getArea());
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength() + " has area: " + getArea();
    }
}
