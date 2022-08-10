//import statements are here
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		Bacteriophages bacteriophage = new Bacteriophages();
		bacteriophage.infect("Streptococcus");
		
		System.out.println(bacteriophage.host + "es infected:" + bacteriophage.infections);
	}
}

