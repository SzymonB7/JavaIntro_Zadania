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

    public void setName(String name) {
        this.name = name;
    }

    public void setVegeterian(boolean vegeterian) {
        isVegeterian = vegeterian;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
