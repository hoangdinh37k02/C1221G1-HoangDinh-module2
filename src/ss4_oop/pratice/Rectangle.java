package ss4_oop.pratice;

public class Rectangle {
    double width, height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

    public String display(){
        return "Rectangle with width: " + width + " and height: "+height+" has area: "+getArea()+", perimetor: "+ getPerimeter();
    }
}
