//package Lab5;
import java.util.Scanner;

public class eightpointfive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][]a = new double[3][3];
		double[][]b = new double[3][3];
		
		System.out.println("Enter the first matrix: ");
		for (int i = 0; i < a.length; i++ ) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Enter the second matrix: ");
		for (int z = 0; z < b.length; z++ ) {
			for (int x = 0; x < b[0].length; x++) {
				b[z][x] = input.nextDouble();
			}
		}
		
		if ((a.length == b.length) && (a[0].length == b[0].length)) {
			double[][]c = addMatrix (a, b);
			System.out.println("The matrices are added as follow: ");
			
			for (int m = 0; m < c.length; m++ ) {
				if (m == 1) {
					for (int n = 0; n < c[0].length; n++) {
						System.out.print(a[m][n] + " ");
					}
					
					System.out.print(" +  ");
					
					for (int t = 0; t < c[0].length; t++) {
						System.out.print(b[m][t] + " ");
					}
					
					System.out.print(" =  ");
					
					for (int g = 0; g < c[0].length; g++) {
						System.out.print(c[m][g] + " ");
					}
				} else if (m == 0 || m == 2) {
					for (int n = 0; n < c[0].length; n++) {
						System.out.print(a[m][n] + " ");
					}
					
					System.out.print("    ");
					
					for (int t = 0; t < c[0].length; t++) {
						System.out.print(b[m][t] + " ");
					}
					
					System.out.print("    ");
					
					for (int g = 0; g < c[0].length; g++) {
						System.out.print(c[m][g] + " ");
					}
				}
				System.out.println();
			}	
		
		
		} else {
			System.out.print("The matrices cannot be added");
		}
	}

	public static double[][] addMatrix (double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}