package pl.babiarz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersDivisibleBy3 = IntStream.range(0,30)
                .filter(num -> num % 3 == 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        numbersDivisibleBy3
                .forEach(System.out::println);
    }
}
