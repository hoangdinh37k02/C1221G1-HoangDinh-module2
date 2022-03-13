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
            System.out.println("---------------------------------------------\n" +
                    "CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n" +
                    "Vui lòng chọn chức năng:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    boolean flag = true;
                    do {
                        System.out.println("1. Thêm ô tô:\n" +
                                "2. Thêm xe máy:\n" +
                                "3. Thêm xe tải\n" +
                                "Vui lòng chọn");
                        int choice1=Integer.parseInt(scanner.nextLine());
                        switch (choice1){
                            case 1:
                                oToService.add();
                                break;
                            case 2:
                                xeMayService.add();
                                break;
                            case 3:
                                xeTaiService.add();
                                break;
                            default:
                                System.out.println("Không hợp lệ");
                                flag = false;
                                break;
                        }
                    } while (!flag);
                    break;
                case 2:
                    oToService.display();
                    xeMayService.display();
                    xeTaiService.display();
                    break;
                case 3:
                    boolean flag1 = true;
                    do {
                        System.out.println("1. Xóa ô tô:\n" +
                                "2. Xóa xe máy:\n" +
                                "3. Xóa xe tải\n" +
                                "Vui lòng chọn");
                        int choice2=Integer.parseInt(scanner.nextLine());
                        switch (choice2){
                            case 1:
                                oToService.display();
                                oToService.delete();
                                break;
                            case 2:
                                xeMayService.add();
                                break;
                            case 3:
                                xeTaiService.add();
                                break;
                            default:
                                System.out.println("Không hợp lệ");
                                flag1 = false;
                                break;
                        }
                    } while (!flag1);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice!=4);
    }
}
