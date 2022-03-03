package oop_review.oop2.quan_ly_can_bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    List<CongNhan> congNhanList=new ArrayList<>();
    List<KySu> kySuList=new ArrayList<>();
    List<NhanVien> nhanVienList=new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void add(){
        int choice;
        do {
            System.out.println("1. Thêm công nhân");
            System.out.println("2. Thêm kỹ sư");
            System.out.println("3. Thêm nhân viên");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng chọn");
            choice= input.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Nhập tên: ");
                    String ten = input.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = input.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = input.nextLine();
                    System.out.print("Nhập công việc: ");
                    int bac = Integer.parseInt(input.nextLine());
                    CongNhan congNhan = new CongNhan(ten, namSinh, gioiTinh, diaChi, bac);
                    congNhanList.add(congNhan);
                    break;
                case 2:
                    System.out.print("Nhập tên: ");
                    String tenKysu = input.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinhKysu = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinhKysu = input.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChiKysu = input.nextLine();
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaotaoKysu = input.nextLine();
                    KySu kySu = new KySu(tenKysu, namSinhKysu, gioiTinhKysu, diaChiKysu, nganhDaotaoKysu);
                    kySuList.add(kySu);
                    break;
                case 3:
                    System.out.print("Nhập tên: ");
                    String tenNhanvien = input.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinhNhanvien = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinhNhanvien = input.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChiNhanvien = input.nextLine();
                    System.out.print("Nhập công việc: ");
                    String congviecNhanvien = input.nextLine();
                    NhanVien nhanVien = new NhanVien(tenNhanvien, namSinhNhanvien, gioiTinhNhanvien, diaChiNhanvien, congviecNhanvien);
                    nhanVienList.add(nhanVien);
                    break;
            }
        } while (choice!=0);
    }

    public void findByName(){
        System.out.print("Nhập tên cần tìm: ");
        String name = input.nextLine();
        
    }
}
