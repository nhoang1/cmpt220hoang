//package Lab5;

public class eightpointten {

	public static void main(String[] args) {
		double[][] matrix = new double [4][4];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = Math.round(Math.random()*1);
				System.out.printf("%-2.0f", matrix[i][j]);
			}
			System.out.println();
		}
		
		int columnIndex = getColumn (sumColumn(matrix, 0),sumColumn(matrix, 1), sumColumn(matrix, 2), sumColumn(matrix, 3));
		int rowIndex = getRow(sumRow(matrix, 0), sumRow(matrix, 1), sumRow(matrix, 2), sumRow(matrix, 3)); 
		
		System.out.println("The largest row index: " + rowIndex);
		System.out.println("The largest column index: " + columnIndex);
		System.out.println();
		System.out.print("I did this problem by mistake haha");
	}
	
	
	public static double sumColumn (double[][] z, int column) {
		double sumc = 0;
		for (int m = 0; m < z.length; m++) {
			sumc += z[m][column];
		}
		return sumc;
	}
	
	public static double sumRow (double[][] z, int row) {
		double sumr = 0;
		for (int n = 0; n < z[0].length; n++) {
			sumr += z[row][n];
		}
		return sumr;
	}
	
	
	public static double max (double a, double b, double c, double d) {
		double max = Math.max(a, Math.max(b, Math.max(c, d)));
		return max;
	}
	
	public static int getColumn (double sumc0, double sumc1, double sumc2, double sumc3) {
		int columnNo = 0;
		double maxc = max (sumc0, sumc1, sumc2, sumc3);
		if (maxc == sumc0) {
			columnNo = 0;
			sumc1 = 0; 				//setting the other sums to 0 is so the u
			sumc2 = 0;
			sumc3 = 0;
		} else if (maxc == sumc1) {
			columnNo = 1;
			sumc0 = 0; 
			sumc2 = 0;
			sumc3 = 0;
		} else if (maxc == sumc2) {
			columnNo = 2;
			sumc1 = 0; 
			sumc0 = 0;
			sumc3 = 0;
		} else if (maxc == sumc3) {
			columnNo = 3;
			sumc1 = 0; 
			sumc2 = 0;
			sumc0 = 0;
		}
		return columnNo;
	}
	
	public static int getRow (double sumr0, double sumr1, double sumr2, double sumr3) {
		int rowNo = 0;
		double maxr = max (sumr0, sumr1, sumr2, sumr3);
		if (maxr == sumr0) {
			rowNo = 0;
			sumr1 = 0; 
			sumr2 = 0;
			sumr3 = 0;
		} else if (maxr == sumr1) {
			rowNo = 1;
			sumr0 = 0; 
			sumr2 = 0;
			sumr3 = 0;
		} else if (maxr == sumr2) {
			rowNo = 2;
			sumr1 = 0; 
			sumr0 = 0;
			sumr3 = 0;
		} else if (maxr == sumr3) {
			rowNo = 3;
			sumr1 = 0; 
			sumr2 = 0;
			sumr0 = 0;
		}
		return rowNo;
	}
}

