package final_exam.service.Impl;

import final_exam.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl {
    static List<Teacher> teacherList = new ArrayList<>();
    static {
//        int id, String name, String birthDay, String gender, String phone
        teacherList.add(new Teacher(1,"Hai","15/12/1992","Nam", "090755412"));
        teacherList.add(new Teacher(2,"Son","15/12/1996","Nam", "0933253612"));
        teacherList.add(new Teacher(3,"Trung","24/01/1999","Nam", "0907512412"));
        teacherList.add(new Teacher(4,"Khoa","15/10/1993","Nam", "0907224112"));
        teacherList.add(new Teacher(5,"Huy","02/12/1995","Nam", "0902231212"));

    }

    public void display(){
        System.out.println("=====Danh sách giáo viên====");
        for (Teacher teacher:teacherList) {
            System.out.println(teacher.toString());
        }
        System.out.println("=====Kết thúc danh sách=====");
    }
}
