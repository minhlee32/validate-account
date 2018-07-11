import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountEg {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private static AccountEg accountEg = new AccountEg();

    public AccountEg() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }

    private static void isValidate() {
        boolean isValid;
        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
        for (String account : validAccount) {
            isValid = accountEg.validate(account);
            System.out.println("Account is " + account + "is valid: " + isValid);
        }

        for (String account : invalidAccount) {
            isValid = accountEg.validate(account);
            System.out.println("Account is " + account + "is valid: " + isValid);
        }
    }

    public static void main(String[] args) {
        isValidate();
    }



}
