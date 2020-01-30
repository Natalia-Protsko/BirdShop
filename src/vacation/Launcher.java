package vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Launcher {
    public static void main(String[] args) throws ParseException {
        Trip t = new Trip();

        SimpleDateFormat sdf  =  new SimpleDateFormat("MM/dd/yyyy", Locale.UK);
        t.start = sdf.parse("05/01/2020");
        t.finish = sdf.parse("05/10/2020");
        t.destination = "Italia";
        t.price = 1000;
        System.out.println(t);

        t.moveForward(5);
        System.out.println(t);

        Trip [] trips = new Trip [5];
        System.out.println(t.b);

        trips[0]= t;

        System.out.println(trips[0]);

    }
}
