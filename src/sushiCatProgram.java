//import statements are here
import java.util.Arrays;
import java.util.Scanner;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		//this is an instance of cats
		Cats cat = new Cats();
		
		//this creates a scanner
		Scanner scanner = new Scanner(System.in);
		
		//this asks the user whether to turn on additional cats or not
		String additionalCatsInput;
		boolean additionalCats;
		
		while (true) {
			System.out.println("Allow addtional cats?");
			additionalCatsInput = scanner.nextLine();
			
			if (additionalCatsInput.toLowerCase().equals("yes")) {
				System.out.println("Additional cats mode is ON.");
				additionalCats = true;
				break;
			}
			else if (additionalCatsInput.toLowerCase().equals("no"))
			{
				System.out.println("Additional cats mode is OFF.");
				additionalCats = false;
				break;
			}
			System.out.println("What???");
		};
		
		//this makes a strange pyramid
		for(int i = 0; i < 143; i++) {
			for(int k = 0; k < i; k++) {
				char charOfText = "You are sus. ".charAt(k % 13);
				
				if(charOfText == 's') {continue;}
				
				System.out.print(charOfText);
			}
			
			System.out.println();
		}
		
		//this checks the cat population
		System.out.println("\nCat population notification:");
		if (cat.numberOfCats > 100_000_000F && cat.numberOfCats < 100_000_000_000_000F) {
			System.out.println("The cat population is healthy.");
		}
		else if (cat.numberOfCats < 100_000_000F) 
		{
			System.out.println("ALERT! ALERT! The cat population is TOO SMALL!");
		}
		else 
		{
			System.out.println("ALERT! ALERT! The cat population is TOO LARGE!");
		}
		
		//this repeats a purr 40 times
		for (int i = 0; i < 40; i++) {
			System.out.println("\nmeoww " + (i + 1) + "!");
		}
		
		//this gives the fifth cat score
		System.out.println("\nFifth cat score: " + cat.catScores[4]);
		
		//this outputs all the names of the cat sushies
		System.out.println("\nCat Sushies: " + Arrays.toString(cat.sushiCatNames));
		
		//this asks the user whether they like cats or dogs		
		String preferredAnimal = "";
		
		//this lists several fish names
		System.out.println("\nHere are some fish names:");
		
		String[] fishNames = {"Fishfish", "Arbogfish", "Reptillian Oufyfish", "Attacking Sguhofish"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println("\n" + fishNames[i]);
		}
		
		//this searches for a new user in the list newUsers
		for(int i = 0; i < cat.newUsers.length; i++) {
			if (cat.newUsers[i].equals("Assault_Meow")) {
				System.out.println("\n" + cat.newUsers[i] + " is a new user with index " + i);
			}
		}
		
		//this prints the cat rifles
		String[] catRifles = {"catK-47", "MeowG-4", "Boomboom big cat rifle 456", "AssaultWifle-1101110MEOW10110101", "MotorMeow General Rifle 11049"};
		System.out.println("\nHere are the unsorted cat rifles: " + Arrays.toString(catRifles));
		
		Arrays.sort(catRifles);
		System.out.println("Here are the cat rifles sorted: " + Arrays.toString(catRifles));
		
		//this asks the user about cats and dogs
		while (true) {
			System.out.println("\nCats or dogs?");
			preferredAnimal = scanner.nextLine();
			
			if (preferredAnimal.toLowerCase().equals("dogs")) {
				System.out.println("you like dogs.");
				break;
			}
			else if (preferredAnimal.toLowerCase().equals("cats"))
			{
				System.out.println("I like cats also!");
				
				if(additionalCats) {
					System.out.println("Here are more cats.");
				}
				
				break;
			}
			System.out.println("What???");
		};
		
		//this asks the name of the user
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
		
		//this asks the user to say something random
		System.out.println("\nSay something random: ");
		String randomText = scanner.nextLine();
		
		String reaction = randomText.contains("chip kingdom") ? "NO CHIPS!!!":"Thanks for the random text!!!";
		System.out.println(reaction);
		
		//this asks the user whether they know the password		
		String guess = "";
		System.out.println("\nEnter the password: ");
		
		
		while (true) {
			guess = scanner.nextLine();
			
			if (guess.equals("This is a VERY long password (which is obvious), and the passnumber is missing in it.")) {
				System.out.println("Correct!");
				
				if(additionalCats) {
					System.out.println("MEOW!!!");
				}
				
				break;
			}
			System.out.println("WRONG PASSWORD. TRY AGAIN: ");
		};
		
		//this asks the user to guess the budget of catty_impostor
		String inputBudget;
		String actualBudget = "$140,502,413,940";
		int loopcount = 0;
		do 
		{
			if (loopcount > 0) {System.out.println("That's not it.");}
			
			System.out.println("\nGuess the budget of catty_impostor:");
			inputBudget = scanner.nextLine();
			loopcount++;
		}while(!inputBudget.equals(actualBudget));
		
		System.out.println("Yup! you guessed it!");
		
		//this closes the scanner at the end
		scanner.close();
	}
}
