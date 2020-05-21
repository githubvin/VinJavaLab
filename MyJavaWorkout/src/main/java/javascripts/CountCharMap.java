package javascripts;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharMap {

	public static void main(String[] args) {
		
		/*Write a java program to find the count the characters in the given string
		String str = "Karma is powerful than God"
		{K=1, a=3, r=2, m=1,  =4, i=1, s=1, p=1, o=2, w=1, e=1, f=1, u=1, l=1, t=1, h=1, n=1, G=1, d=1} 
		Note: Use Map to bring the result */
		
		String str = "Karma is powerful than God"; 
		
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>(); 
		
		char[] ch = str.toCharArray(); 
		
		for (int i = 0; i < ch.length; i++) { 
			if (cMap.containsKey(ch[i])) {
				cMap.put(ch[i], cMap.get(ch[i]) + 1);  
			} else { 
				cMap.put(ch[i], 1); 
			}
		} 
		
		System.out.println(cMap);

	}

}
