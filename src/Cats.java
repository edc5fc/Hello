//this is the cats class
public class Cats {
	
	//properties
	public long numberOfCats = 906_678_908_678L;
	public long numberOfPickles;
	public long numberOfJokes;
	public String wantedCat;
	public String catNameFirst;
	public String catNameLast;
	public String[] newUsers;
	public String[] tagExperts;
	
	//fields
	int numberOfAdvertisements;
	int reactorNumber;
	double packageCatDecimal;
	String favoriteCatTreat;
	String secretTextCat;
	String thingyCode;
	String crazyPassword;
	String bannerPattern;
	String secretBannerPattern;
	
	//methods
	public String getCatName() {
		return catNameFirst + " " + catNameLast;
	};
	
	public String poopOut(String text) {
		return "Fshwoop. " + text;
	};
	
	public String eatIn(String text) {
		return "Nom nom nom. " + text;
	};
}
