//package Lab7;

// JA: No test class?

public class Circle2D {	
	private double x;
	private double y;
	double radius;
	
	public double getX () {
		return(this.x);
	}

	public double getY() {
		return(this.y);
	}
	
	public double getRadius () {
		return(this.radius);
	}
	
	Circle2D () {
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	
	
	Circle2D (double x, double y, double rad) {
		this.x=x;
		this.y=y;
		this.radius=rad;
	}
	

	public double getArea() {
		double area = radius*radius;
		area*=Math.PI;
		return(area);
	}
	
	
	public double getPerimeter() {
		return(2*Math.PI*radius);
	}
	

	public boolean contains (double x, double y) {
		double d = x - this.x;
		double d2 = y - this.y;
		double r = this.radius*this.radius;
		d = d*d;
		d2 = d2*d2;
		d = d+d2;
		if(d<r) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean contains (Circle2D circle) {
		double d;
		double d1 =  circle.x - this.x;
		double d2 = circle.y - this.y;
		d1 = d1*d1;
		d2 = d2*d2;
		d = d1+d2;
		d = Math.sqrt(d);
		if (this.radius > (d+circle.radius)) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean overlaps (Circle2D circle) {
		double r1 = Math.abs(this.radius-circle.radius);
		double r2 = this.radius+circle.radius;
		r1 = r1*r1;
		r2 = r2*r2;
		
		double d;
		double d1 =  circle.x - this.x;
		double d2 = circle.y - this.y;
		d1 = d1*d1;
		d2 = d2*d2;
		d = d1+d2;
		if ((r1<=d) && (d<=r2)) {
			return true;
		} else {
			return false;
		}
	}
}
