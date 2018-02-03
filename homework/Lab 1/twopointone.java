import java.util.Scanner;

public class twopointone {

	public static void main(String[] args) {
		//1. Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight in Celsius (C) as an integer");
		int celsius = input.nextInt();
		
		//2. Convert to fahrenheit
		double fahrenheit = (9.0/5) * celsius + 32;
		
		//3. Output the value in fahrenheit 
		System.out.println (celsius + " degree celsius is " + fahrenheit + " degree fahrenheit");;
	}
}

