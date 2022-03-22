package extra_exercise1.util;

import java.util.Scanner;

public class Validate {
    public static String regexStr(String temp, String regex,String error){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            if (temp.matches(regex)){
                flag=false;
            } else {
                System.out.println(error);
                System.out.println("Vui lòng nhập lại");
                temp = scanner.nextLine();
            }
        } while (flag);
        return temp;
    }
}
