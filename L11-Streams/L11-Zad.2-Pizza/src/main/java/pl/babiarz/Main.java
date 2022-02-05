package pl.babiarz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("Pepperoni", false, 2000, List.of("salami", "papryka", "cebula"));
        Pizza pizza2 = new Pizza("Wegetariańska", true, 1700, List.of("mozarella", "seler", "pieczarki"));
        Pizza pizza3 = new Pizza("Margherita", true, 1600, List.of("mozarella"));
        Pizza pizza4 = new Pizza("Funghi", true, 1700, List.of("pieczarki", "cebula"));
        Pizza pizza5 = new Pizza("Bombastico", false, 2100, List.of("salami", "papryka", "mozarella", "seler", "pomidor", "pieczarki", "cebula"));
        Pizza pizza6 = new Pizza("Seleriana", true, 1650, List.of("seler", "cebula"));
        Pizza pizza7 = new Pizza("Pomodoro", true, 1750, List.of("pomidor", "mozarella"));
        Pizza pizza8 = new Pizza("Salamio", false, 2000, List.of("salami", "pomidor", "pieczarki"));
        Pizza pizza9 = new Pizza("Calabria", false, 2050, List.of("salami", "mozarella", "pomidor", "pieczarki"));
        Pizza pizza10 = new Pizza("Pipparipuppi", false, 2100, List.of("salami", "papryka", "mozarella", "pomidor", "cebula"));

        List<Pizza> menu = new ArrayList<>();
        menu.addAll(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10));

        System.out.println("Dania wegetariańskie:\n");
        menu
                .stream()
                .filter(pizza -> pizza.isVegeterian())
                .map(pizza -> pizza.getName())
                .forEach(System.out::println);
        System.out.println("\nDania z alergenami:\n");
        menu
                .stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(pizza -> pizza.getName())
                .forEach(System.out::println);

        menu
                .stream()
                .filter(pizza -> pizza.isVegeterian())
                .anyMatch(pizza -> pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"));

        menu
                .stream()
                .allMatch(pizza -> pizza.getIngredients().contains("mozarella"));


        menu
                .stream()
                .map (pizza -> pizza.getCalories())
                .reduce((a, b) -> Integer.max(a, b));

        menu
                .stream()
                .map (pizza -> pizza.getCalories())
                .reduce((a, b) -> Integer.min(a, b));
    }
}
