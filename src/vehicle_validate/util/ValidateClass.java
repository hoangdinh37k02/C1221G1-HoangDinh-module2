package vehicle_validate.util;

public class ValidateClass {
    public static boolean checkNamSX(String className){
        String regex= "^\\d{4}$";
        return className.matches(regex);
    }

    public static boolean checkBienKSOto(String className){
        String regex= "^\\d{2}[AB]\\-\\d{3}\\.\\d{2}$";
        return className.matches(regex);
    }

    public static boolean checkBienKSXeMay(String className){
        String regex= "^\\d{2}\\-[A-Z]{1}[0-9A-Z]\\-\\d{3}\\.\\d{2}$";
        return className.matches(regex);
    }

    public static boolean checkBienKSXeTai(String className){
        String regex= "^\\d{2}[C]-\\d{3}\\.\\d{2}$";
        return className.matches(regex);
    }
}
