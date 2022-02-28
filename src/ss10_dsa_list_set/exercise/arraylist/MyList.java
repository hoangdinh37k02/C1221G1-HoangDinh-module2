package ss10_dsa_list_set.exercise.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements=new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size=0;
        for (int i=0; i<elements.length; i++){
            elements[i]=null;
        }
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e){
        if (elements.length==size){
            this.ensureCapa();
        }
        elements[size]=e;
        size++;
        return true;
    }

    public void add(int index, E e) {
        if (index>elements.length){
            throw new IllegalArgumentException("index: "+ index);
        } else if (size == elements.length) {
            this.ensureCapa();
        }
        if (elements[index]==null){
            elements[index]=e;
        } else {
            for (int i = size+1; i >= index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public E remove(int index){
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for (int i=index; i<size-1; i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }
}
