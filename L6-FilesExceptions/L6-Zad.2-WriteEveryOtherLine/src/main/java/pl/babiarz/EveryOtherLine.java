package pl.babiarz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EveryOtherLine {
    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of("src/main/resources/data.txt"));
        Scanner scanner = new Scanner(text);
        int i = 0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (i % 2 == 0){
            System.out.println(line);
            }
            i++;
        }
    }
}
