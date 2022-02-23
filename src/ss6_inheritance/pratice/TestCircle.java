package ss6_inheritance.pratice;

public class TestCircle {
    public static void main(String[] args) {
        Circle cirle = new Circle();
        System.out.println(cirle);

        cirle = new Circle(2.5);
        System.out.println(cirle);

        cirle = new Circle(3.5, "blue", true);
        System.out.println(cirle);
    }
}
