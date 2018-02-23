package Lab5;
import java.util.Scanner;

public class eightpointone {

	public static void main(String[] args) {
		System.out.print("Enter the 3-by-4 matrix row by row: ");
		Scanner input = new Scanner(System.in);
		
		double[][] matrix = new double[3][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}

		System.out.println("The sum of the 0 column is: " + sumColumn(matrix, 0));
		System.out.println("The sum of the 1 column is: " + sumColumn(matrix, 1));
		System.out.println("The sum of the 2 column is: " + sumColumn(matrix, 2));
		System.out.println("The sum of the 3 column is: " + sumColumn(matrix, 3));
		
	}
	
	public static double sumColumn (double[][] a, int columnIndex) {
		double m = 0;
		for (int i = 0; i < a.length; i++) {
			m += a[i][columnIndex];
		}
		return m;
	}
}
