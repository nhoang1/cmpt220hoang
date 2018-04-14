//package Lab9;

public class IllegalTriangleException extends Exception {
	private double side1;

	IllegalTriangleException(){};

	IllegalTriangleException(double side1) { 
		super (side1 + " is larger than the sum of the other two sides");
	}	
}
