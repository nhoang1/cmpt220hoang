package Lab5;

import java.util.Scanner;

public class sevenpointfifthteen {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter ten numbers: ");
			int[] userArray = new int[10];
			for (int j = 0; j < 10; j++) {
				userArray[j] = input.nextInt();
			}
			
			int[] disAr = elimDup (userArray);
			System.out.print("The distinct numbers are: ");
			for (int z = 0; z < 10; z++) {
				if (disAr[z] > 0) {
					System.out.print(disAr[z] + " ");
				}
			}
			
		}
		
		
		public static int[] elimDup (int[] a) {
			int[] distinctArray = new int[10]; 
			int count = 0;	
			for (int i = 0; i < 10; i++) {
				int num = a[i];
				if (isDistinct(distinctArray, num)) {
					distinctArray[count] = num;
					count++;
				}
			}
			return distinctArray;
		}
						


		public static boolean isDistinct(int[] array, int num) {
			for (int i = 0; i < array.length; i++) {
				if (num == array[i]) 
					return false;
			}
			return true;
		}
	}

