package birdShop.model;

public class Bird {
    private String type;
    private double price;
    private int amount;

    public Bird(String type, double price, int amount) {
        this.type = type;
        this.price = price;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
