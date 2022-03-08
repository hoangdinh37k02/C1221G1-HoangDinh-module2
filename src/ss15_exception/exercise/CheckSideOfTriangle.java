package ss15_exception.exercise;

import java.util.Scanner;

public class CheckSideOfTriangle {
    public static void main(String[] args) {
        CheckSideOfTriangle checkSideOfTriangle = new CheckSideOfTriangle();
        try {
            checkSideOfTriangle.check();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();

        } finally {
            System.out.println("End of program");
        }
    }

    public void check() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side 2: ");
        int side2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side 3: ");
        int side3 = Integer.parseInt(scanner.nextLine());

        if (side1<=0||side2<=0||side3<=0){
            throw new IllegalTriangleException("sides are invalid");
        } else if (side1+side2<=side3){
            throw new IllegalTriangleException("sides are invalid");
        } else if (side2+side3<=side1){
            throw new IllegalTriangleException("sides are invalid");
        } else if (side3+side1<=side2){
            throw new IllegalTriangleException("sides are invalid");
        } else {
            System.out.println("The triangle's sides are: "+side1+" "+side2+ " "+side3);
        }
    }
}
