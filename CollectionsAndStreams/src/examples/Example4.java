package examples;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
	
	// Using java.util.Map
	// Pairs of key - value
	// Allows repeated values, BUT DO NOT ALLOW repeated KEYs
	// Allows search by value and by key
	// Allows you to sort values
	
	public static void main(String[] args)
	{
		Map<String, Integer> FIFAWorldChampions = new HashMap<>();
		FIFAWorldChampions.put("Brasil", 5);
		FIFAWorldChampions.put("Alemanha", 4);
		FIFAWorldChampions.put("Itália", 4);
		FIFAWorldChampions.put("Uruguai", 2);
		FIFAWorldChampions.put("Argentina", 2);
		FIFAWorldChampions.put("França", 2);
		FIFAWorldChampions.put("Inglaterra", 1);
		FIFAWorldChampions.put("Espanha", 1);
		
		System.out.println(FIFAWorldChampions);
		
		// if you try to assign a new value to some key, it overwrites it
		FIFAWorldChampions.put("Brasil", 6);
		System.out.println(FIFAWorldChampions);

		// you can use "get" with key to find a value
		System.out.println(FIFAWorldChampions.get("Argentina"));
		
		// you can use "containsKey" or "containsValue" to check some key/value
		System.out.println(FIFAWorldChampions.containsValue(2));

		
	}
}
