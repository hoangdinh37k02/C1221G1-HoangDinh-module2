package oop_review.oop2.quan_ly_thi_sinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
    List<ThiSinh> thiSinhList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void add(){
        int choice;
        do {
            System.out.println("1. Nhập thí sinh khối A ");
            System.out.println("2. Nhập thí sinh khối B ");
            System.out.println("3. Nhập thí sinh khối C ");
            System.out.println("0. Thoát ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.print("Nhập số báo danh");
                    int soBD_khoiA= Integer.parseInt(input.nextLine());
                    System.out.print("Nhập họ tên");
                    String hoTen_khoiA= String.valueOf(input.nextLine());
                    System.out.print("Nhập địa chỉ");
                    String diaChi_khoiA= String.valueOf(input.nextLine());
                    System.out.print("Nhập điểm ưu tiên");
                    double diemUuTien_khoiA= Double.parseDouble(input.nextLine());
                    System.out.print("Nhập môn thi");
                    String monThi_khoiA= String.valueOf(input.nextLine());

                    KhoiA khoiA = new KhoiA(soBD_khoiA, hoTen_khoiA, diaChi_khoiA, diemUuTien_khoiA);
                case 2:
                case 3:
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice!=0);
    }
}
