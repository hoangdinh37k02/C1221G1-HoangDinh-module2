package ss2_loop.exercise;

import java.util.Scanner;

public class ShowGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice !=0) {
            System.out.println("MENU");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice");

            choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i=0; i<4; i++) {
                        for (int j=0; j<15; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    for (int i=0; i<=4; i++){
                        for (int j=0; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i=5; i>=0; i--){
                        for (int j=0; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("no choice");
            }
        }
    }
}
