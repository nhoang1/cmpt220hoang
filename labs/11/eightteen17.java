package Lab11;

import java.util.Scanner;

public class eightteen17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters (no spaces between entries): ");
		String s = input.nextLine();
		char[] array = new char[s.length()]; 
		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
		}
		System.out.print("Enter a character: ");
		String a = input.next();
		System.out.print("The character " + a.charAt(0) + " is found " + count(array, a.charAt(0)) + " times in the list");  
	}		
	
	public static int count (char[] chars, char a) {
		return count (chars, a, chars.length - 1);
	}
	public static int count (char[] chars, char a, int high) {
		if (high < 0) {
			return 0;
		} else if (chars[high] == a) {
			return 1 + count (chars, a, high - 1);
		} else {
			return count (chars, a, high - 1);
		}
		
	}
}