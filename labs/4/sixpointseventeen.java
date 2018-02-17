package Lab4;
import java.util.Scanner;
import java.util.Random; 

public class sixpointseventeen {

	public static void main(String[] args) {
		System.out.print("Enter the dimension of the matrix: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int k=0; k<a; k++) {
			for (int d = 0; d<a; d++) {
				double n = Math.random() * 1;
				System.out.printf("%-1.0f", n);
			}
			System.out.println();
		}
	}

}
