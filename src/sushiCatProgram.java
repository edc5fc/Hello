//import statements are here

//this is the sushiCatProgram class
public class sushiCatProgram {
	
	//this is the main method
	public static void main(String[] args) {
		Mushroom m = new Mushroom();
		m.toxicity = m.toxicity.apocalypticDeath;
		int foodLevel = m.eat();
		System.out.println(foodLevel);
		System.out.println(m.toxicity);
	}
}

