package final_exam.util;

import extra_exercise2.model.AuthenticPhone;
import final_exam.model.ClassRoom;
import final_exam.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    static final String STUDENT_FILE = "src\\final_exam\\data\\student.csv";
    static final String CLASS_FILE = "src\\final_exam\\data\\class.csv";
    static final String TEACHER_FILE = "src\\final_exam\\data\\teacher.csv";

    public static void writeStudent(List<Student> studentList, boolean append) {
        try {
            File file = new File(STUDENT_FILE);
            FileWriter fileWriter = new FileWriter(file, append);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student e : studentList) {
                bufferedWriter.write(e.getInFoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readStudent() {
        List<Student> studentList = new ArrayList<>();

        try {
            File file = new File(STUDENT_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Student student = new Student(Integer.parseInt(arr[0]), arr[1],
                        arr[2], arr[3], arr[4], arr[5]);
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static List<ClassRoom> readClass() {
        List<ClassRoom> classRoomList = new ArrayList<>();

        try {
            File file = new File(CLASS_FILE);
            FileReader fileReader = new FileReader(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                ClassRoom classRoom = new ClassRoom(Integer.parseInt(arr[0]), arr[1],
                        Integer.parseInt(arr[2]));
                classRoomList.add(classRoom);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return classRoomList;
    }
}
