package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu(){
        int choice;
        do {
            System.out.println(" 1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Managerment\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "Please choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    int choice1;
                    do {
                        System.out.println("1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n" +
                                "Please choice");
                        choice1=Integer.parseInt(scanner.nextLine());
                        switch (choice1){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ\n" +
                                        "Please choice again");
                                break;
                        }
                    } while (choice1!=4);
                    break;
                case 2:
                    int choice2;
                    do {
                        System.out.println("1\tDisplay list customers\n" +
                                "2\tAdd new customer\n" +
                                "3\tEdit customer\n" +
                                "4\tReturn main menu\n" +
                                "Please choice");
                        choice2=Integer.parseInt(scanner.nextLine());
                        switch (choice2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ\n" +
                                        "Please choice");
                                break;
                        }
                    } while (choice2!=4);
                    break;
                case 3:
                    int choice3;
                    do {
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n" +
                                "Please choice");
                        choice3=Integer.parseInt(scanner.nextLine());
                        switch (choice3){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid\n" +
                                        "Please choice again");
                                break;
                        }
                    } while (choice3!=4);
                    break;
                case 4:
                    int choice4;
                    do {
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new constracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n" +
                                "Please choice");
                        choice4=Integer.parseInt(scanner.nextLine());
                        switch (choice4){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Invalid\n" +
                                        "Please choice again");
                                break;
                        }
                    } while (choice4!=6);
                    break;
                case 5:
                    int choice5;
                    do {
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3\tReturn main menu\n" +
                                "Please choice");
                        choice5=Integer.parseInt(scanner.nextLine());
                        switch (choice5){
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid\n" +
                                        "Please choice again");
                                break;
                        }
                    } while (choice5!=3);
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again");
                    break;
            }
        } while (choice!=6);
    }
}
