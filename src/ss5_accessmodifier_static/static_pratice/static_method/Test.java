package ss5_accessmodifier_static.static_pratice.static_method;

public class Test {
    public static void main(String[] args) {
        Student.change();

        Student student1=new Student(111,"Hoa");
        Student student2=new Student(222,"Hong");
        Student student3=new Student(333,"Hai");

        student1.display();
        student3.display();
        student2.display();
    }
}
