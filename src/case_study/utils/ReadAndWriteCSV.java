package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteCSV {
    public static final String BOOKING_VILLA_FILE = "src\\case_study\\datas\\bookingvilla";
    public static final String BOOKING_HOUSE_FILE = "src\\case_study\\datas\\bookinghouse.csv";
    public static final String BOOKING_ROOM_FILE = "src\\case_study\\datas\\bookingroom";
    public static final String CONTRACT_FILE = "src\\case_study\\datas\\contract.csv";
    public static final String CUSTOMER_FILE = "src\\case_study\\datas\\Customer.csv";
    public static final String EMPLOYEE_FILE = "src\\case_study\\datas\\Employee.csv";
    public static final String HOUSE_FILE = "src\\case_study\\datas\\House.csv";
    public static final String ROOM_FILE = "src\\case_study\\datas\\Room.csv";
    public static final String VILLA_FILE = "src\\case_study\\datas\\Villa.csv";

    public static void writeEmployee(List<Employee> employeeList, boolean append) {
        try {
            File file = new File(EMPLOYEE_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        try {
            File file = new File(EMPLOYEE_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Employee employee = new Employee(arr[0], arr[1],
                        arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public static void writeCustomer(List<Customer> customerList, boolean append) {
        try {
            File file = new File(CUSTOMER_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCustomer() {
        List<Customer> customerList = new ArrayList<>();

        try {
            File file = new File(CUSTOMER_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Customer customer = new Customer(arr[0], arr[1],
                        arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    public static void writeHouse(Map<House, Integer> houseMap, boolean append) {
        try {
            File file = new File(HOUSE_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House, Integer> element: houseMap.entrySet()) {
                bufferedWriter.write(element.getKey().getInfoToCSV()+","+element.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House, Integer> readHouse() {
        Map<House, Integer> houseMap = new LinkedHashMap<>();

        try {
            File file = new File(HOUSE_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
//                String serviceCode, String serviceName, double useArea, double cost,
//                int numberOfPeople, String rentalType, String roomStandard, int floor
                House house = new House(arr[0], arr[1],
                        Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
                houseMap.put(house,Integer.parseInt(arr[8]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return houseMap;
    }

    public static void writeVilla(Map<Villa, Integer> villaMap, boolean append) {
        try {
            File file = new File(VILLA_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> element: villaMap.entrySet()) {
                bufferedWriter.write(element.getKey().getInfoToCSV()+","+element.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();

        try {
            File file = new File(VILLA_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Villa villa = new Villa(arr[0], arr[1],
                        Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6],Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                villaMap.put(villa,Integer.parseInt(arr[9]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return villaMap;
    }

    public static void writeRoom(Map<Room, Integer> roomMap, boolean append) {
        try {
            File file = new File(ROOM_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> element: roomMap.entrySet()) {
                bufferedWriter.write(element.getKey().getInfoToCSV()+","+element.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room, Integer> readRoom() {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();

        try {
            File file = new File(ROOM_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Room room = new Room(arr[0], arr[1],
                        Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]),
                        arr[5], arr[6]);
                roomMap.put(room,Integer.parseInt(arr[7]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }
}
