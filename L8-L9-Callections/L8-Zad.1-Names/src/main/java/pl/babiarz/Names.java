package pl.babiarz;

import java.util.*;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.addAll(names);
        System.out.println(uniqueNames);
        Collections.reverse(names);
        System.out.println(names);
        ListIterator<String> iterator = names.listIterator();

        }


    }
}
