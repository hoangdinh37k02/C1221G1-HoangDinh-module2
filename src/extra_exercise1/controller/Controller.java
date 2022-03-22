package extra_exercise1.controller;

import java.util.Scanner;

public class Controller {
    public void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM=====\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách sản phẩm\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng nhập lại!");
                    break;
            }
        } while (choice!=5);
    }

    private void add() {

    }
}
