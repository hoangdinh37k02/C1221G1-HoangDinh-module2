package ss5_accessmodifier_static.static_pratice.static_method;

public class Student {
    private int id;
    private String name;
    private static String college = "economic";

    public Student(int r, String n){
        id=r;
        name=n;
    }

    static void change(){
        college="CodeGym";
    }

    void display(){
        System.out.println(id+" "+name+" "+college);
    }
}
