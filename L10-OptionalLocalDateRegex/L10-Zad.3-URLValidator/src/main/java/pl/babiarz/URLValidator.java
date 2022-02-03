package pl.babiarz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {
    static final Pattern pattern = Pattern.compile("((http|https)://)(www.)?"
            + "[a-zA-Z0-9@:%._\\+~#?&//=]"
            + "{2,256}\\.[a-z]"
            + "{2,6}\\b([-a-zA-Z0-9@:%"
            + "._\\+~#?&//=]*)");

    public static boolean isValid(String url){
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String url1 = "http://www.onet.pl";
        String url2 = "https://mail.google.com";
        String url3 = "http://wiadmosci.onet.pl";
        String url4 = "http://onet.pl";


        System.out.println(URLValidator.isValid(url1));
        System.out.println(URLValidator.isValid(url2));
        System.out.println(URLValidator.isValid(url3));
        System.out.println(URLValidator.isValid(url4));
    }
}

