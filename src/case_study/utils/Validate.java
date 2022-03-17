package case_study.utils;

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
                flag = false;
            } else {
                System.out.println(error);
                System.out.println("Please input again");
                temp = scanner.nextLine();
            }
        } while (flag);
        return temp;
    }

    public static String regexAge(String temp, String regex){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            try {
                if (Pattern.matches(regex, temp)){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current>18&&current<100){
                        flag = false;
                    } else {
                        throw new AgeException("age is more than 18 and less than 100");
                    }
                } else {
                    throw new AgeException("wrong formating");
                }

            } catch (AgeException e){
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
