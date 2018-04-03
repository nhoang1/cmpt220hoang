package Project1;
import java.util.Scanner;

public class Paper {
	    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    // Read input
	    int n = sc.nextInt();
	    int[] nSheets = new int[n]; // 0th index = A1
	    for (int i = 1; i < n; i++) {
	    		nSheets[i] = sc.nextInt();
	    }

	    // Pre-compute tape required
	    double[] tape = new double[n]; // 0th index = A1
	    for (int i = 1; i < n; i++) { // There's no need to tape two A1's together
	    		tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);
	    }

	    // Pick biggest pages first (since that saves tape)
	    double tapeUsed = 0;
	    int nNextPageSizeNeeded = 1;
	    for (int i = 0; i < n; i++) {
	    		tapeUsed += tape[i] * ((double)(nNextPageSizeNeeded / 2));

	    		if (nSheets[i] >= nNextPageSizeNeeded) { // Enough pages
	    			nNextPageSizeNeeded = 0;
	    			break;
	        } else {   // Not enough pages yet
	    			nNextPageSizeNeeded = (nNextPageSizeNeeded - nSheets[i]) * 2;
	        }

	    		if (nNextPageSizeNeeded > 0) {  // Print answer
	    			System.out.println("impossible");
	    		} else {
	    			System.out.println(tapeUsed);
	    		}
	    }
	}
}
