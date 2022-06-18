//import statements are here
import java.util.Scanner;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		//this is an instance of cats
		Cats cat = new Cats();
		
		//this checks the cat population
		System.out.println("cat population notification:");
		if (cat.numberOfCats > 100_000_000F && cat.numberOfCats < 100_000_000_000_000F) {
			System.out.println("The cat population is healthy. \n");
		}
		else if (cat.numberOfCats < 100_000_000F) 
		{
			System.out.println("ALERT! ALERT! The cat population is TOO SMALL!");
		}
		else 
		{
			System.out.println("ALERT! ALERT! The cat population is TOO LARGE!");
		}
		
		//asks the user whether they like cats or dogs		
		Scanner scanner = new Scanner(System.in);
		String preferredAnimal = "";
		
		
		while (true) {
			System.out.println("Cats or dogs?");
			preferredAnimal = scanner.nextLine();
			
			if (preferredAnimal.toLowerCase().equals("dogs")) {
				System.out.println("you like dogs.");
				break;
			}
			else if (preferredAnimal.toLowerCase().equals("cats"))
			{
				System.out.println("I like cats also!");
				break;
			}
			else {System.out.println("What???");}
		};
		
		
	}
}
