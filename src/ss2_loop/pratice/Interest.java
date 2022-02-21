package ss2_loop.pratice;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money, rate;
        int month;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of month");
        month = input.nextInt();

        System.out.println("Enter anual interest rate");
        rate = input.nextDouble();

        double totalmoney = money * (rate/12) * month;
        System.out.println("Total money: " + totalmoney);
    }
}
