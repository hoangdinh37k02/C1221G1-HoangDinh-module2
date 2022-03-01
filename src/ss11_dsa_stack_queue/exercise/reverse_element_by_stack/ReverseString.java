package ss11_dsa_stack_queue.exercise.reverse_element_by_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString=input.nextLine();
        Character[] reverseString = new Character[inputString.length()];
        System.out.println(inputString.length());

        for (int i=0; i<inputString.length(); i++){
            stack.push(inputString.charAt(i));
        }
        for (int i=0; i<stack.size(); i++){
            System.out.println("element "+i+" of the stack is: "+stack.get(i));
        }
        for (int i=0; i<stack.size(); i++){
            reverseString[i]= stack.pop();
        }

        for (Character i: reverseString){
            System.out.println(i);
        }
    }
}
