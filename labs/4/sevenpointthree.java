//package Lab4;
import java.util.Scanner;

public class sevenpointthree {
	
	public static void main(String[] args) {
		int[] myArray = new int[100];
		System.out.print("Enter the integers between 1 and 100: ");
		
		countOccrur(myArray);

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == 1) {
				System.out.println((i + 1) + " occurs " + myArray[i] + " time");
			} else if (myArray[i] > 1) {
				System.out.println((i + 1) + " occurs " + myArray[i] + " times");
			}
		}
	}
		

	public static void countOccrur(int[] myArray){
		Scanner input = new Scanner(System.in);
		int num;
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	{
				myArray[num - 1]++;
			}
		} while (num != 0);
	}
}