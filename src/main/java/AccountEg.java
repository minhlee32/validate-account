import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountEg {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountEg() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }




}
