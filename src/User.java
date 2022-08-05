//the import statements
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
	
	//fields
	public String username;
	
	//static methods
	public static List<String> storeUsernames(List<User> users)
	{
		List<String> holder = new ArrayList<String>();
		
		for(User user : users) {
			holder.add(user.username);
		}
		
		return holder;
	}
	
	public static Boolean findUser(List<User> users, String searchedUsername)
	{
		for(User user : users) {
			if(user.username.equals(searchedUsername)) 
			{
				return true;
			}
			
		}
		
		return false;
	}
	
	public static int findUserIndex(List<User> users, String searchedUsername) 
	{
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).username.equals(searchedUsername)) 
			{
				return i;
			}
			
		}
		
		return -1;
	}
	
	//instance methods
	public void meow()
	{
		System.out.println("meow");
	}
	public void meow(String string)
	{
		System.out.println("meow, " + string);
	}
	
	@Override
	public String toString() 
	{
		return username;
	}
	
}
