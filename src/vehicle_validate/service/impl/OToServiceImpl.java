package vehicle_validate.service.impl;

import oop_review.extra_exercise.Oto;
import vehicle_validate.models.OTo;
import vehicle_validate.service.IPhuongTien;
import vehicle_validate.util.BienKSKhongHoply;
import vehicle_validate.util.ReadAndWrite;
import vehicle_validate.util.ValidateClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static vehicle_validate.util.ValidateClass.checkBienKSOto;
import static vehicle_validate.util.ValidateClass.checkNamSX;

public class OToServiceImpl implements IPhuongTien {
    private String bienKiemSoat, hangSanxuat, chuSoHuu, kieuXe,namSX, soGhe;
    List<OTo> oToList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        createBaseInfo();
        System.out.print("Nhập số ghế: ");
        soGhe = scanner.nextLine();
        boolean flag = true;
        String choice;
        do {
            System.out.println("A: Xe du lịch\n" +
                    "B: Xe khách\n" +
                    "Vui lòng chọn:");
            choice = scanner.nextLine().toUpperCase();
            switch (choice){
                case "A":
                    kieuXe = "Xe du lịch";
                    break;
                case "B":
                    kieuXe = "Xe khách";
                    break;
                default:
                    System.out.println("không hợp lệ");
                    flag = false;
                    break;
            }
        } while (!flag);


        OTo oTo = new OTo(bienKiemSoat, hangSanxuat, chuSoHuu, namSX, soGhe, kieuXe);

        oToList.add(oTo);

        ReadAndWrite.writeOtoFile(oToList, true);
    }

    @Override
    public void display() {
        List<OTo> oToList = ReadAndWrite.readOtoFile();
        System.out.println("--------Danh sách ô tô--------");
        for (int i=0; i<oToList.size(); i++) {
            System.out.println((i+1)+". "+oToList.get(i));
        }
    }

    public void search(){

    }

    @Override
    public void delete() {
        List<OTo> oToList = ReadAndWrite.readOtoFile();
        if (oToList.isEmpty()){
            boolean flag = true;
            do {
                System.out.println("Nhập biển số xe cần xóa: ");
                String xoaXe = scanner.nextLine();
                for (int i=0; i<oToList.size(); i++) {
                    if (xoaXe.equals(oToList.get(i).getBienKiemSoat())){
                        System.out.println("Bạn có muốn xóa xe này không YES/NO");
                        String delete = scanner.nextLine().toUpperCase();
                        if ("Y".contains(delete)){
                            oToList.remove(i);
                        } else {
                            break;
                        }
                        break;
                    } else {
                        System.out.println("Biển kiểm soát không tồn tại\n" +
                                "Vui lòng nhập lại");
                        flag = false;
                    }
                }
                ReadAndWrite.writeOtoFile(oToList, false);
            } while (!flag);

        }else {
            System.out.println("Danh sách không có phương tiện");
        }
    }

    public void createBaseInfo(){
        boolean isValidBienKS = false;
        do {
            System.out.print("Nhập biển kiểm soát:");
            bienKiemSoat = scanner.nextLine();
            isValidBienKS  = ValidateClass.checkBienKSOto(bienKiemSoat);
            if (isValidBienKS){
                System.out.println("Hợp lệ");
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (!isValidBienKS);

        boolean isValidNamSX = false;
        do {
            System.out.print("Nhập năm sản xuất:");
            namSX = scanner.nextLine();
            isValidNamSX  = ValidateClass.checkNamSX(namSX);
            if (isValidNamSX){
                System.out.println("Hợp lệ");
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (!isValidNamSX);

        System.out.print("Nhập chủ sở hữu:");
        chuSoHuu = scanner.nextLine();

        boolean flag = true;
        do {
            System.out.println("Danh sách hãng sản xuất: \n" +
                    "1. HSX-001,Yamaha,Nhật Bản\n" +
                    "2. HSX-002,Honda,Nhật Bản\n" +
                    "3. HSX-003, Dongfeng,Trung Quốc\n" +
                    "4. HSX-004, Huyndai,Hàn Quốc\n" +
                    "5. HSX-005, Ford,Mỹ\n" +
                    "6. HSX-006, Toyota,Nhật Bản\n" +
                    "7. HSX-007, Hino,Nhật Bản\n" +
                            "Vui lòng chọn hãng sản xuất");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    hangSanxuat = "Yamaha";
                    break;
                case 2:
                    hangSanxuat = "Honda";
                    break;
                case 3:
                    hangSanxuat = "Dongfeng";
                    break;
                case 4:
                    hangSanxuat = "Huyndai";
                    break;
                case 5:
                    hangSanxuat = "Ford";
                    break;
                case 6:
                    hangSanxuat = "Toyota";
                    break;
                case 7:
                    hangSanxuat = "Hino";
                    break;
                default:
                    System.out.println("Invalid!");
                    flag=false;
            }
        } while (!flag);
    }


}
