import java.util.ArrayList;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.io.File;
import java.io.PrintWriter;
import java.net.URL;


public class Inventory{
	private static ArrayList<Item> inventory = new ArrayList<>();
	public static boolean running = true;
	
	public static void main(String[] args) throws Exception {		
		programStart(inventory);
		while (running) {							
			System.out.println();
			Scanner input = new Scanner(System.in);
			printInvent(); 						 
			
			System.out.println();
			System.out.println("Enter the number based on the action you want execute:");
			System.out.println("1. Add an Item");
			System.out.println("2. Delete an Item");
			System.out.println("3. Modify an Item's Information");
			System.out.println("4. Exit the Program");
			
			try {
				
				int n = input.nextInt();
				
				switch (n) {						//Run methods based on user's input choice.
					case 1: addItem();			
							break;
					case 2: deleteItem();
							break;
					case 3: modItem();
							break;
					case 4: programExit(inventory);
							break;
					default: throw new InputMismatchException ("The input is not in the correct format. Please try again.");
				}
				
			} catch (InputMismatchException e) {				//Catch Exception
				System.out.println("The input is not in the correct format. Please try again.");
			} catch (Exception e) {
				System.out.println("The input is not in the correct format. Please try again.");
			} 
		}
	}


	private static void programStart(ArrayList<Item> inventory) {		//Method that initiate the program
		try{
			String pathToFile = new File("inventory.txt").getAbsolutePath(); //Locate the path to the data text file inventory.txt
			Scanner input = new Scanner(new File(pathToFile));

			/* Scan the data text file and use the scanned data to create an ArrayList that is a
			  replication of the inventory */
			int index = 0;
			while (input.hasNextLine()){
				
				// Scan the text data and create items in the ArrayList based on the item type and information
				String currentLine = input.nextLine();						
				Scanner read = new Scanner(currentLine).useDelimiter("!");
				String type = read.next();
				if ("T".equals(type)) {
					String brand = read.next();
					String name = read.next();
					String size = read.next();
					int id = read.nextInt();
					inventory.add(new Top(brand, name, size));
					inventory.get(index).setItemId(id);
					index++;
				} else if ("B".equals(type)) {
					String brand = read.next();
					String name = read.next();
					int waist = read.nextInt();
					int inseam = read.nextInt();
					int id = read.nextInt();
					inventory.add(new Bottom(brand, name, waist, inseam));
					inventory.get(index).setItemId(id);
					index++;;
				} else if ("S".equals(type)) {
					String brand = read.next();
					String name = read.next();
					double size = read.nextDouble();
					int id = read.nextInt();
					inventory.add(new Shoes(brand, name, size));
					inventory.get(index).setItemId(id);
					index++;
				}
			}
		} catch (Exception e) {
			System.out.print (e.getMessage());
		}
	}


	public static void programExit(ArrayList<Item> inventory) { //Method to exit the program
		running = false;
		insertionSort(inventory); 	//Sort the inventory 
		
		//Print the inventory back into inventory.txt
		try {
			File newInventory = new File("inventory.txt");
			PrintWriter output = new PrintWriter(newInventory);
			
			for (int i = 0; i < inventory.size(); i++) {
				if (inventory.get(i) instanceof Top) {
					output.println(((Top) inventory.get(i)).toInvent());
				} else if (inventory.get(i) instanceof Bottom) {
					output.println(((Bottom) inventory.get(i)).toInvent());
				} else if (inventory.get(i) instanceof Shoes) {
					output.println(((Shoes) inventory.get(i)).toInvent());
				}
			}
			output.close();
			System.out.print("The inventory has been updated. Goodbye.");
		} catch (Exception e) {
			System.out.print("Error writing file. ");
		}
		
		
		
	}


