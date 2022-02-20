package ss1_introduce.practice;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check your body mass index");
        System.out.println("Please input your weight (kg)");
        int weight = scanner.nextInt();
        System.out.println("Please input your height (met)");
        double height = scanner.nextDouble();
        double bmi = weight / (height*height);
        if (bmi<18.5) {
            System.out.println("Your body is underweight");
        } else if (bmi<25) {
            System.out.println("Your body is normal");
        } else if (bmi<30) {
            System.out.println("Your body is overweight");
        } else {
            System.out.println("Your body is Obese");
        }
    }
}
