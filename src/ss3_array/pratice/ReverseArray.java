package ss3_array.pratice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Enter arr size");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Sizes does not exceed 20 ");
            }
        } while (size>20);

        arr = new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("Enter element "+(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }

        System.out.println("Arr element is ");
        for (int j: arr){
            System.out.println(j);
        }

        for (int k=0; k<arr.length/2; k++){
            int temp = arr[k];
            arr[k]=arr[arr.length-1-k];
            arr[arr.length-1-k]=temp;
        }

        System.out.println("Arr is reversed:");
        for (int n: arr){
            System.out.println(n);
        }
    }
}
