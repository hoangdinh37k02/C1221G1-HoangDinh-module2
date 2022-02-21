package ss2_loop.pratice;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice!=0){
            System.out.println("MENU");
            System.out.println("1. Draw triangle");
            System.out.println("2. Draw retangle");
            System.out.println("3. Draw square");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                case 2:
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    break;
                case 3:
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
