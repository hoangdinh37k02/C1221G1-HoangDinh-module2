package ss1_introduce.exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input quantity of dollor you want to change to VND");

        double dollor = scanner.nextDouble();
        double result = dollor*22400;
        System.out.println("Total is: " + result + "VND");
    }
}
