// import statements are here
import java.util.Scanner;

// this is the sushiCatProgram class
public class sushiCatProgram {
	
	// this is the main method
	public static void main(String[] args) {
		String password = "thing.DONTGUESS(LET. ME! INNN!) correct.";
		
		System.out.println("Guess the password:");
		
		Scanner scanner = new Scanner(System.in);
		String Guess  = scanner.nextLine();
		
		System.out.println(Guess.equals(password));
		
	}
}
