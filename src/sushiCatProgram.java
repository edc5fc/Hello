//import statements are here
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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
				
				System.out.println("Here is a list of commands: \nExit- Terminates the program.");
			}
			
			else if (input.toLowerCase().equals("exit")) { 
			
				break;
			}
			
			//this increases the loop count
			loopcount++;
			}
		//this closes the scanner
		scanner.close();
		System.out.println("Program ended at line " + loopcount);
		}	
	}

