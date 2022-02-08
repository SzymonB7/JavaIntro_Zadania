package pl.babiarz;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Bułka","Kożuch","Bambaryło");

        words
                .stream()
                .map(String::toUpperCase)
                .map(String::chars)
                .flatMap(s -> s.mapToObj(n ->  (char)n))
                .distinct()
                .forEach(System.out::println);
    }
}
