import java.util.Scanner;

public class sixpointthree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = input.nextInt();
		if (a < 0) {
			int n = a*(-1);
			if (isPalindrome (n)) {
				System.out.print(a + " is a palindrome");
			} else {
				System.out.print(a + " is not a palindrome");
			}
		} else if (isPalindrome (a)) {
			System.out.print(a + " is a palindrome");
		} else {
			System.out.print(a + " is not a palindrome");
		}
	}
	
	public static boolean isPalindrome (int a) {
		if (a == reverse(a)) {
			return true;
		} else {
			return false;
		}
	}


	public static int reverse(int a) {
		//Get the length of the int by converting it to str then get the length of the str
		String length = Integer.toString(a);
		//Initialize the final (reversed) number
		String finalNumber = "";
		
		/* Loop that repeats for the length of the int.
		  Every loop, the last digit of the int is extracted 
		  with % and then deleted by dividing by 10. The last 
		  digit is then converted to string and added to the
		  first character in the finalNumber string  */
		
		for (int i = 0; i < length.length(); i++) {
			int firstNumber = a%10;
			a = a/10;
			String firstNumber2String = Integer.toString(firstNumber);
			finalNumber = finalNumber + firstNumber2String;
		}
		
		//Cast the finalNumber string back into integer form
		int reversedNumber = Integer.parseInt(finalNumber);
		return reversedNumber;
	}

}