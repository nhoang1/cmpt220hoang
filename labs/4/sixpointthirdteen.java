//package Lab4;

public class sixpointthirdteen {

	public static void main(String[] args) {
		System.out.printf("%-10s %-10s", "i", "m(i)");
		System.out.println();
		for (int k = 0; k<17; k++) {
			System.out.print("-");
		}
		System.out.println();
		
		double i = 1;
		for (int j = 0; j<20; j++) {
			System.out.printf("%-10.0f %-10.4f", i, compute(i));
			System.out.println();
			i += 1;
		}
	}

	private static double compute (double a) {
		double m = 0;
		for (double i = 1; i <= a; i++ ) {
			m = m + i/(i+1);
		}
		return m;
	}
}
