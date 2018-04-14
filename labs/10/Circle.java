package Lab10;

public class Circle extends GeometricObject implements Comparable<Circle>{
	private double radius;

	public Circle() {};

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public void setFilled(boolean filled) {}

	public void setColor(String color) {}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}


	public double getDiameter() {
		return 2 * radius;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}


	public boolean equals (Object thatCircle) {
		return this.compare((Circle) thatCircle) ;
	}


	public boolean compare(Circle o) {
		if (this.radius > o.radius)
			return false;
		else if (this.radius < o.radius)
			return false;
		else
			return true;
	}

	public String toString() {
		return super.toString() + "\nDate created: " + getDateCreated() +
				"\nRadius: " + radius;
	}

	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
