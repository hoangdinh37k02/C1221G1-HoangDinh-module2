package ss3_array.exercise;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] array = new  int[10];
        array[0]=1;
        array[1]=5;
        array[2]=2;
        array[3]=6;
        array[4]=9;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that you want to insert: ");
        int number = input.nextInt();
        int index;
        do {
            System.out.println("Enter position that you want to insert: ");
            index = input.nextInt();
            if (index<0||index>9){
                System.out.println("Not insert to the array");
            }
        } while (index<0||index>9);

        for (int i=array.length-1; i>index; i--){
            array[i]=array[i-1];
        }
        array[index]=number;

        for (int i: array){
            System.out.println(i);
        }
    }
}
