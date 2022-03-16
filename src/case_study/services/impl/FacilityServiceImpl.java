package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()){
            System.out.println("Service"+element.getKey()+"; time of rental: "+element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addVilla() {
        System.out.print("Enter service name: ");
        String serviceName= scanner.nextLine();
        System.out.print("Enter usable area: ");
        double useArea= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter cost: ");
        double cost= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter maximum people: ");
        int numberOfPeople= Integer.parseInt(scanner.nextLine());

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.println("Choice type of rental (1: year; 2: month; 3: day; 4: hour");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    rentalType = rentalTypeArr[0];
                    break;
                case 2:
                    rentalType = rentalTypeArr[1];
                    break;
                case 3:
                    rentalType = rentalTypeArr[2];
                    break;
                case 4:
                     rentalType = rentalTypeArr[3];
                    break;
                default:
                    System.out.println("Invalid");
                    flag = true;
                    break;
            }
        } while (false);
        System.out.print("Enter room standard: ");
        String roomStandard= scanner.nextLine();
        System.out.print("Enter pool area: ");
        double poolArea= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter floor: ");
        int floor= Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(serviceName,useArea,cost,numberOfPeople,rentalType,roomStandard,poolArea,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Addition villa successful!");
    }

    @Override
    public void addHouse() {

        System.out.print("Enter service name: ");
        String serviceName= scanner.nextLine();
        System.out.print("Enter usable area: ");
        double useArea= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter cost: ");
        double cost= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter maximum people: ");
        int numberOfPeople= Integer.parseInt(scanner.nextLine());

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.println("Choice type of rental (1: year; 2: month; 3: day; 4: hour)");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    rentalType = rentalTypeArr[0];
                    break;
                case 2:
                    rentalType = rentalTypeArr[1];
                    break;
                case 3:
                    rentalType = rentalTypeArr[2];
                    break;
                case 4:
                    rentalType = rentalTypeArr[3];
                    break;
                default:
                    System.out.println("Invalid");
                    flag = true;
                    break;
            }
        } while (false);
        System.out.print("Enter room standard: ");
        String roomStandard= scanner.nextLine();
        System.out.print("Enter floor: ");
        int floor= Integer.parseInt(scanner.nextLine());

        House house = new House(serviceName,useArea,cost,numberOfPeople,rentalType,roomStandard,floor);
        facilityIntegerMap.put(house,0);
        System.out.println("Addition house successful!");
    }

    @Override
    public void addRoom() {
        System.out.print("Enter service name: ");
        String serviceName= scanner.nextLine();
        System.out.print("Enter usable area: ");
        double useArea= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter cost: ");
        double cost= Double.parseDouble(scanner.nextLine());
        System.out.print("Enter maximum people: ");
        int numberOfPeople= Integer.parseInt(scanner.nextLine());

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.println("Choice type of rental (1: year; 2: month; 3: day; 4: hour)");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    rentalType = rentalTypeArr[0];
                    break;
                case 2:
                    rentalType = rentalTypeArr[1];
                    break;
                case 3:
                    rentalType = rentalTypeArr[2];
                    break;
                case 4:
                    rentalType = rentalTypeArr[3];
                    break;
                default:
                    System.out.println("Invalid");
                    flag = true;
                    break;
            }
        } while (false);
        System.out.print("Enter extra service: ");
        String extraService= scanner.nextLine();


        Room room = new Room(serviceName,useArea,cost,numberOfPeople,rentalType,extraService);
        facilityIntegerMap.put(room,0);
        System.out.println("Addition room successful!");
    }
}
