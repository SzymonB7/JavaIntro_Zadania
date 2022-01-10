package pl.babiarz;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while (i < j) {
            if (text.charAt(1) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
