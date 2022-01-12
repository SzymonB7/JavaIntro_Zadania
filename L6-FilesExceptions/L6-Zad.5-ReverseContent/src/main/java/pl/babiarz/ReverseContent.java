package pl.babiarz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ReverseContent {
    public static void main(String[] args) throws IOException {
        String text = Files.readString(Path.of("src/main/resources/data.txt"));
        String reverseText = "";
        char character;
        for (int i = text.length() - 1; i >= 0; i--) {
            character = text.charAt(i);
            reverseText = reverseText + character;
        }
        System.out.println(reverseText);
    }
}
