package ss11_dsa_stack_queue.practice.stack_use_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public void pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        } else {
            stack.removeFirst();
        }
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if (size()==0){
            return true;
        } else {
            return false;
        }
    }
}
