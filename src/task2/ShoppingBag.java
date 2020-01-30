package task2;

import javax.swing.*;
import java.util.Arrays;

import static java.lang.StrictMath.abs;

public class ShoppingBag {

    Purchase [] purchases = new Purchase[2];

    public void addPurchase(Purchase purchase){
        int j=-1;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i]==null){
                purchases[i] = purchase;
                j=i;
                break;
            }
            else {
                if ((purchases[i].getName() == purchase.getName()) &&
                        (abs(purchases[i].getPrice() - purchase.getPrice())<0.01)){
                purchases[i].addAmount(purchase.getAmount());
                j=i;
                break;
                }

            }

        }
        if (j==-1)   System.out.println("Sorry, bag is full!");

    }

    @Override
    public String toString() {
        return "ShoppingBag{" +
                "purchases=" + Arrays.toString(purchases) +
                '}';
    }
}
