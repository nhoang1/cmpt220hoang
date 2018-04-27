package Lab11;
import java.util.Scanner;

public class eightteen11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		System.out.print(sumDigits(input.nextLong()));
	}

	private static long sumDigits (long n) {
		if (n == 0) {
			return n;
		} else {
			return (n%10 + sumDigits (n/10));
		}
	}
}
