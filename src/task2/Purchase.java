package task2;

public class Purchase {

    private String name;
    private double price;
    private double amount;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    void addAmount(double a){
        amount = amount + a;
    }


    public Purchase(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                "}";
    }
}
