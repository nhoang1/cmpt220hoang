package Lab6;
import java.util.GregorianCalendar;

public class ninepointfive {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("The date is: " + calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
		calendar.setTimeInMillis (1234567898765L);
		System.out.print("1234567898765L miliseconds since 1/1/1970 is " + calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR)  );
	}

}
