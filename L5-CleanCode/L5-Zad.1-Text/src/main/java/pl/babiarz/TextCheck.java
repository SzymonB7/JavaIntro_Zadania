package pl.babiarz;

public class TextCheck {
    public static boolean isNotEmpty(String text) {
        return !text.isEmpty();
    }
    public static boolean isTextPalindrome(String text) {
        if (isNotEmpty(text)) return Palindrome.isPalindrome(text);
        return false;
    }
    public static int getTextLength(String text){
        if (isNotEmpty(text)) return text.length();
        return 0;
    }
}
