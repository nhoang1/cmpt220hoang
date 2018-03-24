package Lab7;
import java.util.Stack;
import java.util.Scanner;

public class tenpointfive {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		int a;
		int factor = 2;
		
		System.out.print("Enter a positive integer: ");
		a = input.nextInt();
		
		while (factor <= a) {
			if (a%factor == 0) { 
				stack1.push(factor);
				
				a = a/factor;
			} else {
				factor++;
			}		
		}

		System.out.println("The prime factors are: ");
		while (!stack1.isEmpty()) {
			int b = stack1.pop();
			System.out.print((b) + " ");
			stack2.push(b);					//what pops out of stack1 go into stack2
		}
		
		System.out.println();
		System.out.println("And in reverse: ");
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop() + " ");
		}
		
	}

}
