//import statements are here

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
			Mushroom m = new Mushroom();
			m.toxicity = m.toxicity.toxic;
			int foodLevel = m.eat();

			switch(m.toxicity) {
				
			case apocalypticDeath, certainDeath:
				System.out.println("Do not eat if you don't want to die");
				break;
			
			case veryToxic, toxic:
				System.out.println("Do not eat if you don't want to have stomach pain");
				break;
			
			case notToxic:
				System.out.println("Ok to eat");
			
			}
	
		}
	
}

