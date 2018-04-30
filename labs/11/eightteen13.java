//package Lab11;
import java.util.Scanner;
public class eightteen13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 8 elements in the array: ");
		int[] array = new int[8];
		for (int i = 0; i < 8; i++) {
			array[i] = input.nextInt();
		}
		System.out.print(findMax(array, array.length));
	}

	static int findMax(int[] a, int length){
	    if (length == 1) {
	    		return a[0];
	    } else {
	      return maxOf(findMax(a, length - 1), a[length - 1]);
	    }
	}
	
	private static int maxOf (int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
