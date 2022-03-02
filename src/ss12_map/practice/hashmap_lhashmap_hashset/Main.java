package ss12_map.practice.hashmap_lhashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(111, "An",21);
        Student student2 = new Student(222, "Nam",19);
        Student student3 = new Student(333, "Hai",18);

        Map<Integer, Student> studentMap=new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

//        Set<Integer> keySet= studentMap.keySet();
//        for (Integer key: keySet) {
//            System.out.println(studentMap.get(key));
//        }
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
