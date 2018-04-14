package Lab10;

public class thirdteenpoint9 {
	public static void main (String[] args) {
		Circle circle1 = new Circle(15, "red", false);
		Circle circle2 = new Circle(10, "green", false);
		Circle circle3 = new Circle(15, "blue", false);
	
		if (circle1.compare(circle2)) {
			System.out.println("circle 1 equals circle 2");
		} else {
			System.out.println("circle 1 is not equal to circle 2");
		}

		if (circle1.compare(circle3)) {
			System.out.println("circle 1 equals circle 3");
		} else {
			System.out.println("circle 1 is not equal to circle 3");
		}
		
		if (circle2.compare(circle3)) {
			System.out.println("circle 2 equals circle 3");
		} else {
			System.out.println("circle 2 is not equal to circle 3");
		}
	}
}
