package Cafe;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.InitMenu();

        menu.print();

        List<Ingredient> ingredientsForMyDrink = new ArrayList();
        ingredientsForMyDrink.add(new Ingredient(menu.getProduct("                  tea"),0.02));
        ingredientsForMyDrink.add(new Ingredient(menu.getProduct("water"),0.2));
        ingredientsForMyDrink.add(new Ingredient(menu.getProduct("milk"),0.05));


        System.out.println("Price for custom drink: "+menu.getPriceForCustomDrink(ingredientsForMyDrink));
    }
}
