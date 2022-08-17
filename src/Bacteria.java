public class Bacteria extends Microbes {
	
	//methods
	public Bacteria(String species) {
		this.species = species;
	}
	
	
	@Override
	public void sayHello() {
		if (species.equals("dead guy")) {
			super.sayHello();
		}
		else {System.out.println("Hewo! I'm a " + species + " bacteria!");}
	}
}
