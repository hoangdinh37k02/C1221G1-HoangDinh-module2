package ss4_oop.pratice;

import ss7_abstractandinterface.exercise.interfacecolorable.ReTangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width");
        rectangle.width=input.nextDouble();
        System.out.println("Enter the height");
        rectangle.height=input.nextDouble();

        System.out.println(rectangle.display());
    }
}
