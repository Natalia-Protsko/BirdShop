package task2;

import vacation.Trip;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Launcher {
    public static void main(String[] args) throws ParseException {
        ShoppingBag shoppingBag = new ShoppingBag();
        System.out.println(shoppingBag);

        shoppingBag.addPurchase(new Purchase("Bread", (float) 3.12, 1));
        shoppingBag.addPurchase(new Purchase("Bread", (float) 3.12, 5));
        shoppingBag.addPurchase(new Purchase("Meat", (float) 5.15, 1));

        shoppingBag.addPurchase(new Purchase("Candy", (float) 7, 6));

        System.out.println(shoppingBag);


       
    }
}
