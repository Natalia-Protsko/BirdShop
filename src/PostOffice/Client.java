package PostOffice;

public class Client {
    String name;

    public Client(final String name) {
        this.name = name;
    }

    public boolean equals(Client client){
        return  this.name.equals(client.name);
    }

    public boolean equals(String clientName){
        return (null!=clientName && this.name.equals(clientName));
    }

}
