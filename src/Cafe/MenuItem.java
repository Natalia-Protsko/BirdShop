package Cafe;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    String name;
    List<Ingredient> ingredients;

    public MenuItem(String name) {
        this.name = name;
        ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Product product, double amount){
        ingredients.add(new Ingredient(product, amount));
    }

    public double getPrice(){
        double res = 0;
        for (Ingredient ingredient : ingredients) {
            res += ingredient.getPrice();
        }
        return res;
    }
}



