//package Lab9;
import java.io.*;
import java.util.*;
public class twelvepoint11 {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 2) {
			System.out.print ("Usage: java DeleteText String sourceFile targetFile ");
			System.exit(1);
		}

		File sourceFile = new File(args[1]);
		if (!sourceFile.exists()) {
			System.out.print("Source file " + args[1] + " does not exist");
			System.exit(2);
		}
		
		ArrayList<String> text = new ArrayList<>(); 
		try (
			Scanner input = new Scanner(sourceFile); 
		) {
			while (input.hasNext()) {
			String s1 = input.nextLine();
			text.add(s1.replaceAll(" " + args[0] + " ", " "));
			}
		}
		
		try (
			PrintWriter output = new PrintWriter(sourceFile);
		) {
			for (int i = 0; i < text.size(); i++) {
				output.println(text.get(i));
			}
		}
	}
}
