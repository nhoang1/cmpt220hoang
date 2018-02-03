import java.util.Scanner;

public class threepointseventeen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 (Paper), 2 (Scissor), or 3 (Rock)");
		int player = input.nextInt();
		int max = 3; 
		int min = 1;
		int range = max - min + 1;
		int comp = (int)(Math.floor(Math.random() * ((3-1)+1) + 1));
		String compName = "none";
		String playerName = "none1";
		String result = "none2";
		

		if (comp == 1) {
			compName = "Paper";
		} else if (comp == 2) {
			compName = "Scissor";	
		} else if (comp == 3) {
			compName = "Rock";
		}
		
		if (player == 1) {
			playerName = "Paper";
		} else if (player == 2) {
			playerName = "Scissor";	
		} else if (player == 3) {
			playerName = "Rock";
		}
		
		if ((player == 1)&&((comp == 2)||(comp == 3))) {
			result = "computer wins";
		} else if ((comp == 1)&&((player == 2)||(player == 3))) {
			result = "you win";
		} else if ((comp == 2)&&(player == 3)) {
			result = "you win";
		} else if ((comp == 3)&&(player == 2)) {
			result = "computer wins";
		}
		
		System.out.print("You are " + playerName + " and the computer is " + compName + ", " + result);
		
	}

}
