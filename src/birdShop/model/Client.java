package birdShop.model;

public class Client {
    private String name;

    private int personalDiscount;

    private int accumulativeDiscount;

    public Client() {
        personalDiscount = 0;
        accumulativeDiscount = 0;
    }

    public Client(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(int personalDiscount) {
        if (personalDiscount>0  && personalDiscount < 90){    this.personalDiscount = personalDiscount;}
    }

    public int getAccumulativeDiscount() {
        return accumulativeDiscount;
    }

    public void setAccumulativeDiscount(int accumulativeDiscount) {
            if (personalDiscount>0  && personalDiscount < 90){  this.accumulativeDiscount = accumulativeDiscount;}
    }

    public int getClientDiscount(){
        return Math.max(personalDiscount, accumulativeDiscount);
    }
}
