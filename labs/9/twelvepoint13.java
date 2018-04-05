// package Lab9;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class twelvepoint13 {
	
	private static String line;

	
	public static void main(String[] args) throws FileNotFoundException {
		// Check command line parameter usage
		if (args.length != 1) {
			System.out.println("Usage: java filename");
			System.exit(1);
		}	

		// Check if file exists
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}

		int numChar = 0;
		int numWord = 0;			
		int numLine = 0;			

		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			String s1 = input.nextLine(); 
			numLine++;
			numChar += s1.length();
			String[] words = s1.split(" ");
			numWord += words.length;
		}
		
		
		System.out.println("The .txt file has: ");
		System.out.println(numLine + " lines");
		System.out.println(numWord + " words");
		System.out.println(numChar + " characters");
	}
}