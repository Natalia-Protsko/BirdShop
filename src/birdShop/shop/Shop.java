package birdShop.shop;

import birdShop.model.Bird;
import birdShop.model.Client;
import birdShop.storage.IStorage;

import java.util.ArrayList;
import java.util.List;

public class Shop implements IShop {
    private IStorage storage ;
    private List<Purchase> purchases;

    public Shop() {
        purchases = new ArrayList<Purchase>();
    }

    public IStorage getStorage() {
        return storage;
    }

    public void setStorage(IStorage storage) {
        this.storage = storage;
    }

    @Override
    public void sell (Client client, String birdName, int amount) {
        Bird bird = storage.getByType(birdName);
        if (bird == null) {
            System.out.println("Bird " + birdName + "not found");
            return;
        }
        if (bird.getAmount() < amount) {

            System.out.println("Amount in storage is less than required ");
            return;
        }

        bird.setAmount(bird.getAmount()-amount);
        double price = bird.getPrice()*amount*((100-client.getClientDiscount())/100);
        Purchase purchase = new Purchase(client, bird, amount, price);
        purchases.add(purchase);
        System.out.println("-- Client "+client.getName()+" bough "+amount+" "+birdName);

    }

    @Override
    public List<Purchase> getPurchases() {
        return purchases;
    }

    void doReport1(){

    }





}
