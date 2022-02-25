package ss7_abstractandinterface.exercise.interfacecolorable;

public class Test {
    public static void main(String[] args) {

        Circle circle1= new Circle(1);
        Circle circle2= new Circle(2);

        ReTangle reTangle1 = new ReTangle(2,3);
        ReTangle reTangle2 = new ReTangle(3,4);

        Square square1=new Square(1);
        Square square2=new Square(2);

        Shape[] shapes={circle1,circle2,reTangle1,reTangle2,square1,square2};
        for (Shape implement: shapes){
            if (implement instanceof Square){
                System.out.println(implement);
                ((Square) implement).howToColor();
            } else {
                System.out.println(implement);
            }

        }
    }
}
