package ss6_inheritance.pratice;

public class TestReTangle {
    public static void main(String[] args) {
        ReTangle retangle = new ReTangle();
        System.out.println(retangle);

        retangle = new ReTangle(3.0,4.0);
        System.out.println(retangle);

        retangle = new ReTangle(4.0,5.0,"orange",true);
        System.out.println(retangle);
    }
}
