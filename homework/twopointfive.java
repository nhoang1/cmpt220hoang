import java.util.Scanner;

public class twopointfive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal as an integer");
		int subtotal = input.nextInt();
		System.out.print("Enter the tip percentage as an integer");
		int tip = input.nextInt();
		double tipAmount = subtotal * tip / 100.00; 
		double total = subtotal + tipAmount;
		System.out.print ("The tip is " + tipAmount + "$ and the total is " + total +"$");
	}

}
