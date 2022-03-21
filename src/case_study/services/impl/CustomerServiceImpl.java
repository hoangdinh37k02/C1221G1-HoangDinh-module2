package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.ICustomerService;
import case_study.utils.ReadAndWriteCSV;
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
        ReadAndWriteCSV.writeCustomer(customerList,true);
    }

    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteCSV.readCustomer();
        System.out.println("==========Customer List==========");
        for (int i=0; i<customerList.size(); i++){
            System.out.println(+(i+1)+". "+customerList.get(i));
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteCSV.readCustomer();
        display();
        boolean flag=true;
        while (flag){
            System.out.println("Enter customer's id you want to edit");
            String id=scanner.nextLine();
            for (Customer customer:customerList) {
                if (id.equals(customer.getCustomerID())){
                    System.out.println(customer.toString()+"\n"+
                            "Do you want to edit this customer Y/N");
                    String choice = scanner.nextLine().toUpperCase();
                    if (choice.contains("Y")){
                        create();
                        customer.setCustomerID(customerID);
                        customer.setName(name);
                        customer.setBirthDay(birthDay);
                        customer.setGender(gender);
                        customer.setiDCard(iDCard);
                        customer.setPhone(phone);
                        customer.setEmail(email);
                        customer.setCustomerType(customerType);
                        customer.setAddress(address);
                        ReadAndWriteCSV.writeCustomer(customerList,false);
                        System.out.println("Update successful!");
                        flag=false;
                        break;
                    } else {
                        flag=false;
                        break;
                    }
                }
            }
        }
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

        int choice=0;
        boolean flag=false;
        do {
            System.out.println("Type of customer\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n"+
                    "Please choice!");
            try {
                choice=Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }

            switch (choice){
                case 1: customerType=typeArr[0]; flag = false; break;
                case 2: customerType=typeArr[1]; flag = false; break;
                case 3: customerType=typeArr[2]; flag = false; break;
                case 4: customerType=typeArr[3]; flag = false; break;
                case 5: customerType=typeArr[4]; flag = false; break;
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
