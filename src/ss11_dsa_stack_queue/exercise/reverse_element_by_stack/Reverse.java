package ss11_dsa_stack_queue.exercise.reverse_element_by_stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number element of the arr:");
        int input_number = input.nextInt();
        int[] arr=new int[input_number];
        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element arr["+i+"]:");
            arr[i]=input.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }
//        for (int i=0; i<stack.size(); i++){
//            System.out.println("element "+i+" of the stack is: "+stack.get(i));
//        }
        for (int i =0; i<arr.length; i++){
            arr[i]=stack.pop();
        }

        System.out.println("the array after reverse: ");
        for (int i=0; i<arr.length; i++) {
            System.out.println("Enter element arr[" + i + "]: " +arr[i]);
        }
    }
}
