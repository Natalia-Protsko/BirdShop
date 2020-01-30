package PostOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    List<Mail>  mails = new ArrayList<Mail>();

    void sendMail(Mail mail){
        if (mail.send()) {
            mails.add(mail);
        }
    }

    List<Mail> receiveMails(Client receiver){
        List<Mail> mailsReceived =  new ArrayList<Mail>();
        for (Mail mail : mails) {
            if (mail.receiveByReceiver(receiver)){
                mailsReceived.add(mail);
            }
        }
        return mailsReceived;
    }

    void printReport(String header){
        if (null!=header){
            System.out.println(header);
        }
        System.out.println("Sent: "+getAmountSent()+ ", Received: "+getAmountReceived());
    }

    int getAmountReceived(){
        int res = 0;
        for (Mail mail : mails) {
            res +=mail.isReceived()?1:0;
        }
        return res;
    }

    int getAmountSent(){
        return mails.size();
    }

    List<Mail> getCopy(Client sender, Client receiver){
        List<Mail> copies = new ArrayList<Mail>();
        for (Mail mail : mails) {
            if ((sender == null || sender.equals(mail.sender)) && (receiver == null || receiver.equals(mail.receiver))){
                copies.add(new Mail(mail.text, mail.sender, mail.receiver));
            }

        }
        return copies;
    }


}
