package javascripts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDupChar {

	public static void main(String[] args) {
		
		// This program is to find duplicate character in the given list. 
		
		String str = "When life gives you lemons, make lemonade"; 
		
		Set<Character> charSet = new LinkedHashSet<Character>(); 
		
		// As Set wont allow duplicates we can check the false condition while adding duplicate character and printing the same. 
		for (int i = 0; i < str.length(); i++) { 
			if(!charSet.add(str.charAt(i))) {
				System.out.println(str.charAt(i) + ",");
			}
		} 
		
		
		// Another method to find the duplicate characters 
		String txt = "When life gives you lemons, make lemonade"; 
		
		List<Character> charList = new ArrayList<Character>(); 
		
		System.out.println("\nAnother Way:");
		for (int i = 0; i < txt.length(); i++) {
			if (!charList.contains(txt.charAt(i))) {
				charList.add(txt.charAt(i)); 
			} else { 
				System.out.println(txt.charAt(i) + ",");
			}
		}
		
		
		
	}

}
