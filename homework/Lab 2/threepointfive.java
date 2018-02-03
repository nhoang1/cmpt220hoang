import java.util.Scanner;
public class threepointfive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day of the week (0 to 6)");
		int day1 = input.nextInt();
		System.out.println("Enter the number of days after today");
		int daysAfter = input.nextInt();
		int dayn = (day1 + daysAfter) % 7;
		
		String today = "na";
		String thatday = "na";
		
		
		switch (day1) {
			case 0:
				today = "Sunday";
				break;
			case 1:
				today = "Monday";
				break;
			case 2:
				today = "Tuesday";
				break;
			case 3:
				today = "Wednesday";
				break;
			case 4:
				today = "Thursday";
				break;
			case 5:
				today = "Friday";
				break;
			case 6:
				today = "Saturday";
				break;
			}
		
		switch (dayn) {
			case 0:
				thatday = "Sunday";
				break;
			case 1:
				thatday = "Monday";
				break;
			case 2:
				thatday = "Tuesday";
				break;
			case 3:
				thatday = "Wednesday";
				break;
			case 4:
				thatday = "Thursday";
				break;
			case 5:
				thatday = "Friday";
				break;
			case 6:
				thatday = "Saturday";
				break;
			}
		
		System.out.print("Today is " + today + " and " + daysAfter + " days after is " + thatday);
		}

	}

