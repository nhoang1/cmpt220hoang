//package Lab8;
import java.util.Scanner; 

public class elevenpointone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the sides of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();
		
		System.out.print("Is the triangle filled (True/False)? ");
		boolean filled = input.nextBoolean();
		
		System.out.print("Enter the color of the triangle: ");
		String color = input.next();

		Triangle triangle = new Triangle (side1, side2, side3);
		triangle.setFilled(filled);
		triangle.setColor(color);
		
 
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not") + " filled");
	}


}

