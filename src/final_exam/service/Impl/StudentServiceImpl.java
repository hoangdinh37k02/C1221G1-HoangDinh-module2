package final_exam.service.Impl;

import extra_exercise2.util.NotFoundProductException;
import final_exam.model.ClassRoom;
import final_exam.model.Student;
import final_exam.service.IService;
import final_exam.util.NotFoundStudentException;
import final_exam.util.ReadAndWriteToCSV;
import final_exam.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IService {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();
    static List<ClassRoom> classRoomList = new ArrayList<>();
    static final String CHECK_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    static final String CHECK_NAME = "[A-Za-z]{4,50}";
    static final String CHECK_PHONE = "[0][9][0-1][0-9]{7}";

    @Override
    public void add() {
//        int id, String name, String birthDay, String gender, String phone, int classRoomId
        studentList = ReadAndWriteToCSV.readStudent();
        int id = 1;
        if (!studentList.isEmpty()){
            id = studentList.get(studentList.size()-1).getId()+1;
        }

        System.out.print("Nhập tên sinh viên: ");
        String name = Validate.regexStr(scanner.nextLine(),CHECK_NAME,"Không hợp lệ");
        System.out.print("Nhập ngày, tháng năm sinh (dd/MM/yyyy): ");
        String birthDay = Validate.regexStr(scanner.nextLine(),CHECK_DATE,"Không hợp lệ");
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = Validate.regexStr(scanner.nextLine(),CHECK_PHONE,"Không hợp lệ");

        displayClass();
        System.out.print("Nhập mã lớp học: ");
        int classRoomId = Integer.parseInt(scanner.nextLine());
        classRoomList = ReadAndWriteToCSV.readClass();
        String classname =null;
        for (int i =0; i<classRoomList.size();i++){
            if (classRoomId==classRoomList.get(i).getClassRoomId()){
                classname = classRoomList.get(i).getName();
                break;
            }
        }

        Student student = new Student(id,name,birthDay,gender,phone,classname);
        studentList.add(student);
        ReadAndWriteToCSV.writeStudent(studentList,false);
    }

    @Override
    public void delete() throws NotFoundStudentException {
        display();
        System.out.print("Nhập id sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i=0; i<studentList.size();i++){
            if (id==studentList.get(i).getId()){
                flag=true;
                System.out.println(studentList.get(i).toString());
                System.out.println("Bạn có muốn xóa sinh viên này YES/NO");
                String decide = scanner.nextLine().toUpperCase();
                if ("Y".contains(decide)){
                    studentList.remove(i);
                    ReadAndWriteToCSV.writeStudent(studentList,false);
                    System.out.println("Xóa thành công!");
                    break;
                } else {
                    System.out.println("Xóa không thành công!");
                    break;
                }
            }
        }
        if (!flag){
            throw new NotFoundStudentException("Id sinh viên này không tồn tại");
        }
    }

    @Override
    public void display() {
        studentList = ReadAndWriteToCSV.readStudent();
        System.out.println("=====Danh sách sinh viên====");
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        System.out.println("=====Kết thúc danh sách=====");
    }

    public void displayClass(){
        classRoomList = ReadAndWriteToCSV.readClass();
        System.out.println("===Danh sách lớp học===");
        for (ClassRoom classRoom:classRoomList) {
            System.out.println(classRoom.toString());
        }
    }

    @Override
    public void search() {
        display();
        studentList = ReadAndWriteToCSV.readStudent();
        System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
        String name = scanner.nextLine().toLowerCase();
        boolean flag = false;
        System.out.println("Danh sách sinh viên cần tìm: ");
        for (int i = 0; i<studentList.size(); i++){
            if ((studentList.get(i).getName().toLowerCase()).contains(name)){
                System.out.println(studentList.get(i).toString());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy sinh viên nào");
        }
    }
}
