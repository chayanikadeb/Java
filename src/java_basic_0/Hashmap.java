package java_basic_0;


//Import the HashMap class

import java.util.HashMap;

public class Hashmap {
	
	
	

	public static void main(String[] args) {
		
		// Create a HashMap object called capitalCities
		
		HashMap<String,String>capitalCities=new HashMap<String,String>();
		
		
// Add keys and values (Country, City)
		
		capitalCities.put("India", "Delhi");
		capitalCities.put("England", "London");
		capitalCities.put("USA", "Washington DC");
		
		
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("India"));
		
		System.out.println(capitalCities.size());
		System.out.println(capitalCities.remove("England"));
		System.out.println(capitalCities.get("London"));
		
		
		
		
		
		
	}

}
 