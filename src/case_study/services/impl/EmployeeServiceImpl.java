package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.IEmployeeService;
import case_study.utils.ReadAndWriteCSV;
import case_study.utils.Validate;
import vehicle_validate.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private String name, birthDay, gender, iDCard, phone, email, employeeID, degree, position, salary;
    private static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String[] degreeArr = {"Trung cấp","Cao đẳng","Đại học","Sau Đại học"};
    String[] positionArr={"Lễ tân","Phục vụ","Chuyên viên","Giám sát","Quản lý","Giám đốc"};

    static final String CHECK_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    @Override
    public void add() {
        create();
        Employee employee=new Employee(employeeID,name,birthDay,gender,iDCard,phone,email,degree,position,salary);
        employeeList.add(employee);
        ReadAndWriteCSV.writeEmployee(employeeList,true);
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteCSV.readEmployee();
        for (int i=0; i<employeeList.size(); i++){
            System.out.println((i+1)+". "+employeeList.get(i));
        }

    }

    @Override
    public void edit() {
        update();
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
        System.out.print("Enter employeeID: ");
        employeeID = scanner.nextLine();
        int choice1, choice2;
        boolean flag=false;
        do {
            System.out.println("Level of degree\n" +
                    "1. Trung cấp\n" +
                    "2. Cao đẳng\n" +
                    "3. Đại học\n" +
                    "4. Sau đại học\n" +
                    "Please choice!");
            choice1=Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1: degree=degreeArr[0]; break;
                case 2: degree=degreeArr[1]; break;
                case 3: degree=degreeArr[2]; break;
                case 4: degree=degreeArr[3]; break;
                default:
                    System.out.println("Invalid\n" +
                            "choice again");
                    flag=true;
                    break;
            }
        } while (flag);

        do {
            System.out.println("Level of position\n" +
                    "1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "Please choice!");
            choice2=Integer.parseInt(scanner.nextLine());
            switch (choice2){
                case 1: position=positionArr[0]; break;
                case 2: position=positionArr[1]; break;
                case 3: position=positionArr[2]; break;
                case 4: position=positionArr[3]; break;
                case 5: position=positionArr[4]; break;
                case 6: position=positionArr[5]; break;
                default:
                    System.out.println("Invalid\n" +
                            "choice again");
                    flag=true;
                    break;
            }
        } while (flag);
        System.out.print("Enter salary: ");
        salary = scanner.nextLine();
    }

    public void update(){
//        List<Employee> employeeList = ReadAndWriteCSV.readEmployee();
        display();
        System.out.println("Enter position employee of list you want to edit");
        int index = Integer.parseInt(scanner.nextLine());
        create();
        employeeList.get(index-1).setEmployeeID(employeeID);
        employeeList.get(index-1).setName(name);
        employeeList.get(index-1).setBirthDay(birthDay);
        employeeList.get(index-1).setGender(gender);
        employeeList.get(index-1).setiDCard(iDCard);
        employeeList.get(index-1).setPhone(phone);
        employeeList.get(index-1).setEmail(email);
        employeeList.get(index-1).setDegree(degree);
        employeeList.get(index-1).setPosition(position);
        employeeList.get(index-1).setSalary(salary);
        ReadAndWriteCSV.writeEmployee(employeeList, false);
        System.out.println("Update successful!");
    }
}
