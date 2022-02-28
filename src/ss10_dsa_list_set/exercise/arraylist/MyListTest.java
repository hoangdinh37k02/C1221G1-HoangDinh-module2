package ss10_dsa_list_set.exercise.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger= new MyList<Integer>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2, 13);

        System.out.println(listInteger.remove(1));
        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.size());


    }
}
