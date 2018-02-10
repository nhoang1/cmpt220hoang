
public class fivepointfive {

	public static void main(String[] args) {
		System.out.printf("%-9s", "Kilograms");
		System.out.print("\t");
		System.out.printf("%9s", "Pounds");
		System.out.printf("  |   ");
		System.out.printf("%-9s", "Pounds");
		System.out.print("\t");
		System.out.printf("%9s", "Kilograms");
		System.out.println("");
		
		int kilo = 1;
		int lbs = 20;
		
		for (int i = 0; i < 100; i++) {
			double k2l = kilo * 2.2;
			double l2k = lbs * 0.495;
			System.out.printf("%-9s", kilo);
			System.out.print("\t");
			System.out.printf("%9.1f", k2l);
			System.out.printf("  |   ");
			System.out.printf("%-9s", lbs);
			System.out.print("\t");
			System.out.printf("%9.1f", l2k);
			System.out.println("");
			kilo += 2;
			lbs += 5;
		}
	}

}
