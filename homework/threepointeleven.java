import java.util.Scanner;

public class threepointeleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = input.nextInt();
		System.out.println("Enter the year");
		int year = input.nextInt();
		String monthName = "none";
		int monthDay = 0;
		
		switch (month) {
			case 1:
				monthName = "January";
				monthDay = 31;
				break;
			case 2:
				monthName = "Febuary";
				if ((year % 400 == 0)||((year % 4 == 0)&&(year % 100 != 0))) {
					monthDay = 29;
				} else {
					monthDay = 28;
				}
				break;
			case 3:
				monthName = "March";
				monthDay = 31;
				break;
			case 4:
				monthName = "April";
				monthDay = 30;
				break;
			case 5:
				monthName = "May";
				monthDay = 31;
				break;
			case 6:
				monthName = "June";
				monthDay = 30;
				break;
			case 7:
				monthName = "July";
				monthDay = 31;
				break;
			case 8:
				monthName = "August";
				monthDay = 31;
				break;
			case 9:
				monthName = "September";
				monthDay = 30;
				break;
			case 10:
				monthName = "October";
				monthDay = 31;
				break;
			case 11:
				monthName = "November";
				monthDay = 30;
				break;
			case 12:
				monthName = "December";
				monthDay = 31;
				break;
			
		}
			
		System.out.print("There is " + monthDay + " days in " + monthName + " " + year  );
		

	}

}
