package ss7_abstractandinterface.exercise.interfaceresizeable;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.0);
        circles[1] = new Circle(2.0);
        circles[2] =new Circle(3);

        for (Circle circle: circles){
            System.out.println("pre-change radius");
            System.out.println(circle);
            circle.resize(Math.random());
            System.out.println("--------------------");
        }

        ReTangle[] reTangles = new ReTangle[2];
        reTangles[0] = new ReTangle(2,3);
        reTangles[1] = new ReTangle(5,6);

        for (ReTangle reTangle: reTangles){
            System.out.println("pre-change width and length");
            System.out.println(reTangle);
            reTangle.resize(Math.random());
            System.out.println("--------------------");
        }

        Square[] squares= new Square[1];
        squares[0]=new Square(2);

        for (Square square: squares){
            System.out.println("pre-change side");
            System.out.println(square);
            square.resize(Math.random());
            System.out.println("--------------------");
        }
    }
}
