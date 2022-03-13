package vehicle_validate.service.impl;

import vehicle_validate.models.OTo;
import vehicle_validate.models.XeTai;
import vehicle_validate.service.IPhuongTien;
import vehicle_validate.util.ReadAndWrite;
import vehicle_validate.util.ValidateClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static vehicle_validate.util.ValidateClass.checkNamSX;

public class XeTaiServiceImpl implements IPhuongTien {
    private String bienKiemSoat, hangSanxuat, chuSoHuu, namSX;
    private int trongTai;

    List<XeTai> xeTaiList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        createBaseInfo();
        System.out.print("Nhập trọng tải: ");
        trongTai = Integer.parseInt(scanner.nextLine());

        XeTai  xeTai=new XeTai(bienKiemSoat, hangSanxuat, chuSoHuu, namSX, trongTai);

        xeTaiList.add(xeTai);
        ReadAndWrite.writeXeTaiFile(xeTaiList, true);
    }

    @Override
    public void display() {
        List<XeTai> xeTaiList = ReadAndWrite.readXeTaiFile();
        System.out.println("--------Danh sách xe tải--------");
        for (int i=0; i<xeTaiList.size(); i++) {
            System.out.println((i+1)+". "+xeTaiList.get(i));
        }
    }

    @Override
    public void delete() {

    }

    public void createBaseInfo(){
        boolean isValidHangSX = false;
        do {
            System.out.print("Nhập biển kiểm soát:");
            bienKiemSoat = scanner.nextLine();
            isValidHangSX  = ValidateClass.checkBienKSXeTai(bienKiemSoat);
            if (isValidHangSX){
                System.out.println("Hợp lệ");
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (!isValidHangSX);

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
