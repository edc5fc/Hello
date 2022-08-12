//import statements are here
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		
		Bacteriophages bacteriophage = new Bacteriophages();
		bacteriophage.species = "Meowmitus Meowmeow";
	
		Bacteria bacteria = new Bacteria();
		bacteria.species = "Meowdomonas";
		
		List<Microbes> microbes = new ArrayList<Microbes>();
		microbes.add(bacteria);
		microbes.add(bacteriophage);
		
		for ( Microbes microbe : microbes) {
			microbe.sayHello();
		}
	}
}

