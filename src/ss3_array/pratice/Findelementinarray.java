package ss3_array.pratice;

import java.util.Scanner;

public class Findelementinarray {
    public static void main(String[] args) {
        String[] students={"Eva", "Sophia", "Iris", "Daisy", "Liz"};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name you want to find: ");
        String input_name=scanner.nextLine();

        boolean isExist = false;
        for (int i=0; i<students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the student "+students[i]+ " is "+ i);
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found "+ input_name+ " in the list");
        }
    }
}
