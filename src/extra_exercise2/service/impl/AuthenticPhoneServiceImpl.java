package extra_exercise2.service.impl;

import extra_exercise2.model.AuthenticPhone;
import extra_exercise2.service.IService;
import extra_exercise2.util.NotFoundProductException;
import extra_exercise2.util.ReadAndWriteToCSV;
import extra_exercise2.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthenticPhoneServiceImpl implements IService {
    static Scanner scanner = new Scanner(System.in);
    static List<AuthenticPhone> authenticPhoneList = new ArrayList<>();
    static final String POSITIVE_NUMBER = "^[1-9]\\d{0,}$";

    @Override
    public void add() {
        authenticPhoneList = ReadAndWriteToCSV.readAuthentic();
        int id = 1;
        if (!authenticPhoneList.isEmpty()){
            id = authenticPhoneList.get(authenticPhoneList.size()-1).getId()+1;
        }
        System.out.print("Enter phone name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone price: ");
        int price = Integer.parseInt(Validate.regexStr(scanner.nextLine(), POSITIVE_NUMBER, "Invalid!"));
        System.out.print("Enter phone quantity: ");
        int quantity = Integer.parseInt(Validate.regexStr(scanner.nextLine(), POSITIVE_NUMBER, "Invalid!"));
        System.out.print("Enter manufacture: ");
        String manufacture = scanner.nextLine();
        System.out.print("Enter warranty time (1 or 2 year): ");
        int warrantyTime = Integer.parseInt(scanner.nextLine());

        boolean flag;
        String warrantyLimit = null;
        do {
            flag = true;
            System.out.println("1. Inland\n" +
                    "2. International\n" +
                    "Please choice warranty limit!");
            String[] productList = {"Inland","International"};
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    warrantyLimit = productList[0];
                    break;
                case 2:
                    warrantyLimit = productList[1];
                    break;
                default:
                    System.out.println("Invalid!\n" +
                            "Choice again!");
                    flag = false;
                    break;
            }
        } while (!flag);
        AuthenticPhone authenticPhone = new AuthenticPhone(id,name,price,quantity,manufacture,warrantyTime,warrantyLimit);
        authenticPhoneList.add(authenticPhone);
        ReadAndWriteToCSV.writeAuthentic(authenticPhoneList, false);
        System.out.println("Addition successful!");
    }

    @Override
    public void display() {
        authenticPhoneList = ReadAndWriteToCSV.readAuthentic();
        System.out.println("=====Authentic Phone List====");
        for (AuthenticPhone authenticPhone:authenticPhoneList) {
            System.out.println(authenticPhone.toString());
        }
        System.out.println("=====End of list=====");
    }

    @Override
    public void delete() throws NotFoundProductException {
        display();
        System.out.print("Input phone'id that you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i=0; i<authenticPhoneList.size();i++){
            if (id==authenticPhoneList.get(i).getId()){
                flag=true;
                System.out.println(authenticPhoneList.get(i).toString());
                System.out.println("Do you want to delete this phone Y/N");
                String decide = scanner.nextLine().toUpperCase();
                if ("Y".contains(decide)){
                    authenticPhoneList.remove(i);
                    ReadAndWriteToCSV.writeAuthentic(authenticPhoneList,false);
                    System.out.println("Deletion successful!");
                    break;
                } else {
                    System.out.println("Deletion fail!");
                    break;
                }
            }
        }
        if (!flag){
            throw new NotFoundProductException("phone'id is not exist!");
        }
    }

    @Override
    public void search() throws NotFoundProductException {
        display();
        System.out.print("Input phone'id that you want to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i<authenticPhoneList.size(); i++){
            if (id==authenticPhoneList.get(i).getId()){
                System.out.println(authenticPhoneList.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag){
            throw new NotFoundProductException("phone's id is not exist");
        }
    }
}
