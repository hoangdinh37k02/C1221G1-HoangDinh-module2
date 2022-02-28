package ss5_accessmodifier_static.static_exercise.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName()+" "+student.getClassName());

        Student student1=new Student();
        student1.setName("Brak");
        student.setClassName("B02");
        System.out.println(student1.getName()+" "+student1.getClassName());

    }
}
