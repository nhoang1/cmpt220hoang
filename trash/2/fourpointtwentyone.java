import java.util.Scanner;

public class fourpointtwentyone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your SSN in the format DDD-DD-DDDD:");
		String ssn = input.next();
		
		if ((ssn.length() == 11) && ((ssn.charAt(3) == '-') && (ssn.charAt(6) == '-'))) {
			if ( (Character.isDigit(ssn.charAt(0)))
				 && (Character.isDigit(ssn.charAt(1)))
				 && (Character.isDigit(ssn.charAt(2)))
				 && (Character.isDigit(ssn.charAt(4)))
				 && (Character.isDigit(ssn.charAt(5)))
				 && (Character.isDigit(ssn.charAt(7)))
				 && (Character.isDigit(ssn.charAt(8)))
				 && (Character.isDigit(ssn.charAt(9)))
				 && (Character.isDigit(ssn.charAt(10)))) {
					System.out.print (ssn + " is a valid social security number");
			} else {
				System.out.print (ssn + " is not a valid social security number");
			}		
		} else { 
			System.out.print (ssn + " is not a valid social security number");
		}
		
	}
}
