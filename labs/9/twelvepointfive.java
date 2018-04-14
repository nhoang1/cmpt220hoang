//package Lab9;

import java.util.Scanner;

public class twelvepointfive {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the sides of the Triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		Triangle triangle = new Triangle();
		
	
	    try {
	        triangle = new Triangle(side1, side2, side3);
	        	System.out.println(triangle.toString());
	    		System.out.println("Area: " + triangle.getArea());
	    		System.out.println("Perimeter: " + triangle.getPerimeter());
	        }
	        catch (IllegalTriangleException ex) {
	            System.out.println(ex.getMessage());
	        }
	}
}
