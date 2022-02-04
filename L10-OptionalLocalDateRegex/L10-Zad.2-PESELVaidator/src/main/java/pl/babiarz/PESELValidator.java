package pl.babiarz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELValidator {
    static final Pattern pattern = Pattern.compile("^([0-9]{11})$");
        public boolean isValid(String pesel){
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();
    }
}
