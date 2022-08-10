public class Microbes {
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
}
