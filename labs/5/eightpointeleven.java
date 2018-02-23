package Lab5;
import java.util.Scanner;
public class eightpointeleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] binaryMatrix = new int[3][3];
		System.out.print("Enter a number between 0 and 511: ");
		String binaryString = length9(input.nextInt());
    		setMatrix (binaryString, binaryMatrix);
	
		for (int i = 0; i < binaryMatrix.length; i++) {
			for (int j = 0; j < binaryMatrix[i].length; j++) {
				if (binaryMatrix[i][j] == 0) {
					System.out.print ("H ");
				} else if (binaryMatrix[i][j] == 1) {
					System.out.print ("T ");
				}
			}
			System.out.println();
		}
	}
	
	public static void setMatrix (String binaryString, int[][] binaryMatrix) {
		int index = 0;
		for (int i = 0; i < binaryMatrix.length; i++) {
			for (int j = 0; j < binaryMatrix[i].length; j++) {
				binaryMatrix[i][j] = Character.getNumericValue(binaryString.charAt(index));
				index++;
			}
		}
	}
	
	public static String length9(int number) {
		String binaryString = Integer.toBinaryString(number);
		int length = binaryString.length();
		
		for (int i = 0; i < (9-length); i++) {
			binaryString = (0 + binaryString);	
		}
		return binaryString;
	}
}
