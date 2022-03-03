package oop_review.oop2.quan_ly_can_bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    List<Canbo> canbos=new ArrayList<>();
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
            choice= Integer.parseInt(input.nextLine());

            switch (choice){
                case 1:
                    System.out.print("Nhập tên: ");
                    String ten = String.valueOf(input.nextLine());
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = String.valueOf(input.nextLine());
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = String.valueOf(input.nextLine());
                    System.out.print("Nhập bậc: ");
                    int bac = Integer.parseInt(input.nextLine());
                    CongNhan congNhan = new CongNhan(ten, namSinh, gioiTinh, diaChi, bac);
//                    congNhanList.add(congNhan);
                    canbos.add(congNhan);
                    break;
                case 2:
                    System.out.print("Nhập tên: ");
                    String tenKysu = String.valueOf(input.nextLine());
                    System.out.print("Nhập năm sinh: ");
                    int namSinhKysu = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinhKysu = String.valueOf(input.nextLine());
                    System.out.print("Nhập địa chỉ: ");
                    String diaChiKysu = String.valueOf(input.nextLine());
                    System.out.print("Nhập ngành đào tạo: ");
                    String nganhDaotaoKysu = String.valueOf(input.nextLine());
                    KySu kySu = new KySu(tenKysu, namSinhKysu, gioiTinhKysu, diaChiKysu, nganhDaotaoKysu);
//                    kySuList.add(kySu);
                    canbos.add(kySu);
                    break;
                case 3:
                    System.out.print("Nhập tên: ");
                    String tenNhanvien = String.valueOf(input.nextLine());
                    System.out.print("Nhập năm sinh: ");
                    int namSinhNhanvien = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập giới tính: ");
                    String gioiTinhNhanvien = String.valueOf(input.nextLine());
                    System.out.print("Nhập địa chỉ: ");
                    String diaChiNhanvien = String.valueOf(input.nextLine());
                    System.out.print("Nhập công việc: ");
                    String congviecNhanvien = String.valueOf(input.nextLine());
                    NhanVien nhanVien = new NhanVien(tenNhanvien, namSinhNhanvien, gioiTinhNhanvien, diaChiNhanvien, congviecNhanvien);
//                    nhanVienList.add(nhanVien);
                    canbos.add(nhanVien);
                    break;
                default:
                    System.out.println("Nhập vào không hợp lệ");
                    break;
            }
        } while (choice!=0);
    }

    public void findByName(){
        System.out.print("Nhập tên cần tìm: ");
        String name = String.valueOf(input.nextLine());
        for (int i=0; i<canbos.size(); i++){
            if (canbos.get(i).getHoTen().equals(name)){
                System.out.println("tên: "+canbos.get(i).getHoTen() + ", giới tính: "+ canbos.get(i).getGioiTinh() +
                        ", địa chỉ: "+ canbos.get(i).getDiaChi() + ", năm sinh: "+ canbos.get(i).getNamSinh());
                break;
            }
        }

    }

    public void sortByName() {
        Collections.sort(canbos);
        System.out.println("Danh sách sau khi sắp xếp theo tên");
        for (int i = 0; i < canbos.size(); i++) {
            System.out.println("tên: "+canbos.get(i).getHoTen() + ", giới tính: "+ canbos.get(i).getGioiTinh() +
                    ", địa chỉ: "+ canbos.get(i).getDiaChi() + ", năm sinh: "+ canbos.get(i).getNamSinh());

        }
    }

    public void display(){
        System.out.println("Danh sách cán bộ:");
        for (int i = 0; i < canbos.size(); i++) {
            System.out.println("tên: "+canbos.get(i).getHoTen() + ", giới tính: "+ canbos.get(i).getGioiTinh() +
                    ", địa chỉ: "+ canbos.get(i).getDiaChi() + ", năm sinh: "+ canbos.get(i).getNamSinh()+
                    canbos.get(i).toString());

        }
    }


    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        quanLyCanBo.add();
        quanLyCanBo.findByName();
        quanLyCanBo.sortByName();
        quanLyCanBo.display();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số để kết thúc chương trình: ");
        int inputNumber= scanner.nextInt();
        System.exit(inputNumber);
    }
}
