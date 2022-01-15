package pl.babiarz;

import java.util.Objects;

public class UpperCase {
    public static String convertToUpperCase(String text){
        if (Objects.isNull(text) || text.equals("")) {
            throw new InvelidArgumentException();
        }
        return text.toUpperCase();
    }
}
