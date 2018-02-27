//package Lab4;
import java.util.Scanner;
public class sixpointnineteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle side: ");
		double a = input.nextDouble();
		System.out.print("Enter triangle side: ");
		double b = input.nextDouble();
		System.out.print("Enter triangle side: ");
		double c = input.nextDouble();
		
		if (sideValid (a,b,c)) {
			double area = area (a,b,c);
			System.out.print("The area of the triangle is: " + area);
		} else {
			System.out.print("The triangle is invalid");
		}
		
	}
	
	
	public static boolean sideValid (double a, double b, double c) {
		if ( (a+b)>c && (b+c)>a && (a+c)>b ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static double area (double a, double b, double c) {
		double pHalf = (a+b+c)/2;
		double area = Math.pow(   ((pHalf)*(pHalf-a)*(pHalf-b)*(pHalf-c)), (1./2) ); //Heron's formula
		return area;
	}
}
