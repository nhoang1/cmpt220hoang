//package Lab9;
import java.util.Scanner;

public class twelvepointthree {

	public static void main(String[] args) {
		Integer[] array = new Integer[100];
		for (int i = 0; i<array.length ; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		System.out.print("Enter the index number: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		try {
			System.out.print("The element at index " + index + " is: " + array[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print("Out of bound");
		}

	}

}
