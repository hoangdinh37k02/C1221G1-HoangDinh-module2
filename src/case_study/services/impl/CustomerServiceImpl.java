package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.ICustomerService;
import case_study.utils.Validate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private String name, birthDay, gender, iDCard, phone, email, customerID, customerType, address;
    private static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    String[] typeArr = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
    static final String CHECK_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    @Override
    public void add() {
        create();
        Customer customer = new Customer(customerID,name,birthDay,gender,iDCard,phone,email,customerType,address);
        customerList.add(customer);
    }

    @Override
    public void display() {
        for (int i=0; i<customerList.size(); i++){
            System.out.println((i+1)+". "+customerList.get(i));
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("Enter position customer of list you want to edit");
        int index = Integer.parseInt(scanner.nextLine());
        create();
        customerList.get(index-1).setCustomerID(customerID);
        customerList.get(index-1).setName(name);
        customerList.get(index-1).setBirthDay(birthDay);
        customerList.get(index-1).setGender(gender);
        customerList.get(index-1).setiDCard(iDCard);
        customerList.get(index-1).setPhone(phone);
        customerList.get(index-1).setEmail(email);
        customerList.get(index-1).setCustomerType(customerType);
        customerList.get(index-1).setAddress(address);
    }

    public void create(){
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter birthday: ");
        birthDay = Validate.regexAge(scanner.nextLine(),CHECK_AGE);
        System.out.print("Enter gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter IDCard: ");
        iDCard = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter customerID: ");
        customerID = scanner.nextLine();
        int choice;
        boolean flag=false;
        do {
            System.out.println("Type of customer\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n"+
                    "Please choice!");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: customerType=typeArr[0]; break;
                case 2: customerType=typeArr[1]; break;
                case 3: customerType=typeArr[2]; break;
                case 4: customerType=typeArr[3]; break;
                case 5: customerType=typeArr[4]; break;
                default:
                    System.out.println("Invalid\n" +
                            "choice again");
                    flag=true;
                    break;
            }
        } while (flag);
        System.out.print("Enter address: ");
        address = scanner.nextLine();
    }
}
