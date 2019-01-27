import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToDay {

	public static void main(String[] args) {
		String input_date="27/01/2019";
		dateToDay(input_date);


	}

	public static String dateToDay(String input_date) {
		
		String input_date_format=null;
		
		 if (input_date.matches( "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-([12][0-9]{3})$"))
		{
			System.out.println("Pattern Matched-> dd-MM-yyyy");
			input_date_format="dd-MM-yyyy";
		}
		else if (input_date.matches( "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/([12][0-9]{3})$"))
		{
			System.out.println("Pattern Matched-> dd/MM/yyyy");
			input_date_format="dd/MM/yyyy";
		}
		
		 String finalDay="Invalid Format:  Use dd-MM-yyyy OR dd/MM/yyyy";
		try {
			SimpleDateFormat format1=new SimpleDateFormat(input_date_format);
			Date dt1;
			dt1 = format1.parse(input_date);
			DateFormat format2=new SimpleDateFormat("E"); 
			finalDay=format2.format(dt1).toUpperCase();
			System.out.print(finalDay.toUpperCase());
		} catch (ParseException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("Invalid Date Format- Please use dd-MM-yyyy OR dd/MM/yyyy");
		}
		return finalDay;
	}

}
