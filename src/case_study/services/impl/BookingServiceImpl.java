package case_study.services.impl;

import case_study.models.*;
import case_study.services.IBookingService;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWriteCSV;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = ReadAndWriteCSV.readCustomer();
    static Map<Villa, Integer> villaMap = ReadAndWriteCSV.readVilla();
    static Map<House, Integer> houseMap = ReadAndWriteCSV.readHouse();
    static Map<Room, Integer> roomMap = ReadAndWriteCSV.readRoom();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addBookingVilla() {
        String id = "1";
        if (!bookingSet.isEmpty()){
            id = String.valueOf(bookingSet.size());
        }
        Customer customer = chooseCustomer();
        Villa villa = chooseVilla();
        System.out.print("Enter start day: ");
        String startDay = scanner.nextLine();
        System.out.print("Enter end day: ");
        String endDay = scanner.nextLine();
        Booking booking = new Booking(id, startDay, endDay, customer, villa);
        bookingSet.add(booking);
        System.out.println("Addition successful!");
    }

    @Override
    public void addBookingHouse() {
        String id = "1";
        if (!bookingSet.isEmpty()){
            id = String.valueOf(bookingSet.size());
        }
        Customer customer = chooseCustomer();
        House house = chooseHouse();
        System.out.print("Enter start day: ");
        String startDay = scanner.nextLine();
        System.out.print("Enter end day: ");
        String endDay = scanner.nextLine();
        Booking booking = new Booking(id, startDay, endDay, customer, house);
        bookingSet.add(booking);
        System.out.println("Addition successful!");
    }

    @Override
    public void addBookingRoom() {
        String id = "1";
        if (!bookingSet.isEmpty()){
            id = String.valueOf(bookingSet.size());
        }
        Customer customer = chooseCustomer();
        Room room = chooseRoom();
        System.out.print("Enter start day: ");
        String startDay = scanner.nextLine();
        System.out.print("Enter end day: ");
        String endDay = scanner.nextLine();
        Booking booking = new Booking(id, startDay, endDay, customer, room);
        bookingSet.add(booking);
        System.out.println("Addition successful!");
    }

    @Override
    public void displayVilla() {
        for (Booking booking:bookingSet) {
            System.out.println(booking.getVillaInFo());
        }
    }

    @Override
    public void displayHouse() {
        for (Booking booking:bookingSet) {
            System.out.println(booking.getHouseInFo());
        }
    }

    @Override
    public void displayRoom() {
        for (Booking booking:bookingSet) {
            System.out.println(booking.getRoomInFo());
        }
    }


    public static Customer chooseCustomer(){
        System.out.println("Customer List");
        for (Customer customer:customerList) {
            System.out.println(customer.toString());
        }

        System.out.print("Please choice customer's id: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Customer customer:customerList) {
                if (id.equals(customer.getCustomerID())){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Your input is not found, input again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Villa chooseVilla(){
        System.out.println("Villa List");
        for (Map.Entry<Villa, Integer> villa: villaMap.entrySet()) {
            System.out.println(villa.getKey().toString());
        }

        System.out.print("Please choice service's code: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Villa, Integer> villa: villaMap.entrySet()) {
                if (id.equals(villa.getKey().getServiceCode())){
                    check = false;
                    return villa.getKey();
                }
            }
            if (check){
                System.out.println("Your input is not found, input again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static House chooseHouse(){
        System.out.println("House List");
        for (Map.Entry<House, Integer> house: houseMap.entrySet()) {
            System.out.println(house.getKey().toString());
        }

        System.out.print("Please choice service's code: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<House, Integer> house: houseMap.entrySet()) {
                if (id.equals(house.getKey().getServiceCode())){
                    check = false;
                    return house.getKey();
                }
            }
            if (check){
                System.out.println("Your input is not found, input again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Room chooseRoom(){
        System.out.println("Room List");
        for (Map.Entry<Room, Integer> room: roomMap.entrySet()) {
            System.out.println(room.getKey().toString());
        }

        System.out.print("Please choice service's code: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Room, Integer> room: roomMap.entrySet()) {
                if (id.equals(room.getKey().getServiceCode())){
                    check = false;
                    return room.getKey();
                }
            }
            if (check){
                System.out.println("Your input is not found, input again!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

}
