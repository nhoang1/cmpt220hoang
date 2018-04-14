//package Lab9;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	Triangle(){};

	Triangle(double side1, double side2, double side3) throws IllegalTriangleException  { 
		if (side1 + side2 <= side3) {
			throw new IllegalTriangleException(side3);
		} else if (side2 + side3 <= side1) {
			throw new IllegalTriangleException(side1);
		} else if (side1 + side3 <= side2) {
			throw new IllegalTriangleException(side2);
		} else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	}

	public double getSide1() {
		return side1;
	}


	public double getSide2() {
		return side2;
	}


	public double getSide3() {
		return side3;
	}


	public double getArea() {
		double a = (side1 + side2 + side3) / 2;
		return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
	}

	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return ("Triangle: side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3);
	}
	
}