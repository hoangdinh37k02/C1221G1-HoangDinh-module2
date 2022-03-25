package final_exam.controller;

import final_exam.service.Impl.StudentServiceImpl;
import final_exam.service.Impl.TeacherServiceImpl;
import final_exam.util.NotFoundStudentException;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    StudentServiceImpl studentService = new StudentServiceImpl();
    TeacherServiceImpl teacherService = new TeacherServiceImpl();
    public void mainMenu(){
        String choice;
        do {
            System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN------\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới sinh viên\n" +
                    "2. Xóa sinh viên\n" +
                    "3. Xem danh sách sinh viên\n" +
                    "4. Xem thông tin giáo viên\n" +
                    "5. Tìm kiếm sinh viên\n" +
                    "6. Thoát\n" +
                    "Chọn chức năng");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    displayStudent();
                    break;
                case "4":
                    displayTeacher();
                    break;
                case "5":
                    searchStudent();
                    break;
                case "6":
                    System.exit(6);
                default:
                    System.out.println("Invalid\n" +
                            "Please choice again!");
            }
        } while (!"5".equals(choice));
    }

    private void searchStudent() {
        studentService.search();
        mainMenu();
    }

    private void displayTeacher() {
        teacherService.display();
    }

    private void displayStudent() {
        studentService.display();
    }

    private void deleteStudent() {
        try {
            studentService.delete();
        } catch (NotFoundStudentException e) {
            e.printStackTrace();
        }
    }

    private void addStudent() {
        studentService.add();
    }
}
