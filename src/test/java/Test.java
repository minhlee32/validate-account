public class Test {
    private static void isValidate() {
        AccountEg accountEg = new AccountEg();
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
