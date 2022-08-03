//the import statements
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
	
	//fields
	public String username;
	public List<String> cats = new ArrayList<String>();
	
	//static methods
	public static String meow(User u)
	{
		return "Meow I'm " + u.username;
		
	}
	
	//instance methods
}
