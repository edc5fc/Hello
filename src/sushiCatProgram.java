//import statements are here
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
			
			List<String> t = Arrays.asList("ue", "fi", "dfgjk", "gjk,,", "dfglk", "ksdhucdkjshdcshkj");
			Collections.reverse(t);
			System.out.println(Arrays.toString(t.toArray()));
		}	
}

