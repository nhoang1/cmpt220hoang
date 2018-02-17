package Lab4;

public class sixpointnine {

	public static void main(String[] args) {
		System.out.printf( "%-10s%-10s%-5s%-10s%-10s", "Feet", "Meters", "|", "Meters", "Feet");
		System.out.println();
		
		for (int i = 0; i<(40); i++) {
			System.out.print("-");
		}
		System.out.println();
		
		double feet1 = 1.0;
		double meters1 = 20.0;
		for (int j = 0; j<10 ; j++) {
			System.out.printf( "%-9.1f %-8.3f %-6s %-8.1f %-8.3f", feet1, footToMeter (feet1), " |", meters1, meterToFoot (meters1));
			System.out.println();
			feet1 += 1.0;
			meters1 += 5.0;
		}
	}
	
	
	public static double footToMeter (double foot) {
		double meter = foot * .305;
		return meter;
	}
	
	public static double meterToFoot (double meter) {
		double foot = meter * 3.279;
		return foot;
	}
	
}
