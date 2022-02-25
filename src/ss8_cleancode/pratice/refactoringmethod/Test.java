package ss8_cleancode.pratice.refactoringmethod;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(3,4.5);
        System.out.println(cylinder);
    }


}
