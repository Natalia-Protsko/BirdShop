package birdShop.report;

import birdShop.model.Bird;
import birdShop.shop.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Report {

    private class Node{
        String name;
        int amount;
        double price;
    }

    List<Node> rows = new ArrayList<>();

    List<Purchase> purchases;

    Function<Purchase,String> fn;

    String header;

    public Report(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Report(List<Purchase> purchases, Function<Purchase, String> fn, String header) {
        this.purchases = purchases;
        this.fn = fn;
        this.header = header;
    }

    public Report(Function<Purchase,String> fn, String header){
        this.fn = fn;
        this.header = header;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    private Node getRow( String name){
        for (Node row : rows) {
            if (row.name.equals(name)){
                return row;
            }
        }
        Node row = new Node();
        rows.add(row);
        return row;
    }

    private void prepare(/*Function<Purchase, String> fn*/){
        rows = new ArrayList<>();
        for (Purchase purchase : purchases) {
           String key = fn.apply(purchase);
           Node row =  getRow(key);
           row.name = key;
           row.amount+=purchase.getAmount();
           row.price+=purchase.getPrice();

        }
    }

    private void print (){
        System.out.println("------------");
        System.out.println("- "+this.header+" -");
        System.out.println("------------");
        for (Node row : rows) {
            System.out.println(row.name+":   " +row.amount+"   $"+row.price);
        }
    }

    public void doReport(/*List<Purchase> purchases*/){
        //this.purchases = purchases;
        prepare(/*(purchase -> purchase.getBird().getType())*/);

        //prepare((purchase -> purchase.getClient().getName()));
        print();
    }

    public void doReport(Function<Purchase,String> fn, String header){
        this.fn = fn;
        this.header = header;
        doReport();
    }
}
