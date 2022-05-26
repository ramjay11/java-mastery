package maps;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("Huskey", 12345);
		empIds.put("Saint", 12355);
		empIds.put("Siber", 12365);
		System.out.println(empIds);
		System.out.println(empIds.get("Huskey"));
	}
}
