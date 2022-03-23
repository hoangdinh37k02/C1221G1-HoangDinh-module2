package extra_exercise2.service.impl;

import extra_exercise2.model.AuthenticPhone;
import extra_exercise2.model.HandPhone;
import extra_exercise2.service.IService;
import extra_exercise2.util.NotFoundProductException;
import extra_exercise2.util.ReadAndWriteToCSV;
import extra_exercise2.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandPhoneServiceImpl implements IService {
    static Scanner scanner = new Scanner(System.in);
    static List<HandPhone> handPhoneList = new ArrayList<>();
    static String POSITIVE_NUMBER = "^[1-9]\\d{0,}$";

    @Override
    public void add() {
        handPhoneList = ReadAndWriteToCSV.readHand();
        int id = 1;
        if (!handPhoneList.isEmpty()){
            id = handPhoneList.get(handPhoneList.size()-1).getId()+1;
        }
        System.out.print("Enter phone name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone price: ");
        int price = Integer.parseInt(Validate.regexStr(scanner.nextLine(), POSITIVE_NUMBER, "Invalid!"));
        System.out.print("Enter phone quantity: ");
        int quantity = Integer.parseInt(Validate.regexStr(scanner.nextLine(), POSITIVE_NUMBER, "Invalid!"));
        System.out.print("Enter manufacture: ");
        String manufacture = scanner.nextLine();
        System.out.print("Enter country that phone was manufactured: ");
        String nation = scanner.nextLine();

        boolean flag = true;
        String status = null;
        do {
            System.out.println("1. Repaired\n" +
                    "2. Not repaired\n" +
                    "Please choice status!");
            String[] productList = {"Repaired","Not repaired"};
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    status = productList[0];
                    break;
                case 2:
                    status = productList[1];
                    break;
                default:
                    System.out.println("Invalid!\n" +
                            "Choice again!");
                    flag = false;
                    break;
            }
        } while (!flag);

        HandPhone handPhone = new HandPhone(id,name,price,quantity,manufacture,nation,status);
        handPhoneList.add(handPhone);
        ReadAndWriteToCSV.writeHand(handPhoneList,false);
        System.out.println("Addition successful!");
    }

    @Override
    public void display() {
        handPhoneList = ReadAndWriteToCSV.readHand();
        System.out.println("=====HandPhone List=====");
        for (HandPhone handPhone:handPhoneList) {
            System.out.println(handPhone.toString());
        }
        System.out.println("=====End of list=====");
    }

    @Override
    public void delete() throws NotFoundProductException {
        display();
        boolean flag = false;
        System.out.print("Input phone'id that you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < handPhoneList.size(); i++) {
            if (id == handPhoneList.get(i).getId()) {
                flag = true;
                System.out.println(handPhoneList.get(i).toString());
                System.out.println("Do you want to delete this phone Y/N");
                String decide = scanner.nextLine().toUpperCase();
                if ("Y".contains(decide)) {
                    handPhoneList.remove(i);
                    ReadAndWriteToCSV.writeHand(handPhoneList, false);
                    System.out.println("Deletion successful!");
                    break;
                } else {
                    System.out.println("Deletion fail!");
                    break;
                }
            }
        }
        if (!flag) {
            throw new NotFoundProductException("phone'id is not exist!\n" +
                    "Please input again!");
        }
    }

    @Override
    public void search() throws NotFoundProductException {
        display();
        System.out.print("Input phone'id that you want to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i<handPhoneList.size(); i++){
            if (id==handPhoneList.get(i).getId()){
                System.out.println(handPhoneList.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag){
            throw new NotFoundProductException("phone's id is not exist");
        }
    }
}
