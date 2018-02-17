package Lab4;
import java.util.Scanner;

public class sevenpointeleven {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] numbers = new double[10]; 

		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		
		System.out.println("Mean: " + mean(numbers));
		System.out.print("Standard deviation: ");
		System.out.printf("%-15.4f", deviation(numbers));
	}

	public static double deviation(double[] a) {
		double deviation = 0;
		double mean = mean(a);
		for (double e: a) {
			deviation += Math.pow(e - mean, 2);
		}
		return Math.sqrt(deviation / (a.length - 1));
	}

	
	public static double mean(double[] a) {
		double mean = 0;
		for (int j = 0; j < a.length; j++) {
			mean += a[j];
		}
		return mean / a.length;
	}
}