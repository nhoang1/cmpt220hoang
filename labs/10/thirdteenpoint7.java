package Lab10;

public class thirdteenpoint7 {

	public static void main(String[] args) {
		GeometricObject[] objectList = {new Square(5), new Square(4.5), new Square(6), new Square(8.5), new Square(2)};
		
		for (int i = 0; i < objectList.length; i++) {
			System.out.println("Square " + i + ":");
			System.out.println("Area: " + objectList[i].getArea());
			System.out.println("How to color: " + ((Square)objectList[i]).howToColor());
		}
		
		
	}

}
