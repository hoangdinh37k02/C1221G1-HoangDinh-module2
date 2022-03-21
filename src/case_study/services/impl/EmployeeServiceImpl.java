package case_study.services.impl;

import case_study.models.Customer;
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
    String[] degreeArr = {"Intermediate's level","Associate's  level","Graduates","Postgraduate's level"};
    String[] positionArr={"Receptionist","Waitress","Expert","Supervisor","Manager","Director"};

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
        System.out.println("==========Employee List==========");
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
        int choice1 = 0, choice2=0;
        boolean flag=false;
        do {
            System.out.println("Level of degree\n" +
                    "1. Intermediate's level\n" +
                    "2. Associate's  level\n" +
                    "3. Graduates\n" +
                    "4. Postgraduate's level\n" +
                    "Please choice!");
            try {
                choice1 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
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
                    "1. Receptionist\n" +
                    "2. Waitress\n" +
                    "3. Expert\n" +
                    "4. Supervisor\n" +
                    "5. Manager\n" +
                    "6. Director\n" +
                    "Please choice!");
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("wrong format input! Please input again!");
            }
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

    public void update() {
        List<Employee> employeeList = ReadAndWriteCSV.readEmployee();
        display();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter employee's id you want to edit");
            String id = scanner.nextLine();
            for (Employee employee : employeeList) {
                if (id.equals(employee.getEmployeeID())) {
                    System.out.println(employee.toString() + "\n" +
                            "Do you want to edit this employee Y/N");
                    String choice = scanner.nextLine().toUpperCase();
                    if (choice.contains("Y")) {
                        create();
                        employee.setEmployeeID(employeeID);
                        employee.setName(name);
                        employee.setBirthDay(birthDay);
                        employee.setGender(gender);
                        employee.setiDCard(iDCard);
                        employee.setPhone(phone);
                        employee.setEmail(email);
                        employee.setDegree(degree);
                        employee.setPosition(position);
                        employee.setSalary(salary);
                        ReadAndWriteCSV.writeEmployee(employeeList, false);
                        System.out.println("Update successful!");
                        flag = false;
                        break;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        }
    }
}
