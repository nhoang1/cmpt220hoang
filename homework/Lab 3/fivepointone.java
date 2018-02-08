import java.util.Scanner;
public class fivepointone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (the input ends if it is 0):");
		int data = input.nextInt();
		int senti = 0;
		int total = 0;
		double aver = 0;
		int sumPos = 0;
		int sumNeg = 0;
		int sum = 0;
		double numInt = 0*1.0;
		
		while (data != senti) {
			if (data > 0) {
				sumPos += 1;
			} else if (data < 0) {
				sumNeg += 1;
			}
			sum += data;
			numInt += 1;
			aver = sum/numInt;
			System.out.print("Enter an integer (the input ends if it is 0):");
			data = input.nextInt();
		}

		if ((data == 0) && (numInt == 0)) {
			System.out.print("No numbers are entered except 0");
		}
		
		if ((data == 0) && (numInt != 0)) {
			System.out.println("The number of positive integers is " + sumPos);
			System.out.println("The number of negative integers is " + sumNeg);
			System.out.println("The total is " + sum);
			System.out.print("The average is " + aver);
		}
	}

}
