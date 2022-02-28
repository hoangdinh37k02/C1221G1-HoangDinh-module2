package ss5_accessmodifier_static.static_exercise.access_modifier;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius()+" "+ circle.getArea());

        Circle circle1=new Circle(2);
        System.out.println(circle.getRadius()+" "+ circle.getArea()+" "+circle1.getColor());

    }

}
