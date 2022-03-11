package vehicle_validate.service.impl;

import oop_review.extra_exercise.Oto;
import vehicle_validate.models.OTo;
import vehicle_validate.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToServiceImpl implements IPhuongTien {
    private String bienKiemSoat, hangSanxuat, chuSoHuu, kieuXe;
    private int namSX, soGhe;
    List<OTo> oToList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    public void createBaseInfo(){
        System.out.print("Nhập biển kiểm soát:");
        bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập biển kiểm soát:");
        bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập biển kiểm soát:");
        bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập biển kiểm soát:");
        bienKiemSoat = scanner.nextLine();
    }

    public String getBaseInfo(){
        return this.bienKiemSoat+","+this.hangSanxuat+","+this.chuSoHuu+","+this.namSX+","+this.soGhe+","+this.kieuXe;
    }
}
