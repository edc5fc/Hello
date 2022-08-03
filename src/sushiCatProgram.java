//import statements are here
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		String[] usernames = {"LafiamoCat", "AnitoorCat", "GordonCat", "SdghiCat", "SgiakfdghioewaddjfgCat", "Bldy5ikCat", "VfdlsCat"};
		List<User> users = new ArrayList<User>();
		
		for(int i = 0; i < usernames.length; i++) {
			User loopUser = new User();
			loopUser.username = usernames[i];
			users.add(loopUser);
			
		}
		
		for(User loopUser : users) {
			System.out.println(loopUser.username);
		}
		
		System.out.println( "\n" + User.meow(users.get(3)));
	}	
}

