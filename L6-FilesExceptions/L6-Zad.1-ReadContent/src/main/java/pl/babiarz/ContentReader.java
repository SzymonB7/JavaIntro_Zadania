package pl.babiarz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ContentReader {
    public static void main(String[] args) throws IOException {
    String text = Files.readString(Path.of("src/main/resources/data.txt"));
        System.out.println(text);
    }
}
