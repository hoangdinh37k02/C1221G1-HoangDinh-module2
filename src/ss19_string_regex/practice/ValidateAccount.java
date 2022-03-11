package ss19_string_regex.practice;

public class ValidateAccount {
    public static boolean checkAccount(String account){
        String regex = "^[_a-z0-9]{6,}$";
        return account.matches(regex);

    }


    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String account:validAccount) {
            boolean isCheck = checkAccount(account);
            System.out.println("The account: "+account+" is valid: "+isCheck);
        }

        for (String account:invalidAccount) {
            boolean isCheck = checkAccount(account);
            System.out.println("The account: "+account+" is valid: "+isCheck);
        }
    }
}
