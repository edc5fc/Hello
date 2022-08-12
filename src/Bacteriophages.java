public class Bacteriophages extends Microbes{
	
	//fields
	public long legs;
	
	//methods
	public void growLegs() {
		legs++;
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello humans! I'm a " + species + "! Nice to meet you :) I have " + legs + " leg fibers.");
	}
}
