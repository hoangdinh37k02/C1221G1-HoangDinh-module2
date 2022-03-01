package oop_review.extra_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Oto> otoList = new ArrayList<>();
        otoList.add(new Oto("75H7652", "TOYOTA", 2015, "Hai", 23, "Dulich"));
        System.out.println(otoList.get(0));
        Scanner input=new Scanner(System.in);
        int choice;
        int addingChoice;
        int displayChoice;
        String deleteNumberPlate;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng lựa chọn");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    do {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ô tô");
                        System.out.println("3. Thêm xe máy");
                        System.out.println("4. Thoát");
                        System.out.println("Vui lòng lựa chọn");
                        addingChoice=input.nextInt();

                        switch (addingChoice){
                            case 1:
//                                truck.add()
                            case 2:
//                                oto.add()
                            case 3:
//                                motor.add()
                            case 4:
                                System.exit(4);
                        }
                    } while (addingChoice!=4);
                case 2:
                    do {
                        System.out.println("1. Hiển thị xe tải");
                        System.out.println("2. Hiển thị ô tô");
                        System.out.println("3. Hiển thị xe máy");
                        System.out.println("4. Thoát");
                        System.out.println("Vui lòng lựa chọn");
                        displayChoice=input.nextInt();

                        switch (displayChoice){
                            case 1:
//                                truck.display()
                            case 2:
//                                oto.display()
                            case 3:
//                                motor.display()
                            case 4:
                                System.exit(4);
                        }
                    } while (displayChoice!=4);
                case 3:
                    System.out.println("Vui lòng nhập biển số xe cần xóa: ");
                    deleteNumberPlate = input.nextLine();
                case 4:
                    System.exit(4);
            }
        } while (choice!=4);
    }
}
