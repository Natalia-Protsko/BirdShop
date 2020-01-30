package Cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> items;

    List<Product> products;

    public Menu(){
        items = new ArrayList<MenuItem>();
        products = new ArrayList<Product>();
    }

    public void InitMenu(){
        initProducts();
        createDefaultMenu();
    }


    public void initProducts(){
        Product coffee = new Product("coffee",1000);
        Product water = new Product("water",20);
        Product tea = new Product ("tea", 500);
        Product sugar = new Product("sugar",50);
        Product milk = new Product("milk",30);
        products.add(coffee);
        products.add(water);
        products.add(tea);
        products.add(sugar);
        products.add(milk);

    }

    public  Product getProduct(String name){
        Product res = null;
        for (Product product : products) {
            if (product.getName().equals(name)){
                res = product;
                break;
            }
        }
        return res;
    }

    public void createDefaultMenu(){
        MenuItem americano = new MenuItem("Americano");
        americano.addIngredient(getProduct("coffee"),0.01);
        americano.addIngredient(getProduct("water"),0.150);
        americano.addIngredient(getProduct("sugar"),0.05);
        items.add(americano);
    }


    public void addItem(MenuItem item){
        items.add(item);
    }

    public double getPriceForCustomDrink(List<Ingredient> ingredients ){
        double res = 0;
        for (Ingredient ingredient : ingredients) {
            res += ingredient.getPrice();

        }
       return res;

    }


    public void print(){
        for (MenuItem item : items) {
            System.out.println(item.name+":"+item.getPrice());

        }
    }

}
