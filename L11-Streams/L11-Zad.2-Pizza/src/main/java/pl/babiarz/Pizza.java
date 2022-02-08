package pl.babiarz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String name;
    private boolean isVegeterian;
    private int calories;
    private List<String> ingredients;

    public Pizza(String name, boolean isVegeterian, int calories, List<String> ingredients) {
        this.name = name;
        this.isVegeterian = isVegeterian;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
