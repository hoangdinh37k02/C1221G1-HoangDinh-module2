package ss6_inheritance.excercise.circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.0,"white");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2);
        System.out.println(cylinder);

        cylinder = new Cylinder(3, 2,"violet");
        System.out.println(cylinder);
    }

}
