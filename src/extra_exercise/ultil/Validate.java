package extra_exercise.ultil;

import case_study.utils.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    public static String regexStr(String temp, String regex, String error){
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
