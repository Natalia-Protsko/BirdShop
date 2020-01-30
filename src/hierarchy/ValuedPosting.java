package hierarchy;

public class ValuedPosting extends Posting{
    double price;

    public ValuedPosting() {
        System.out.println("ValuedPosting default constructor");
    }

    public ValuedPosting(String description, String sender, String receiver, double price) {
        super(description, sender, receiver);
        this.price = price;
    }

    void say(){
        System.out.println("ValuedPosting");
    }


}
