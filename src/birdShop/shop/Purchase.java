package birdShop.shop;

import birdShop.model.Bird;
import birdShop.model.Client;

public class Purchase {
    private Client client;
    private Bird bird;
    private int amount;
    private double price;
    private EStatus status;

    public Purchase(){
        status = EStatus.NEW;

    }

    public Purchase(Client client, Bird bird, int amount) {
        this();
        this.client = client;
        this.bird = bird;
        this.amount = amount;
    }

    public Purchase(Client client, Bird bird, int amount, double price) {
        this.client = client;
        this.bird = bird;
        this.amount = amount;
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        if (status == EStatus.NEW) {
            this.client = client;
           }
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        if (status==EStatus.NEW){
            this.bird = bird;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (status==EStatus.NEW) {
            this.amount = amount;
        }
    }

    public double getPrice(){
        if (status==EStatus.NEW){
            return (bird==null)?0:bird.getPrice()*amount;
        }
        else {
            return price;
        }
    }

    public Purchase sell(){
        if (status==EStatus.NEW && null!=client && null!=bird && amount>0){
            if (bird.getAmount()>amount){
                bird.setAmount(bird.getAmount()-amount);
                price = bird.getPrice()*amount*((100-client.getClientDiscount())/100);
                status = EStatus.DONE;
                return this;
             }
        }
        return null;
    }
}
