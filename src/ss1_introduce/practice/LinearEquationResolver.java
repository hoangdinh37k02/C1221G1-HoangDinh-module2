package ss1_introduce.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as: 'a * x + b = 0', please enter constants");

        Scanner scaner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scaner.nextDouble();

        System.out.println("b: ");
        double b = scaner.nextDouble();

        if (a != 0) {
            double answer = -b/a;
            System.out.println("Equation pass x is: " + answer);
        } else if (b == 0){
            System.out.println("The solution is all x");
        } else {
            System.out.println("No solution");
        }
    }
}
