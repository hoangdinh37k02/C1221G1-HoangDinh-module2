package extra_exercise1.controller;

import extra_exercise1.service.impl.ExportProductServiceImpl;
import extra_exercise1.service.impl.ImportProductServiceImpl;
import extra_exercise1.util.NotFoundProductException;

import java.util.Scanner;

public class Controller {
    ImportProductServiceImpl importProductService = new ImportProductServiceImpl();
    ExportProductServiceImpl exportProductService= new ExportProductServiceImpl();
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
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Không hợp lệ!\n" +
                        "Vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
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

    private void search() {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        boolean flag = true;
        do {
            System.out.println("1. Tìm sản phẩm nhập khẩu\n" +
                    "2. Tìm sản phẩm xuất khẩu\n" +
                    "3. Về menu chính\n" +
                    "Vui lòng chọn!");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Không hợp lệ!\n" +
                        "Vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    importProductService.search();
                    break;
                case 2:
                    exportProductService.search();
                    break;
                default:
                    System.out.println("Không hợp hệ\n" +
                            "Vui lòng nhập lại!");
                    flag = false;
                    break;
            }
        } while (!flag);
    }

    private void delete() {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        boolean flag = true;
        do {
            System.out.println("1. Xóa sản phẩm nhập khẩu\n" +
                    "2. Xóa sản phẩm xuất khẩu\n" +
                    "3. Về menu chính\n" +
                    "Vui lòng chọn!");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Không hợp lệ!\n" +
                        "Vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    try {
                        importProductService.delete();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        exportProductService.delete();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng nhập lại!");
                    flag = false;
                    break;
            }
        } while (!flag);
    }

    private void display() {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        boolean flag = true;
        do {
            System.out.println("1. Hiển thị sản phẩm nhập khẩu\n" +
                    "2. Hiển thị sản phẩm xuất khẩu\n" +
                    "3. Về menu chính\n" +
                    "Vui lòng chọn!");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Không hợp lệ!\n" +
                        "Vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    importProductService.display();
                    break;
                case 2:
                    exportProductService.display();
                    break;
                default:
                    System.out.println("Không hợp hệ\n" +
                            "Vui lòng nhập lại!");
                    flag = false;
                    break;
            }
        } while (!flag);
    }

    private void add() {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        boolean flag = true;
        do {
            System.out.println("1. Thêm sản phẩm nhập khẩu\n" +
                    "2. Thêm sản phẩm xuất khẩu\n" +
                    "3. Về menu chính\n" +
                    "Vui lòng chọn!");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Không hợp lệ!\n" +
                        "Vui lòng nhập lại");
            }
            switch (choice){
                case 1:
                    importProductService.add();
                    break;
                case 2:
                    exportProductService.add();
                    break;
                default:
                    System.out.println("Không hợp lệ\n" +
                            "Vui lòng chọn lại!");
                    flag = false;
                    break;
            }
        } while (!flag);
    }
}
