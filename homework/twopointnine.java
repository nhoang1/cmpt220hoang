import java.util.Scanner;

public class twopointnine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0 v1 and t");
		int v0 = input.nextInt();
		int v1 = input.nextInt();
		int t = input.nextInt();
		
		double avAcel = ((v1/10.0*10.0) - (v0/10.0*10.0))/(t/10.0*10.0);
		
		System.out.print("The average acceleration is " + avAcel + " meters/second");
	}

}
