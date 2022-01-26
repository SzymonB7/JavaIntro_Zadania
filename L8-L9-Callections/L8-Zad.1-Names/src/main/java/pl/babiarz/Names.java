package pl.babiarz;

import java.util.*;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);
        Collections.reverse(names);
        System.out.println(names);
        for (String name:names) {
            if (name.equals("Anna")){
                names.set(names.indexOf("Anna"), "Joanna");
            }
        }
        System.out.println(names);
    }
}



