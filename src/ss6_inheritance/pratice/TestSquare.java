package ss6_inheritance.pratice;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3);
        System.out.println(square);

        square = new Square(3,"black",false);
        System.out.println(square);
    }
}
