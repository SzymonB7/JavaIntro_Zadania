package pl.babiarz;

public class TextCheck {
    public static boolean isNotEmpty(String text) {
        return !text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        if (isNotEmpty(text)) {
            return Palindrome.isPalindrome(text);
        }
        return false;
    }

}
