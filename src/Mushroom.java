public class Mushroom implements Eat {
	
	public enum toxicity {apocalypticDeath, certainDeath, veryToxic, toxic, notToxic};
	public String species;
	public toxicity toxicity;
	public int foodLevel;
	
	public int eat() {
		foodLevel++;
		return foodLevel;
	}
}
