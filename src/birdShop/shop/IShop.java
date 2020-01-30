package birdShop.shop;

import birdShop.model.Bird;
import birdShop.model.Client;

import java.util.List;

public interface IShop {
    void sell(Client client, String birdName, int amount);

    List<Purchase> getPurchases();
}
