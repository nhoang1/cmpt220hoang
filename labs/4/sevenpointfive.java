package Lab4;

import java.util.Scanner;

public class sevenpointfive {
	/** Main Method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] myArray = new int[10]; 
		int count = 0;			

		for (int i = 0; i < 10; i++) {
			int num = input.nextInt();
			if (isDistinct(myArray, num)) {
				myArray[count] = num;
				count++;
			}
		}

		System.out.println("There are " + count + " distinct numbers");
		System.out.print("The numbers are ");
		
		for (int j = 0; j < 10; j++) {
			if (myArray[j] >= 0)
				System.out.print(myArray[j] + " ");
		}
		System.out.println();
	}


	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}
