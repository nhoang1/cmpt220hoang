//package Lab5;
import java.util.Scanner;

public class sevenpointnineteen {

	public static void main(String[] args) {
		System.out.print("Enter list: ");
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[input.nextInt()]; 		//The first input is the length of the array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();				//Put the rest of the inputs into the array
		}
		
		if (isSorted(numbers)) {							//if sorted prints...
			System.out.print("The list is sorted");
		} else {											//if not sorted prints...
			System.out.print("The list is not sorted");
		}
	}
	
	public static boolean isSorted (int[] a) {
		//compare each element of the array with the element next to it
		boolean sorted = true;
		for (int i = 0; i < (a.length-1) ; i++) { 		//(a.length-1) is so that the last element doesn't go over the array limit
			if (a[i] < a[i+1]) {
				sorted = true;
			} else {
				sorted = false;
				break; // JA: you only need one to say it's not sorted
			}
		}
		return sorted;
	}

}
