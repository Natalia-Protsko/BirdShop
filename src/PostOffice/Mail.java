package PostOffice;

public class Mail {

    String text;
    Client sender;
    Client receiver;
    String status;


    public Mail(String test, Client sender, Client receiver) {
        this.text = test;
        this.sender = sender;
        this.receiver = receiver;
        status = "New";
    }

    public boolean receiveByName(String name){
        return receiver.equals(name) && receive();
    }

    public boolean receiveByReceiver(Client receiver){
        return this.receiver.equals(receiver) && receive();
    }

    boolean isReceived(){
        return status.equals("Received");
    }

    boolean send(){
        if (status.equals("New")){
            status = "Sent";
            return true;
        } else {
            System.out.println("Mail can not be send: status = "+status);
            return false;
        }
    }

    boolean receive(){
        if (status.equals("Sent")){
            status = "Received";
            return true;

        }else {
            System.out.println("Mail can not be received: status = "+status);
            return false;
        }
    }


}
