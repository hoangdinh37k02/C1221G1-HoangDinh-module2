package final_exam.util;

import java.util.Scanner;

public class Validate {
//    static final String CHECK_PHONE = "[0][9][0-1][0-9]{7}";
    public static String regexStr(String temp, String regex, String error){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            if (temp.matches(regex)){
                flag = false;
            } else {
                System.out.println(error);
                System.out.println("Vui lòng nhập lại");
                temp = scanner.nextLine();
            }
        } while (flag);
        return temp;
    }
}
