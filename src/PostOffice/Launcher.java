package PostOffice;

import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        Client anna = new Client("Anna");
        Client john = new Client("John" );

        PostOffice office = new PostOffice();

        office.sendMail(new Mail("Hi John, it's Anna",anna, john));

        office.printReport("First report");

        office.sendMail(new Mail("Hi Anna, it's John",john, anna));

        office.sendMail(new Mail("Hi my dear Anna, it's Anna",anna, anna));

        office.printReport("Second report");

        office.receiveMails(anna);

        office.printReport("Third report");

        System.out.println(" -- copies of mails sent by Anna-- ");
        List<Mail> copies = office.getCopy(anna,null);
        for (Mail copy : copies) {
            System.out.println(copy.text);
        }
     }




}
