
public class sixpointone {

	
	public static void main(String[] args) {	
		int n = 1;
		for (int i = 0; i < 10; i++) {
			for (int a = 0; a < 10; a++) {
				System.out.printf ("%-7d", getPentagonalNumber (n));
				n += 1;
			} 	
			System.out.println();
		}
	}
	
	public static int getPentagonalNumber (int n) {
		int penNum = (n*(3*n-1))/2;
		return penNum;
	}

}
