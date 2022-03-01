package ss10_dsa_list_set.pratice.simple_list;

public class MyListText {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 3: "+listInteger.get(3));
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

        System.out.println("element 4: "+listInteger.get(4));
    }
}
