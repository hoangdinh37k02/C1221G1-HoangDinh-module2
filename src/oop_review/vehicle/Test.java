package oop_review.vehicle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int choice;
        Vehicle vehicle1=new Vehicle();
        do {
            System.out.println("Menu công việc:");
            System.out.println("1. Nhập thông tin xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế các xe");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập giá trị xe ");
                    vehicle1.setValue(input.nextInt());
                    System.out.println("Nhập dung tích xi lanh:");
                    vehicle1.setCylinder(input.nextDouble());
                    System.out.println(vehicle1.toString());
                    System.out.println("Vui lòng chọn tiếp mục 2 để tính thuế cho phương tiện của bạn, nếu bạn muốn nhập lại thông tin phương tin thì chọn mục 1");
                    break;
                case 2:
                    System.out.println(vehicle1.toString());
                    Double display = vehicle1.getTax();
                    System.out.println("Số tiền thuế cho xe của bạn là: "+display + " VND");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice!=0);

    }
}
