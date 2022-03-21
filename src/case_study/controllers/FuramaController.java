package case_study.controllers;

import case_study.models.Booking;
import case_study.models.Employee;
import case_study.services.impl.BookingServiceImpl;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu(){
        int choice = 0;
        do {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n" +
                    "Please choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice){
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManager();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
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

    public void employeeManagement(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choice1=0;
        do {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice1 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice1){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice1!=4);
    }

    public void customerManager(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choice2=0;
        do {
            System.out.println("1\tDisplay list customers\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice2){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice2!=4);
    }

    public void facilityManagement(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        int choice3=0;
        do {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice3 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice3){
                case 1:
                    displayFacility();
                    displayMainMenu();
                    break;
                case 2:
                    addNewFacility();
                    displayMainMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Please choice again");
                    displayMainMenu();
                    break;
            }
        } while (choice3!=4);
    }

    public void displayFacility(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        int choice6=0;
        do {
            System.out.println("1\tDisplay Villa\n" +
                    "2\tDisplay House\n" +
                    "3\tDisplay Room\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice6 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice6){
                case 1:
                    facilityService.displayVilla();
                    facilityManagement();
                    break;
                case 2:
                    facilityService.displayHouse();
                    facilityManagement();
                    break;
                case 3:
                    facilityService.displayRoom();
                    facilityManagement();
                    break;
                default:
                    System.out.println("Please choice again");
                    displayMainMenu();
                    break;
            }
        } while (choice6!=4);
    }

    public void addNewFacility(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        int choice5=0;
        do {
            System.out.println("1\tAdd new Villa\n" +
                    "2\tAdd new House\n" +
                    "3\tAdd new Room\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice5 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice5){
                case 1:
                    facilityService.addVilla();
                    facilityManagement();
                    break;
                case 2:
                    facilityService.addHouse();
                    facilityManagement();
                    break;
                case 3:
                    facilityService.addRoom();
                    facilityManagement();
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice5!=4);
    }

    public void bookingManagement(){
        BookingServiceImpl bookingService = new BookingServiceImpl();
        int choice4=0;
        do {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n" +
                    "Please choice");
            try {
                choice4 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice4){
                case 1:
                    addNewBooking();
                    break;
                case 2:
                    displayBooking();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice4!=6);
    }

    public void addNewBooking(){
        BookingServiceImpl bookingService=new BookingServiceImpl();
        int choice7=0;
        do {
            System.out.println("1\tAdd villa booking\n" +
                    "2\tAdd house booking\n" +
                    "3\tAdd room booking\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice7 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice7){
                case 1:
                    bookingService.addBookingVilla();
                    bookingManagement();
                    break;
                case 2:
                    bookingService.addBookingHouse();
                    bookingManagement();
                    break;
                case 3:
                    bookingService.addBookingRoom();
                    bookingManagement();
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice7!=4);
    }

    public void displayBooking(){
        BookingServiceImpl bookingService=new BookingServiceImpl();
        int choice8=0;
        do {
            System.out.println("1\tDisplay villa booking\n" +
                    "2\tDisplay house booking\n" +
                    "3\tDisplay room booking\n" +
                    "4\tReturn main menu\n" +
                    "Please choice");
            try {
                choice8 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice8){
                case 1:
                    bookingService.displayVilla();
                    bookingManagement();
                    break;
                case 2:
                    bookingService.displayHouse();
                    bookingManagement();
                    break;
                case 3:
                    bookingService.displayRoom();
                    bookingManagement();
                    break;
                default:
                    System.out.println("Please choice again");
                    break;
            }
        } while (choice8!=4);
    }

    public void promotionManagement(){
        int choice5=0;
        do {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3\tReturn main menu\n" +
                    "Please choice");
            try {
                choice5 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
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
    }
}
