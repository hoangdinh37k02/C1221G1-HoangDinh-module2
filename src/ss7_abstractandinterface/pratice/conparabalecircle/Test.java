package ss7_abstractandinterface.pratice.conparabalecircle;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(2.0,"red", false);
        comparableCircles[2] = new ComparableCircle(0.5, "green", true);

        System.out.println("pre-sort");
        for (ComparableCircle i: comparableCircles)
        System.out.println(i);

        System.out.println("after-sort");
        Arrays.sort(comparableCircles);
        for (ComparableCircle i: comparableCircles)
            System.out.println(i);
    }
}
