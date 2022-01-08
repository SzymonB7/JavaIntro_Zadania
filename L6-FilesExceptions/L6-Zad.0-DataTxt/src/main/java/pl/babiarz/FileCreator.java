package pl.babiarz;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku";
        Files.writeString(Path.of("src/main/resources/data.txt"), text);
    }
}
