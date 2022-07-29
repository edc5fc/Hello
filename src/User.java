//the import statements
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
	
	//fields
	public String username;
	private List<String> privateInfo = new ArrayList<String>();
	
	//methods
	public void PrivateInfo_Add(String info) {
		privateInfo.add(info);
	}
	
	public void PrivateInfo_Clear() {
		privateInfo.clear();
	}
	
	public String getFullPrivateInfo() {
		return Arrays.toString(privateInfo.toArray());
	}
	
	public String getSinglePrivateInfo(int index) {
		return privateInfo.get(index);
	}
}
