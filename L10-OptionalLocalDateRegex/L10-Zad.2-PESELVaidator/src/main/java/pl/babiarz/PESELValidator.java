package pl.babiarz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELValidator {
        public boolean isPeselValid(String pesel){
        Pattern pattern = Pattern.compile("^([0-9]{11})$");
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();
    }
}
