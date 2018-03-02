package Lab6;

public class Rectangle {	
	double width = 1;
	double height = 1;
	
	Rectangle(){};
	
	Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea () {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter () {
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
	/*
	UML 
	Class: Rectangle
	
	Data Fields: 
	width: double
	height: double
	
	Methods: 
	getArea()
	getPerimeter()
	*/
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.println ("Rectangle 1 has width " + rec1.width + " and height " + rec1.height);
		System.out.println ("The area is " + rec1.getArea() + " and the perimeter is " + rec1.getPerimeter());
		
		System.out.println ("Rectangle 2 has width " + rec2.width + " and height " + rec2.height);
		System.out.println ("The area is " + rec2.getArea() + " and the perimeter is " + rec2.getPerimeter());
	}

}



