package extra_exercise.service.impl;

import extra_exercise.model.BenhNhanThuong;
import extra_exercise.model.BenhNhanVIP;
import extra_exercise.service.IBenhNhan;
import extra_exercise.ultil.NotFoundFileException;
import extra_exercise.ultil.ReadAndWrite;
import extra_exercise.ultil.Validate;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhNhanThuongServiceImpl implements IBenhNhan {
    static List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static final String MA_BENH_AN = "^[B][A]\\-\\d{3}$";
    static final String MA_BENH_NHAN = "^[B][N]\\-\\d{3}$";
    static final String CHECK_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    @Override
    public void add() {
        int soThuTu = 1;
        benhNhanThuongList = ReadAndWrite.readBenhNhanThuong();
        if (!benhNhanThuongList.isEmpty()){
            soThuTu=benhNhanThuongList.size()+1;
        }
        System.out.print("Nhập mã bệnh án (BA-XXX): ");
        String maBenhAn = Validate.regexStr(scanner.nextLine(), MA_BENH_AN, "Không hợp lệ");
        System.out.print("Nhập tên bệnh nhân: ");
        String tenBenhNhan = scanner.nextLine();
        System.out.print("Nhập tên ngày nhập viện dd/mm/yyyy: ");
        String ngayNhapvien = Validate.regexStr(scanner.nextLine(), CHECK_DATE,"Không hợp lệ");
        System.out.print("Nhập tên ngày xuất viện dd/mm/yyyy: ");
        String ngayXuatvien = Validate.regexStr(scanner.nextLine(), CHECK_DATE,"Không hợp lệ");
        System.out.print("Nhập tên lý do: ");
        String lyDo = scanner.nextLine();
        System.out.print("Nhập viện phí: ");
        double vienPhi = Double.parseDouble(scanner.nextLine());
        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(soThuTu,maBenhAn,tenBenhNhan,ngayNhapvien,ngayXuatvien,lyDo,vienPhi);
        benhNhanThuongList.add(benhNhanThuong);
        ReadAndWrite.writeBenhNhanThuong(benhNhanThuongList,false);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display() {
        List<BenhNhanThuong> benhNhanThuongList = ReadAndWrite.readBenhNhanThuong();
        System.out.println("=====Danh sách bệnh nhân thường=====");
        for (BenhNhanThuong benhNhanThuong: benhNhanThuongList) {
            System.out.println(benhNhanThuong.toString());
        }

    }

    @Override
    public void delete () throws NotFoundFileException {
        List<BenhNhanThuong> benhNhanThuongList = ReadAndWrite.readBenhNhanThuong();
        display();
        boolean flag = true;
        while (flag){
            System.out.print("Nhập bệnh án cần xóa (BA-XXX): ");
            String maBenhAn = scanner.nextLine();
            for (int i =0; i<benhNhanThuongList.size(); i++) {
                if (maBenhAn.equals(benhNhanThuongList.get(i).getMaBenhAn())){
                    flag = false;
                    System.out.println(benhNhanThuongList.get(i).toString()+"\n" +
                            "Bạn có muốn xóa bệnh nhân này Y/N");
                    String decide = scanner.nextLine().toUpperCase();
                    if ("Y".contains(decide)){
                        benhNhanThuongList.remove(i);
                        ReadAndWrite.writeBenhNhanThuong(benhNhanThuongList, false);
                        System.out.println("Xóa thành công");
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
        }
    }
}
