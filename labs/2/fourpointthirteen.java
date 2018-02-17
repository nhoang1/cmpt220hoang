import java.util.Scanner;

public class fourpointthirteen {

	public static void main(String[] args) {
		
		boolean vowelOrNah = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character from A to Z : ");
		char character = input.next().charAt(0);
		
		switch(character) {
		   case 'a' :
		   case 'e' :
	    	   case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : vowelOrNah = true;
		}
		if (vowelOrNah == true) {
		   System.out.println ( character + " is  a Vowel");
		} else {
			if (((character >= 'a') && (character <='z'))||((character >= 'A') && (character <= 'Z'))) {
			   System.out.println(character +" is a Consonant");
			} else {
			System.out.println("Input is not an alphabet");
			}
		}
	}
}
	
