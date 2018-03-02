package Lab6;
import java.util.Date;

public class ninepointthree {
	
	public static void main(String[] args) {
		
		Date date = new Date();

		for (long y = 10000; y <= 1e11; y= y*10) {
			date.setTime(y);
			System.out.print("Time elapsed: " + y + " ");
			System.out.println(date.toString());
		}
	}
} 

