package ss7_abstractandinterface.pratice.comparatorcircle;

import ss7_abstractandinterface.pratice.conparabalecircle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]=new Circle(2.5, "violet", true);
        circles[1]=new Circle();
        circles[2]=new Circle(1.5,"white", false);

        System.out.println("pre-sort");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        System.out.println("after-sort");
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles, circleComparator);
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
