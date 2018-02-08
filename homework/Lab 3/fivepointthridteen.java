public class fivepointthridteen {

	public static void main(String[] args) {
		int n = 0;
		
		while (n < 1000 ) {
			int n3rd = n*n*n; 
			if (n3rd >= 12000) {
				n -= 1;
				break;
			} else {
				n += 1;
			}
		}

		System.out.print(n);
	}

}
