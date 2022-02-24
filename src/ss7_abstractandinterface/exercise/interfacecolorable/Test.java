package ss7_abstractandinterface.exercise.interfacecolorable;

public class Test {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square("blue", true, 3);
        Square square3 = new Square("green", false, 4);

        Square[] squareList = {square1,square2,square3};

        for (Square element: squareList){
            System.out.println(element);
        }
    }
}
