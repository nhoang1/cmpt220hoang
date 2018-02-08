import java.util.Scanner;

public class sixpointfive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 different numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if ((a == b) || (a == c) || (b == c)) {
			System.out.println("The numbers are not different");
		} else {
			displaySortedNumbers (a,b,c);
		}

	}

	public static void displaySortedNumbers (double num1, double num2, double num3) {
		double max = 0;
		double min = 0;
		double mid = 0;
		
		if ((num1 > num2) && (num1 > num3)) {
			max = num1;
		} else if ((num2 > num1) && (num2 > num3)) {
			max = num2;
		} else if ((num3 > num1) && (num3 > num1)) {
			max = num3;
		}
		
		if ((num1 < num2) && (num1 < num3)) {
			min = num1;
		} else if ((num2 < num1) && (num2 < num3)) {
			min = num2;
		} else if ((num3 < num1) && (num3 < num1)) {
			min = num3;
		}
		
		if ((num1 != min) && (num1 != max)) {
			mid = num1;
		} else if ((num2 != min) && (num2 != max)) {
			mid = num2;
		} else if ((num3 != min) && (num3 != max)) {
			mid = num3;
		}
		
		System.out.print("The numbers in increasing order are: " + min + " " + mid + " " + max);
	}
}
