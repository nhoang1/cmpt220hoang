//package Lab7;

public class myInteger {
	private int value;
	myInteger(){};
	myInteger(int a) {
		this.value = a;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return (this.value%2 == 0);
	}
	
	public boolean isOdd() {
		return (this.value%2 != 0);
	}
	
	public boolean isPrime() {
		if (this.value <= 1) 
			return false;
		else if (this.value <= 3)
			return true;
		else if ((this.value%2 == 0) || (this.value%3 == 0))
			return false;
		for (int i = 5; i*i < this.value; i = i + 6) {
			if (this.value % i == 0 || this.value % (i + 2) == 0)
	            return false;
		}
		return true;
	}
	
	public static boolean isEven(int a) {
		return (a%2 == 0);
	}
	
	public static boolean isOdd(int a) {
		return (a%2 != 0);
	}
	
	public static boolean isPrime(int a) {
		if (a <= 1) 
			return false;
		else if (a <= 3)
			return true;
		else if ((a%2 == 0) || (a%3 == 0))
			return false;
		for (int i = 5; i*i < a; i = i + 6) {
			if (a % i == 0 || a % (i + 2) == 0)
	            return false;
		}
		return true;
	}
	
	public static boolean isEven(myInteger a) {
		return (a.value%2 == 0);
	}
	
	public static boolean isOdd(myInteger a) {
		return (a.value%2 != 0);
	}
	
	public static boolean isPrime(myInteger a) {
		if (a.value <= 1) 
			return false;
		else if (a.value <= 3)
			return true;
		else if ((a.value%2 == 0) || (a.value%3 == 0))
			return false;
		for (int i = 5; i*i < a.value; i = i + 6) {
			if (a.value % i == 0 || a.value % (i + 2) == 0)
	            return false;
		}
		return true;
	}
	
	public boolean equals(int a)
	{
		return(this.value==a);
	}
	
	
	public boolean equals(myInteger a)
	{
		return(this.value==a.value);
	}
	
	public static int parseInt (char[] charArray) {
		String s = "";
		for(int i=0; i<charArray.length; i++)
			s += charArray[i];
		return(Integer.valueOf(s));
	}
	
	public static int parseInt(String s)
	{
		return(Integer.parseInt(s));
	}
	
	public static void main(String[] args)
	{
		myInteger n = new myInteger(24);
		char[] chars = {'1', '2', '3', '4', '5', '6','7'};
		System.out.println("Get Value Test: "+n.getValue());
		

		System.out.println("Is Even Test: "+n.isEven());
		System.out.println("Is Odd Test: "+n.isOdd());
		System.out.println("Is Prime Test: "+n.isPrime());
		
		
		System.out.println("23 isEven(int): "+myInteger.isEven(23));
		System.out.println("23 isOdd(int): "+myInteger.isOdd(23));
		System.out.println("23 isPrime(int): "+myInteger.isPrime(23));
		
		
		System.out.println("2 isEven(myInteger): "+myInteger.isEven(new myInteger(2)));
		System.out.println("2 isOdd(myInteger): "+myInteger.isOdd(new myInteger(2)));
		System.out.println("2 isPrime(myInteger): "+myInteger.isPrime(new myInteger(2)));
		
		
		n = new myInteger(453);
		System.out.println("Equals(int) Test 235 & 235: "+n.equals(453));
		System.out.println("Equals(int) Test 23 & 5: "+n.equals(17));
		
		
		System.out.println("Equals(myInteger) Test 235 & 235: "+n.equals(new myInteger(453)));
		System.out.println("Equals(myInteger) Test 23 & 5: "+n.equals(new myInteger(12)));
		
		
		System.out.print("ParseInt(chars[]) Test: [1, 2, 3, 4, 5, 6, 7]: ");
		System.out.println(myInteger.parseInt(chars));
		
		
		System.out.print("ParseInt(String) Test: \"1234567\": ");
		System.out.println(myInteger.parseInt("1234567"));
	}
}
