//import statements are here
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		String[] usernames = {"CCat", "LafiamoCat", "AnitoorCat", "GordonCat", "SdghiCat", "SgiakfdghioewaddjfgCat", "Bldy5ikCat", "VfdlsCat"};
		List<User> users = new ArrayList<User>();
		User me = new User();
		me.username = "Robocat";
		
		for(int i = 0; i < usernames.length; i++) {
			User loopUser = new User();
			loopUser.username = usernames[i];
			users.add(loopUser);
			
		}
		
		for(User loopUser : users) {
			System.out.println(loopUser.username);
		}
		
		System.out.println( "\n" + User.storeUsernames(users));
		
		System.out.println();
		me.meow();
		me.meow("you are a cute pusheen UWU");
		
		System.out.println();
		System.out.println(User.findUser(users, "CCatty"));
		System.out.println(User.findUserIndex(users, "SdghiCat"));
		
		System.out.println();
		System.out.println(me);
	}	
}

