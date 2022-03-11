package vehicle_validate.controller;

import vehicle_validate.service.impl.OToServiceImpl;
import vehicle_validate.service.impl.XeMayServiceImpl;
import vehicle_validate.service.impl.XeTaiServiceImpl;

import java.util.Scanner;

public class Controller {
    OToServiceImpl oToService = new OToServiceImpl();
    XeMayServiceImpl xeMayService = new XeMayServiceImpl();
    XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void main(){
        int choice;
        do {
            System.out.println("---------------------------\n" +
                    "CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n" +
                    "Vui lòng chọn chức năng:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice!=4);
    }
}
