package ss11_dsa_stack_queue.practice.stack_use_linkedlist;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println("1. Size of stack after push operations: "+stack.size());

        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("2. size after pop operations: "+stack.size());
    }

    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1. Size of stack after push operations: "+stack.size());

        while (!stack.isEmpty()){
            stack.pop();
        }
        System.out.println("2. size after pop operations: "+stack.size());

    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Integer:");
        stackOfInteger();
        System.out.println("2. Stack of String:");
        stackOfStrings();
    }
}
