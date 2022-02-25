package ss3_array.exercise;

import java.util.Scanner;

public class VoidElenment {
    public static void main(String[] args) {
        String[] arrays = {"1","2","3","4","54","23","7","8","0"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to void: ");
        String input_number = input.nextLine();

        int index= 0;
        boolean isExist = false;
        for (int i = 0; i<arrays.length; i++){
            if (arrays[i].equals(input_number)){
                index=i;
                isExist=true;
                break;
            }
        }
        for (int i = index; i <arrays.length-1; i++){
            arrays[i]=arrays[i+1];
        }
        for (String i: arrays){
            System.out.println(i);
        }
        if (!isExist){
            System.out.println("Not found "+ input_number+ " in the list");
        }
    }
}
