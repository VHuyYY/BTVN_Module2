package Ss19.String_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String REGEX = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhone v = new ValidatePhone();
        System.out.println(v.validatePhoneNumber("(84)-(0931950503)"));
    }
}
