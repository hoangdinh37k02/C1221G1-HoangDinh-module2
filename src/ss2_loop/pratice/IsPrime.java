package ss2_loop.pratice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number<2){
            System.out.println(number+" is not a prime");
        } else {
            int i = 2;
            boolean is_prime = true;
            while (i<number) {
                if (number%i==0) {
                    is_prime=false;

                }
                i++;
            }
            if (is_prime){
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
