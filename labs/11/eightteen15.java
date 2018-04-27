package Lab11;
import java.util.Scanner;
public class eightteen15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.print("Enter a character: ");
		String a = input.next();
		System.out.print("The character " + a.charAt(0) + " is found " + count(s, a.charAt(0)) + " times in the string " + s);  
	}		
	
	public static int count (String str, char a) {
		return count (str, a, str.length() - 1);
	}
	public static int count (String str, char a, int high) {
		if (high < 0) {
			return 0;
		} else if (str.charAt(high) == a) {
			return 1 + count (str, a, high - 1);
		} else {
			return count (str, a, high - 1);
		}
		
	}
}