//import statements are here
import java.util.Scanner;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		//this is an instance of Cats
		Cats data = new Cats();
		
		//this is the "console started" message
		System.out.println("Welcome to the Cat Console. Type \"help\" for a list of commands.");
		
		//this is the main scanner
		Scanner scanner = new Scanner(System.in);
		
		//this is the loop count
		long loopcount = 1L;
		
		//this is the main game loop
		while (true) {
			//this creates an input
			String input = scanner.nextLine();	
			
			//this is all the command checks
			if (input.toLowerCase().equals("help")) { 
				
				System.out.println("Here is a list of commands: \nExit- Terminates the program. \nCats Add- Adds a stirng to the Cats list. " + 
				"\nCats Print- Prints the Cats list. \nCats Contains- Checks if the Cats list contains a certain value." + 
				"\nIs Cats Empty- Checks if the Cats List is empty. \nCats Remove- Removes the element at the specified index." +
				"\nCats Clear- clears the Cats list.");
			}
			
			else if (input.toLowerCase().equals("exit")) { 
			
				break;
			}
			
			else if (input.toLowerCase().equals("cats add")) { 
				
				String catsAddInput = scanner.nextLine();
				data.cats.add(catsAddInput);
				System.out.println("Successfully added an item to Cats.");
			}
			
			else if (input.toLowerCase().equals("cats print")) { 
				
				System.out.println(data.cats);
			}
			
			else if (input.toLowerCase().equals("cats contains")) { 
				
				String catsContainsInput = scanner.nextLine();
				System.out.println(data.cats.contains(catsContainsInput)); 
			}
			
			else if (input.toLowerCase().equals("is cats empty")) { 
				
				System.out.println(data.cats.isEmpty());
			}
			
			else if (input.toLowerCase().equals("cats remove")) { 
				
				if (!data.cats.isEmpty()) {
					String catsRemoveInput = scanner.nextLine();
					int catsRemoveIndex =  Integer.parseInt(catsRemoveInput);
					
					if (catsRemoveIndex > data.cats.size()) {
						System.out.println("That index is out of range!");
					}
					else {
						data.cats.remove(catsRemoveIndex);
						System.out.println("Successfully removed item at index " + catsRemoveIndex + " of Cats.");
					}
				}
				else { System.out.println("There's nothing to remove!"); }
			}
			
			else if (input.toLowerCase().equals("cats clear")) { 
				
				if (!data.cats.isEmpty()) {
					data.cats.clear();
					System.out.println("Successfully cleared the Cats list.");
				}
				else {System.out.println("There's nothing to clear!");}
			}
			
			//this increases the loop count
			loopcount++;
			}
		//this closes the scanner
		scanner.close();
		System.out.println("Program ended at line " + loopcount);
		}	
	}

