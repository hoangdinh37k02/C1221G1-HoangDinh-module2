package ss3_array.pratice;

import java.util.Scanner;

public class Findmaxelement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Enter array size:");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Sizes does not exceed 20");
            }
        } while (size >20);

        array = new int[size];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter element "+ (i+1)+" is: ");
            array[i]=scanner.nextInt();
        }

        int max = array[0];
        int index=1;
        for (int j=1; j<array.length; j++){
            if (array[j]>max){
                max = array[j];
            }
            index++;
        }

        System.out.println("Max element is: "+max+"; has position is: "+index);

    }
}
