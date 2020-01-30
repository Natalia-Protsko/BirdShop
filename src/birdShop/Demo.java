package birdShop;

import birdShop.model.Bird;
import birdShop.model.Client;
import birdShop.report.Report;
import birdShop.shop.Shop;
import birdShop.storage.IStorage;
import birdShop.storage.ListStorage;

public class Demo {

    public static void main(String[] args) {
        IStorage storage = new ListStorage();

        Shop shop = new Shop();
        shop.setStorage(storage);

        Client Ivan = new Client ("Ivan");
        Client Anna = new Client ("Anna");

        storage.add(new Bird("Eagle", 1000, 10));
        storage.add(new Bird("Pigeon", 1500, 20));
        storage.add(new Bird("Sparrow", 800, 30));

        storage.printStorage();

        shop.sell(Anna,"Eagle", 2);

        storage.printStorage();

        Report report = new Report(shop.getPurchases());

        report.doReport(purchase -> purchase.getBird().getType(), "REPORT BY BIRDS");


        storage.printStorage();
        shop.sell(Ivan,"Eagle", 1);
        shop.sell(Ivan,"Pigeon", 2);
        report.doReport(purchase -> purchase.getBird().getType(), "REPORT BY BIRDS");

        report.doReport(purchase -> purchase.getClient().getName(), "REPORT BY CLIENTS");



    }
}
