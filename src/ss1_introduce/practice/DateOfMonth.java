package ss1_introduce.practice;

import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Which month do you want to count?");
        int month = scaner.nextInt();

        switch (month) {
            case 2:
                System.out.println("Month 2 has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("month " + month + " has 30 days");
                break;
            default:
                System.out.println("unvalid input");
        }
    }
}
