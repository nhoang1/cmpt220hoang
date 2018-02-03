import java.util.Scanner;

public class twopointseven {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter the number of minutes:");
		    int minutes = input.nextInt();

		   
		    int year = minutes / 525600;
		    int remMinutes = minutes % 525600;
		    int day = remMinutes / 1440;


		    System.out.println(minutes + " amounts to " + year + " years and "  +  remMinutes + " day ");
	 }
}