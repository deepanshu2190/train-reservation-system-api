import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayFromDate {

    public static void main(String[] args) {

        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate= formatter.format(now);
        System.out.println(strDate);
       
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println(simpleDateformat.format(now));

    }
}