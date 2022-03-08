package ss15_exception.practice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập y: ");
        int y = Integer.parseInt(scanner.nextLine());

        CalculationExample cal  =new CalculationExample();
        cal.calculate(x,y);
    }

    public void calculate(int x, int y){
        try{
            System.out.println("Tổng: "+x+y);
            System.out.println("Hiệu: "+(x-y));
            System.out.println("Tích: "+ x*y);
            System.out.println("THương: "+ x/y);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: "+ e.getMessage());

        }
    }
}
