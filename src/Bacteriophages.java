public class Bacteriophages extends Microbes{
	
	//fields
	public long legs;
	
	//methods
	public Bacteriophages(String species) {
		this.species = species;
	}
	
	public void growLegs() {
		legs++;
	}
	
	@Override
	public void sayHello() {
		if (species.equals("dead guy")) {
			super.sayHello();
		}
		else {System.out.println("Hello humans! I'm a " + species + "! Nice to meet you :) I have " + legs + " leg fibers.");}
	}
}
