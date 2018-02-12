import java.util.Scanner;
// JA: This is not finding the prime factors. 
// A simple logic is to try all the numbers starting from 2
public class fivepointsixteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int number = input.nextInt();
		int factors;
		if (isPrime (number)) {
			System.out.print("The prime factors are: " + number + " ");
			for (int i = 1; i < number; i++) {
				factors = number % i;
				if (factors == 0 && isPrime(i))
					System.out.print(i + " ");
				}
		} else {
			System.out.print("The prime factors are: ");
			for (int i = 1; i < number; i++) {
				factors = number % i;
				if (factors == 0 && isPrime(i))
					System.out.print(i + " ");
			}
		}
	}	
		
	
	public static boolean isPrime (int n) {
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}

		}
		return prime;
	}

}


  