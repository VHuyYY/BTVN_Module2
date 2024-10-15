package Ss19.String_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static final String REGEX = "^[CAP 0-9{4} GHIK]{6}$";

    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidateName v = new ValidateName();
        System.out.println(v.validateName("C06"));
        System.out.println(v.validateName("H05"));
    }
}
