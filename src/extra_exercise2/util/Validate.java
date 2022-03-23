package extra_exercise2.util;

import java.util.Scanner;

public class Validate {
//    static final String POSITIVE_NUMBER = "^[1-9]\\d{0,}$";
    public static String regexStr(String temp, String regex, String error){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            if (temp.matches(regex)){
                flag = false;
            } else {
                System.out.println(error);
                System.out.println("Please input again");
                temp = scanner.nextLine();
            }
        } while (flag);
        return temp;
    }
}
