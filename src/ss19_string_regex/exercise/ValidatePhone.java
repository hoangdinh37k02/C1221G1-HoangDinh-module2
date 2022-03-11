package ss19_string_regex.exercise;

import java.util.Scanner;

public class ValidatePhone {
    public static boolean checkPhone(String phone){
        String regex = "^\\(\\d{2}\\)\\-\\([0]\\d{9}\\)$";
        return phone.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        do {
            System.out.print("Enter phone: ");
            String phone = scanner.nextLine();
            isValid  = checkPhone(phone);
            if (isValid){
                System.out.println("Your phone is valid");
            } else {
                System.out.println("Your phone is invalid");
            }
        } while (!isValid);
    }
}


