package Lab4;
import java.util.Scanner;

public class sevenpointnine {
	/** Main method */
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] num = new double[10]; 
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0; i < 10; i++) {
			num[i] = input.nextDouble();
		}

		System.out.println("The minimum number is: " + min(num));
	}

	public static double min (double[] array) {
		double min = array[0];
		for (int j = 1; j < 10; j++) {
			if (array[j] < min) {
				min = array[j];
			}
		}
		return min;
	}
}