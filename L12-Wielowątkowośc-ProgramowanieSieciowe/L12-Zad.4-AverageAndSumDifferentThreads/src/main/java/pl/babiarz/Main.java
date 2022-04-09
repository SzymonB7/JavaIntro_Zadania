package pl.babiarz;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,7,5,12);

        Runnable firstTask = () -> {
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
                System.out.println("sum: " + sum);
            }
        };

        Runnable secondTask = () -> {
            double sum = 0;
            for (Integer number : numbers) {
                sum += number;
                System.out.println("Average: " + sum / numbers.size());
            }
        };

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        firstThread.start();
        secondThread.start();
    }
}
