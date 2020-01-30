package hierarchy;

public class Posting {
    String description;
    String sender;
    String receiver;
    String state;

    public Posting (String description){
        this.description = description;
    }

    void say(){
        System.out.println("Posting");
    }

    public Posting(){
        this.state = "New";
        System.out.println("Posting default constructor");
    }

    public Posting(String description, String sender, String receiver) {
        this();
        System.out.println("Posting parametrized constructor");
        this.description = description;
        this.sender = sender;
        this.receiver = receiver;
    }

    public void printInfo(){
        System.out.println( "Posting{" +
                "description='" + description + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", state='" + state + '\'' +
                '}');
    }

    public void printDescription(){
        System.out.println("Posting description is "+this.description);
    }

}
