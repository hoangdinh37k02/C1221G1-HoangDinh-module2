package ss10_dsa_list_set.pratice.simple_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("<<-----------Test------------>>");
        MyLinkedList test = new MyLinkedList(10);
        test.addFirst(11);
        test.addFirst(12);
        test.addFirst(13);

        test.add(4,9);
        test.add(4,8);
        test.printList();
    }
}
