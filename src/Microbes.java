public class Microbes extends Cells {
	//fields
	public String species;
	public String host;
	public long infections;
	public long numberOfMicrobes;
	public long size;
	
	//methods
	public void infect(String host) {
		this.host = host;
		infections++;
	}
	
	public void sayHello() {
		System.out.println("Hello humans! I'm a " + species + "! Nice to meet you :)");
	}
}
