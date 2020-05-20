package javascripts;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RetriveValueMap {

	public static void main(String[] args) {

		// The program is to retrieve Keys and Values from Map in 3 different ways. 
		
		Map<String, Integer> vMap = new LinkedHashMap<String, Integer>();  
		
		vMap.put("A", 1); 
		vMap.put("B", 2); 
		vMap.put("C", 3); 
		vMap.put("D", 4); 
		vMap.put("E", 5); 
		
		System.out.println("Simple Print: " + vMap);
		
		// Printing using normal for each 
		System.out.println("\nUsing Normal for each: ");
		for (Map.Entry<String, Integer> eachEntry : vMap.entrySet()) {
			System.out.println(eachEntry.getKey() + "->" + eachEntry.getValue());
		} 
		
		
		// Second approach using Iterator 
		Iterator<Entry<String, Integer>> itr = vMap.entrySet().iterator(); 
		
		System.out.println("\nUsing Iterator approach:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} 
		
		// Third using Stream 
		System.out.println("\nUsing Stream:");
		vMap.entrySet().stream().forEach(System.out::println); 
		
		
		// Using String conversion 
		System.out.println("\nUsing String Conversion:");
		System.out.println(vMap.entrySet().toString()); 
		System.out.println(vMap.toString());

	}

}
