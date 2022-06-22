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
		
		//asks the name of the user
		System.out.println("\nWhat's your username?");
		String name = scanner.nextLine();
		
		switch(name)
		{
		default:
			System.out.println("Hello, new user! sign in at Cats.javcom to continue. ;)");
			break;
		
		case "CCat":
			System.out.println("Hello, CCat. There is one issue for you: \nFix the caloneator.");
			break;
		
		case "catty_impostor":
			System.out.println("INTURDER ALERT!!!!! INTRUDER ALERT!!!! CATTY_IMPOSTOR IS HERE!!!");
			break;
			
		case "Enamel-kitty":
			System.out.println("Hello, Enamel-kitty. There are two issues for you: \n#1. Brush somebody's teeth. \n#2. Make catty_impostor eat junk food.");
			break;
		
		case "neotech-advocatty":
			System.out.println("Hello, neotech-advocatty! Please check everything to make sure that all the cats are good :)");
			break;
			
		case "LC00duhh":
		case "REALLY-LAZY-KITAZY":
		case "lazzyCat":
		case "lazy-cat":
			System.out.println("PLEASE be less lazy.");
			break;
			
		case "Amongus":
		case "Rickroll":
		case "Joe-mama":
		case "grillbaby":
			System.out.println("GO AWAY MEMES!!!!!!!");
			break;
		}
		
		//asks the user to say something random
		System.out.println("\nSay something random: ");
		String randomText = scanner.nextLine();
		
		String reaction = randomText.contains("chip kingdom") ? "NO CHIPS!!!":"Thanks for the random text!!!";
		System.out.println(reaction);
	}
}
