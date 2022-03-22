package extra_exercise.service.impl;

import extra_exercise.model.BenhNhanThuong;
import extra_exercise.model.BenhNhanVIP;
import extra_exercise.service.IBenhNhan;
import extra_exercise.ultil.NotFoundFileException;
import extra_exercise.ultil.ReadAndWrite;
import extra_exercise.ultil.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhNhanVIPServiceImpl implements IBenhNhan {

    static List<BenhNhanVIP> benhNhanVIPList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String MA_BENH_AN = "^[B][A]\\-\\d{3}$";
    static final String CHECK_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    @Override
    public void add() {
        int soThuTu = 1;
        benhNhanVIPList = ReadAndWrite.readBenhNhanVIP();
        if (!benhNhanVIPList.isEmpty()){
            soThuTu=benhNhanVIPList.size()+1;
        }
        System.out.print("Nhập mã bệnh án (BA-XXX): ");
        String maBenhAn = Validate.regexStr(scanner.nextLine(), MA_BENH_AN, "Không hợp lệ");
        System.out.print("Nhập tên bệnh nhân: ");
        String tenBenhNhan = scanner.nextLine();
        System.out.print("Nhập tên ngày nhập viện dd/mm/yyyy: ");
        String ngayNhapvien = Validate.regexStr(scanner.nextLine(), CHECK_DATE,"Không hợp lệ");
        System.out.print("Nhập tên ngày xuất viện dd/mm/yyy: ");
        String ngayXuatvien = Validate.regexStr(scanner.nextLine(), CHECK_DATE,"Không hợp lệ");
        System.out.print("Nhập tên lý do: ");
        String lydo = scanner.nextLine();
        String[] vipList = {"VIP 1", "VIP 2", "VIP 3"};
        int choice = 0;
        boolean flag = true;
        String loaiVip = null;
        do {
            System.out.println("Chọn gói VIP (1. VIP 1; 2. VIP 2, 3. VIP 3)");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    loaiVip = vipList[0];
                    break;
                case 2:
                    loaiVip = vipList[1];
                    break;
                case 3:
                    loaiVip = vipList[2];
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng chọn lại");
                    flag=false;
                    break;
            }
        }while (!flag);
        System.out.print("Nhập thời hạn VIP: ");
        String thoiHan = Validate.regexStr(scanner.nextLine(), CHECK_DATE,"Không hợp lệ");

        BenhNhanVIP benhNhanVIP = new BenhNhanVIP(soThuTu,maBenhAn,tenBenhNhan,ngayNhapvien,
                ngayXuatvien,lydo,loaiVip,thoiHan);
        benhNhanVIPList.add(benhNhanVIP);
        ReadAndWrite.writeBenhNhanVIP(benhNhanVIPList, false);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display() {
        List<BenhNhanVIP> benhNhanVIPList = ReadAndWrite.readBenhNhanVIP();
        System.out.println("=====Danh sách bệnh nhân VIP=====");
        for (BenhNhanVIP benhNhanVIP:benhNhanVIPList) {
            System.out.println(benhNhanVIP.toString());
        }
    }

    @Override
    public void delete() throws NotFoundFileException {
        List<BenhNhanVIP> benhNhanVIPList = ReadAndWrite.readBenhNhanVIP();
        display();
        boolean flag = true;
        while (flag){
            System.out.print("Nhập bệnh án cần xóa (BA-XXX): ");
            String maBenhAn = scanner.nextLine();
            for (int i =0; i<benhNhanVIPList.size(); i++) {
                if (maBenhAn.equals(benhNhanVIPList.get(i).getMaBenhAn())){
                    flag = false;
                    System.out.println(benhNhanVIPList.get(i).toString()+"\n" +
                            "Bạn có muốn xóa bệnh nhân này Y/N");
                    String decide = scanner.nextLine().toUpperCase();
                    if ("Y".contains(decide)){
                        benhNhanVIPList.remove(i);
                        ReadAndWrite.writeBenhNhanVIP(benhNhanVIPList, false);
                        break;
                    } else {
                        System.out.println("Trở về main menu");
                        break;
                    }
                } else {
                    throw new NotFoundFileException("Bệnh án không tồn tại\n" +
                            "Vui lòng trở về menu chính");
                }
            }
            System.out.println("Bệnh án không tồn tại\n" +
                    "Vui lòng nhập lại");
        }
    }
}
