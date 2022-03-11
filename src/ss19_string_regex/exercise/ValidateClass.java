package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidateClass {
    public static boolean checkClass(String className){
        String regex= "^[CAP][0-9]{4}[GHIKLM]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.print("Enter class name: ");
            String className = scanner.nextLine();
            isValid  = checkClass(className);
            if (isValid){
                System.out.println("Your name is valid");
            } else {
                System.out.println("Your name is invalid");
            }
        } while (!isValid);
    }
}
