//package Lab6;
import java.util.Scanner;

public class Location {
	int row;
	int column; 
	double maxValue;
	
	public static Location locateLargest(double[][] a) {
		Location largestLocation = new Location();
	    largestLocation.maxValue = a[0][0];

	    for (int i = 0; i < a.length; i++) {
	      for (int j = 0; j < a[0].length; j++) {
	        if (largestLocation.maxValue < a[i][j]) {
	          largestLocation.maxValue = a[i][j];
	          largestLocation.row = i;
	          largestLocation.column = j;
	        }
	      }
	    }
	    
	    return largestLocation;
	  }


	public static void main (String[] Args) {
		Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter the number of row and columns of the array ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] list = new double[row][column];

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				System.out.print("Enter number " + j + " in row " + i + ": ");
				list[i][j] = input.nextDouble();
		    }
		}
		
		Location largestLocation = locateLargest (list);
		System.out.print("The largest element " + largestLocation.maxValue + " is located at ("
					+ largestLocation.row + ", " + largestLocation.column + ")");
	}
}
