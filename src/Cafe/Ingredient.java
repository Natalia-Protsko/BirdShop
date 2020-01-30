package Cafe;

public class Ingredient {
    Product product;
    double amount;

    public Ingredient(Product product, double amount ){
        this.product = product;
        this.amount = amount;
    }

    public double getPrice(){
        return product.getPrice()*amount;
    }
}
