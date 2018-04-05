//package Lab9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
	public static void main(String[] args) throws Exception {
		if (args.length != 4) {
			System.out.print ("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.print("Source file " + args[0] + " does not exist");
			System.exit(2);
		}
		
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.print("Target file " + args[1] + " already exist");
			System.exit(3);
		}
		
		try (
			Scanner input = new Scanner(sourceFile); 
			PrintWriter output = new PrintWriter(targetFile);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.print(s2);
			}
		}

	}
}
