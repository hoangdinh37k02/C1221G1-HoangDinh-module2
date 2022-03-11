package ss19_string_regex.practice;

public class ValidateEmail {
    public static boolean checkEmail(String email){
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return email.matches(regex);
    }

    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        for (String email: validEmail) {
            boolean isValid = checkEmail(email);
            System.out.println("This email: "+email+ " is  valid: "+ isValid);
        }
        for (String email: invalidEmail) {
            boolean isValid = checkEmail(email);
            System.out.println("This email: "+email+ " is  valid: "+ isValid);
        }
    }
}
