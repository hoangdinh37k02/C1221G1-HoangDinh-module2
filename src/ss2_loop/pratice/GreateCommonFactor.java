package ss2_loop.pratice;

import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("Enter number a");
        a = input.nextInt();
        System.out.println("Enter number b");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a==0||b==0) {
            System.out.println("no greatest common factor");
        } else {
            while (a!=b) {
                if (a>b){
                    a=a-b;
                } else {
                    b=b-a;
                }
            }
            System.out.println(a + " is the greatest common factor");
        }
    }
}
