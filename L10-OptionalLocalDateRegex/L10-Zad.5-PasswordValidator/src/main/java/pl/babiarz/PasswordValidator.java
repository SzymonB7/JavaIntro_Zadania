package pl.babiarz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean isPasswordValid (String password){
        Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])(?!.*?(?:2022|22)).*[A-Za-z0-9]{7,}$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
