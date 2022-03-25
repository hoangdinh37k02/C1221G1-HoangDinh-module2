package extra_exercise2.controller;

import extra_exercise2.service.impl.AuthenticPhoneServiceImpl;
import extra_exercise2.service.impl.HandPhoneServiceImpl;
import extra_exercise2.util.NotFoundProductException;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    AuthenticPhoneServiceImpl authenticPhoneService = new AuthenticPhoneServiceImpl();
    HandPhoneServiceImpl handPhoneService = new HandPhoneServiceImpl();
    public void mainMenu(){
        String choice;
        do {
            System.out.println("------PHONE MANAGEMENT SYSTEM------\n" +
                    "1. Add\n" +
                    "2. Delete\n" +
                    "3. Display\n" +
                    "4. Search\n" +
                    "5. Exit\n" +
                    "Please choice!");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    add();
                    break;
                case "2":
                    delete();
                    break;
                case "3":
                    display();
                    break;
                case "4":
                    search();
                    break;
                case "5":
                    System.exit(5);
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
            }
        } while (!"5".equals(choice));
    }

    private void search() {
        boolean flag = false;
        int choice= 0;
        do {
            System.out.println("1. Search authentic phone\n" +
                    "2. Search hand phone\n" +
                    "3. Return to main menu\n" +
                    "Please choice!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    try {
                        authenticPhoneService.search();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        handPhoneService.search();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
                    flag = true;
                    break;
            }
        } while (flag);
    }

    private void display() {
        boolean flag = false;
        int choice= 0;
        do {
            System.out.println("1. Display authentic phone\n" +
                    "2. Display hand phone\n" +
                    "3. Return to main menu\n" +
                    "Please choice!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    authenticPhoneService.display();
                    break;
                case 2:
                    handPhoneService.display();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
                    flag = true;
                    break;
            }
        } while (flag);
    }

    private void delete() {
        boolean flag = false;
        int choice= 0;
        do {
            System.out.println("1. Delete authentic phone\n" +
                    "2. Delete hand phone\n" +
                    "3. Return to main menu\n" +
                    "Please choice!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    try {
                        authenticPhoneService.delete();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        handPhoneService.delete();
                    } catch (NotFoundProductException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
                    flag = true;
                    break;
            }
        } while (flag);
    }

    private void add() {
        boolean flag = false;
        int choice= 0;
        do {
            System.out.println("1. Add authentic phone\n" +
                    "2. Add hand phone\n" +
                    "3. Return to main menu\n" +
                    "Please choice!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    authenticPhoneService.add();
                    break;
                case 2:
                    handPhoneService.add();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
                    flag = true;
                    break;
            }
        } while (flag);
    }
}
