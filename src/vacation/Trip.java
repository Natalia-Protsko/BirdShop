package vacation;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Trip {
    int a = 5;
    int b = a+3;
    Date start;
    Date finish;
    String destination;
    float price;
    String feedback;



    long getDuration (){

        long diffInMillies = Math.abs(finish.getTime() - start.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return diff;

    }

    String getDateAsString(Date d){
        return (1900+d.getYear())+"/"+(d.getMonth()+1)+"/"+d.getDate();
    }

    float getPriceWithDiscount(int percent){
        return price*((100-percent)/100);
    }

    void moveForward(int days){
        start = new Date(start.getTime()+days*24*60*60*1000);
        finish = new Date(finish.getTime()+days*24*60*60*1000);
    }

    public String toString(){
        return "Destinstion is "+ destination+", from "+ getDateAsString(start)+" to "+ getDateAsString(finish )+"; price is "+price;
    }
}