	public static void modItem() throws Exception {			//Method to modify items in the inventory
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the item's ID number: ");		//Prompt user to enter ID number.
		
		try {
			int idNumber = input.nextInt(); 
			
			for (int i = 0; i < inventory.size(); i++) {		//Iterate arrayList to search for item with ID number. 
				if (inventory.get(i).isId(idNumber)) {		//If found, prompt user to select the attribute to be modified.
					System.out.println("Enter the number corresponding to the attribute to be modified: ");
					System.out.println("1. Brand");
					System.out.println("2. Name");
					System.out.println("3. Size");
						
					int n = input.nextInt(); 
					input.nextLine();
					
					//Let user enter the new value of the attribute that they selected.	
					if (n == 1) {			
						System.out.print("Enter the new brand name: ");
						inventory.get(i).setBrand(input.nextLine());
					} else if (n == 2) {
						System.out.print("Enter the new item name: ");
						inventory.get(i).setItemName(input.nextLine());
					} else if (n == 3) {							//For the size attribute, the input varies based on item type.
						if (inventory.get(i) instanceof Top) {	
							System.out.print("Enter the new top size: ");
							((Top) inventory.get(i)).setSize(input.next());			//Check for item type with instanceof
						} else if (inventory.get(i) instanceof Bottom) {				//Then cast the item to that type
							System.out.print("Enter the new waist size: ");			//Then use the type-specific setSize method
							((Bottom) inventory.get(i)).setWaist(input.nextInt());
							System.out.print("Enter the new inseam size: ");
							((Bottom) inventory.get(i)).setInseam(input.nextInt());
						} else if (inventory.get(i) instanceof Shoes) {
							System.out.print("Enter the new shoes size: ");
							((Shoes) inventory.get(i)).setSize(input.nextDouble());
						}
					}
					
					
				} else {
					System.out.println("The item could not be found in the inventory."); //If not found, print.
				}
			}
			
		} catch (InputMismatchException e) {
			System.out.println("The input is not in the correct format. aaaa");
			System.out.println();
			modItem();
		}
		
	}
		

	public static void deleteItem() throws Exception {		//Method to delete an item from inventory
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the item's ID number: ");		//Prompt user to enter ID number.
		
		try {
			int idNumber = input.nextInt(); 
			
			for (int i = 0; i < inventory.size(); i++) {		//Iterate arrayList to search for item with ID number. 
				if (inventory.get(i).isId(idNumber)) {
					inventory.remove(i);						//If found, remove item.
				} else if (i == inventory.size() - 1) {
					System.out.println("The item could not be found in the inventory."); //If not found, print.
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("The input is not in the correct format. Please try again.");
			System.out.println();
			deleteItem();
		}	
			
	}

	public static void addItem() throws Exception {		//Method to add items
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item type:");
		System.out.println("1. Top");
		System.out.println("2. Bottom");
		System.out.println("3. Shoes");
		
		//Get the item information from the user, construct the item, and add it to the ArrayList
		try {
			int n = input.nextInt(); 
			input.nextLine();
			
			System.out.print("Enter the brand name: ");		
			String brand = input.nextLine(); 
			System.out.print("Enter the item name: ");
			String name = input.nextLine();
			
			if (n == 1) {
				System.out.print("Enter the item size: ");
				String size = input.next();
				if (isNumeric(size)) {
					throw new InputMismatchException ("The input is not in the correct format. Please try again.");
				}
			
				inventory.add(new Top(brand, name, size));
				inventory.trimToSize();
			
			} else if (n == 2) {
				System.out.print("Enter the waist: ");
				int waist = input.nextInt();
				System.out.print("Enter the inseam: ");
				int inseam = input.nextInt();
			
				inventory.add(new Bottom(brand, name, waist, inseam));
				inventory.trimToSize();
			
			} else if (n == 3) {
				System.out.print("Enter the item size: ");
				double size = input.nextDouble();
			
				inventory.add(new Shoes(brand, name, size));
				inventory.trimToSize();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("The input is not in the correct format. Please try again.");
			System.out.println();
			addItem();
		}
		
	}
	
	public static void printInvent() {
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i).toString());
		}
	}
	
	/*This method is used to check the input value of the size attribute of the 
	 *class Top when adding a new item. If the size input is a numeric value then
	 *an exception will be thrown.
	 */
	public static boolean isNumeric(String str) {  	
	  try  {  										
	    double d = Double.parseDouble(str);  
	  } catch(NumberFormatException nfe) {  
	    return false;  
	  }  
	  return true;  
	}
	
	
	// Insertion sort method to sort the items in the array based on their Id numbers
	
	public static void insertionSort(ArrayList<Item> inventory) {
		 int i, j;
		    for (i = 1; i < inventory.size(); i++) {
		        Item tmp = inventory.get(i);
		        j = i;
		        while ((j > 0) && (inventory.get(j - 1).getItemId() > tmp.getItemId())) {
		            inventory.set(j, inventory.get(j - 1));
		            j--;
		        }
		        inventory.set(j, tmp);
		    }
	}
}
