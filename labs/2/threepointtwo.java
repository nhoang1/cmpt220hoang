import java.util.Scanner;

public class threepointtwo {

	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int number3 = (int)(Math.random()*10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sum of " + number1 + ", " + number2 + ", and " + number3);
		
		int answer = input.nextInt();
		
		System.out.print("The sum of " + number1 + ", " + number2 + ", and " + number3 + " is " + answer);
	}

}
