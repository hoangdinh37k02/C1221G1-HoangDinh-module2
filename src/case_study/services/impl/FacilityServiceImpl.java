package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.IFacilityService;
import case_study.utils.ReadAndWriteCSV;
import case_study.utils.Validate;
import vehicle_validate.util.ReadAndWrite;

import java.nio.channels.IllegalChannelGroupException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static final String CHECK_VILLA_SERVICE_CODE = "^[S][V][V][L]\\-\\d{4}$";
    static final String CHECK_HOUSE_SERVICE_CODE = "^[S][V][H][O]\\-\\d{4}$";
    static final String CHECK_ROOM_SERVICE_CODE = "^[S][V][R][O]\\-\\d{4}$";
    static final String CHECK_SERVICE_NAME = "^[A-Z][a-z]{0,}$";
    static final String CHECK_AREA = "^([3-9][1-9])|([4-9]\\d)|([1-9]\\d{2,})$";
    static final String CHECK_COST = "^[1-9]{1,}$";
    static final String CHECK_NUMBER_OF_PEOPLE = "^([1-9])|([1]\\d)$";


    @Override
    public void display() {
        Map<House, Integer> houseMap = ReadAndWriteCSV.readHouse();
        System.out.println("==========List House Service==========");
        for (Map.Entry<House, Integer> element: houseMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
        Map<Villa, Integer> villaMap = ReadAndWriteCSV.readVilla();
        System.out.println("==========List Villa Service==========");
        for (Map.Entry<Villa, Integer> element: villaMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
        Map<Room, Integer> roomMap = ReadAndWriteCSV.readRoom();
        System.out.println("==========List Room Service==========");
        for (Map.Entry<Room, Integer> element: roomMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
    }

    public void displayVilla(){
        Map<Villa, Integer> villaMap = ReadAndWriteCSV.readVilla();
        System.out.println("==========List Villa Service==========");
        for (Map.Entry<Villa, Integer> element: villaMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
    }

    public void displayHouse(){
        Map<House, Integer> houseMap = ReadAndWriteCSV.readHouse();
        System.out.println("==========List House Service==========");
        for (Map.Entry<House, Integer> element: houseMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
    }

    public void displayRoom(){
        Map<Room, Integer> roomMap = ReadAndWriteCSV.readRoom();
        System.out.println("==========List Room Service==========");
        for (Map.Entry<Room, Integer> element: roomMap.entrySet()) {
            System.out.println(
                    "Service" + element.getKey() + "; time of rental: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
//        for (Map.Entry<Facility, Integer> element: facilityIntegerMap.entrySet()){
//            if (element.getValue()>=5){
//                System.out.println("==========List Maintenance==========\n" +
//                        "Maintain list: "+element.getKey());
//            }
//        }
        Map<House, Integer> houseMap = ReadAndWriteCSV.readHouse();
        System.out.println("==========List House Service Maintenance==========");
        for (Map.Entry<House, Integer> element: houseMap.entrySet()) {
            if (element.getValue()>=5){
                System.out.println("Maintain list: "+element.getKey());
                System.out.println("");
            }
        }
        Map<Villa, Integer> villaMap = ReadAndWriteCSV.readVilla();
        System.out.println("==========List Villa Service Maintenance==========");
        for (Map.Entry<Villa, Integer> element: villaMap.entrySet()) {
            if (element.getValue()>=5){
                System.out.println("Maintain list: "+element.getKey());
                System.out.println("");
            }
        }
        Map<Room, Integer> roomMap = ReadAndWriteCSV.readRoom();
        System.out.println("==========List Room Service Maintenance==========");
        for (Map.Entry<Room, Integer> element: roomMap.entrySet()) {
            if (element.getValue()>=5){
                System.out.println("Maintain list: "+element.getKey());
                System.out.println("");
            }
        }
    }

    @Override
    public void addVilla() {
        System.out.print("Enter service code (example: SVVL-YYYY): ");
        String serviceCode = Validate.regexStr(scanner.nextLine(), CHECK_VILLA_SERVICE_CODE, "invalid!");
        System.out.print("Enter service name (first letter must be uppercase): ");
        String serviceName= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");
        System.out.print("Enter usable area (minimum is 30m2): ");
        double useArea= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_AREA, "Invalid"));
        System.out.print("Enter cost (positive number): ");
        double cost= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_COST, "Invalid"));
        System.out.print("Enter maximum people (maximum is 20): ");
        int numberOfPeople= Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_NUMBER_OF_PEOPLE, "Invalid"));

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.print("Choice type of rental (1: year; 2: month; 3: day; 4: hour): ");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice){
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
        } while (flag);
        System.out.print("Enter room standard (first letter must be uppercase): ");
        String roomStandard= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");
        System.out.print("Enter pool area (minimum is 30m2): ");
        double poolArea= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_AREA, "Invalid"));
        System.out.print("Enter floor (positive number): ");
        int floor= Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_COST, "Invalid"));

        Villa villa = new Villa(serviceCode,serviceName,useArea,cost,numberOfPeople,rentalType,roomStandard,poolArea,floor);
        facilityIntegerMap.put(villa,0);
        villaMap.put(villa,0);
        System.out.println("Addition villa successful!");
        ReadAndWriteCSV.writeVilla(villaMap,true);
    }

    @Override
    public void addHouse() {
        System.out.print("Enter service code (example: SVHO-YYYY): ");
        String serviceCode= Validate.regexStr(scanner.nextLine(), CHECK_HOUSE_SERVICE_CODE, "invalid!");
        System.out.print("Enter service name (first letter must be uppercase): ");
        String serviceName= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");
        System.out.print("Enter usable area (minimum is 30m2): ");
        double useArea= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_AREA, "Invalid"));
        System.out.print("Enter cost (positive number): ");
        double cost= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_COST, "Invalid"));
        System.out.print("Enter maximum people (maximum is 20): ");
        int numberOfPeople= Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_NUMBER_OF_PEOPLE, "Invalid"));

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.println("Choice type of rental (1: year; 2: month; 3: day; 4: hour)");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice){
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
        } while (flag);
        System.out.print("Enter room standard (first letter must be uppercase): ");
        String roomStandard= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");
        System.out.print("Enter floor (positive number): ");
        int floor= Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_COST, "Invalid"));

        House house = new House(serviceCode,serviceName,useArea,cost,numberOfPeople,rentalType,roomStandard,floor);
        facilityIntegerMap.put(house,0);
        houseMap.put(house,0);
        System.out.println("Addition house successful!");
        ReadAndWriteCSV.writeHouse(houseMap, true);
    }

    @Override
    public void addRoom() {
        System.out.print("Enter service code (example: SVRO-YYYY): ");
        String serviceCode= Validate.regexStr(scanner.nextLine(), CHECK_ROOM_SERVICE_CODE, "invalid!");
        System.out.print("Enter service name (first letter must be uppercase): ");
        String serviceName= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");
        System.out.print("Enter usable area (minimum is 30m2): ");
        double useArea= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_AREA, "Invalid"));
        System.out.print("Enter cost (positive number): ");
        double cost= Double.parseDouble(Validate.regexStr(scanner.nextLine(), CHECK_COST, "Invalid"));
        System.out.print("Enter maximum people (maximum is 20): ");
        int numberOfPeople= Integer.parseInt(Validate.regexStr(scanner.nextLine(), CHECK_NUMBER_OF_PEOPLE, "Invalid"));

        String[] rentalTypeArr={"Year","Month","Day","Hour"};
        boolean flag=false;
        String rentalType = null;
        do {
            System.out.println("Choice type of rental (1: year; 2: month; 3: day; 4: hour)");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
            switch (choice){
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
        } while (flag);
        System.out.print("Enter extra service (first letter must be uppercase): ");
        String extraService= Validate.regexStr(scanner.nextLine(),CHECK_SERVICE_NAME,"Invalid");


        Room room = new Room(serviceCode,serviceName,useArea,cost,numberOfPeople,rentalType,extraService);
        facilityIntegerMap.put(room,0);
        roomMap.put(room,0);
        System.out.println("Addition room successful!");
        ReadAndWriteCSV.writeRoom(roomMap,true);
    }
}
