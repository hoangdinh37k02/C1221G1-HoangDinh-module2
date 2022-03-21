package extra_exercise.controller;

import extra_exercise.service.impl.BenhNhanThuongServiceImpl;
import extra_exercise.service.impl.BenhNhanVIPServiceImpl;
import extra_exercise.ultil.NotFoundFileException;

import javax.swing.*;
import java.util.Scanner;

public class Controller {
    BenhNhanThuongServiceImpl benhNhanThuongService = new BenhNhanThuongServiceImpl();
    BenhNhanVIPServiceImpl benhNhanVIPService = new BenhNhanVIPServiceImpl();
    public void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choice=0;
        do {
            System.out.println("====CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN====\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách bệnh án\n" +
                    "4. Thoát\n" +
                    "Vui lòng chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themBenhNhan();
                    break;
                case 2:
                    xoaBenhNhan();
                    break;
                case 3:
                    hienThiBenhNhan();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng chọn lại");
                    break;
            }
        } while (choice!=4);
    }

    private void xoaBenhNhan() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Xóa bệnh nhân thường\n" +
                    "2. Xóa bệnh nhân VIP\n" +
                    "Vui lòng chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    benhNhanThuongService.delete();
                    mainMenu();
                    break;
                case 2:
                    benhNhanVIPService.delete();
                    mainMenu();
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng nhập lại");
                    flag = false;
                    break;
            }
        }while (!flag);
    }

    private void themBenhNhan() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Thêm bệnh nhân thường\n" +
                    "2. Thêm bệnh nhân VIP\n" +
                    "Vui lòng chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    benhNhanThuongService.add();
                    mainMenu();
                    break;
                case 2:
                    benhNhanVIPService.add();
                    mainMenu();
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng nhập lại");
                    flag = false;
                    break;
            }
        }while (!flag);
    }

    private void hienThiBenhNhan() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Hiển thị bệnh nhân thường\n" +
                    "2. Hiển bệnh nhân VIP\n" +
                    "Vui lòng chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    benhNhanThuongService.display();
                    mainMenu();
                    break;
                case 2:
                    benhNhanVIPService.display();
                    mainMenu();
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng nhập lại");
                    flag = false;
                    break;
            }
        }while (!flag);
    }
}
