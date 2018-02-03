import java.util.Scanner;

public class fourpointtwentythree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name");
		String name = input.nextLine();
		System.out.println("Enter hours worked (eg. 10)");
		int hours = input.nextInt();
		System.out.println("Enter hourly payrate (eg. 9.25)");
		double payRate = input.nextDouble();
		System.out.println("Enter Federal tax rate (eg. 0.20)");
		double fedTaxRate = input.nextDouble();
		System.out.println("Enter State tax rate (eg. 0.40)");
		double stateTaxRate = input.nextDouble();
		
		double pay = payRate * hours;
		double fedTax = pay * fedTaxRate;
		double stateTax = pay * stateTaxRate;
		double totalTax = fedTax + stateTax;
		double netPay = pay - totalTax;
		
		System.out.println ("Employee Name: " + name);
		System.out.println ("Hours Worked: "+ hours);
		System.out.println ("Pay Rate: $" + payRate);
		System.out.println ("Gross Pay: $" + pay);
		System.out.println ("Deductions:");
		System.out.println ("   Federal Witholding: $" + fedTax);
		System.out.println ("   State Witholding: $" + stateTax);
		System.out.println ("   Total Deduction: $" + totalTax);
		System.out.println ("Net Pay: $" + netPay);
	}

}
