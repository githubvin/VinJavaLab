package javascripts;

public class CountUpperLowerNumberSpace {

	public static void main(String[] args) {
		
		// This program is to find the Upper Lower Numbers and space from a String 
		
		// This can be done by Character class 
		// ASCII 
		// Regex 
		
		// Approaching with Character class  
		
		String str = "1. It is Work from Home  not Work for Home"; 
		
		int upper = 0; 
		int lower = 0;
		int number = 0;  
		int space = 0; 
		
		char[] chArray = str.toCharArray(); 
		
		// Iterating in for loop on each char 
		for(int i = 0; i < chArray.length; i++) {
			if (chArray[i] == ' ') {
				space = space + 1; 
			} else if (Character.isUpperCase(chArray[i])) { 
				upper = upper + 1; 
			} else if (Character.isLowerCase(chArray[i])) { 
				lower = lower + 1; 
			} else if (Character.isDigit(chArray[i])) {
				number = number + 1; 
			}
		}
		
		System.out.println("Number of Spaces: " + space); 
		System.out.println("Number of Uppercases: " + upper); 
		System.out.println("Number of Lowercases: " + lower); 
		System.out.println("Number of Numeric: " + number); 
		
		
		// Another aproach with Regex 
		
		System.out.println("\nUsing Regex way");
		String txt = "1. It is Work from Home  not Work for Home"; 
		
		String spaceStr = txt.replaceAll("[^ ]", ""); 
		System.out.println("Space count: " + spaceStr.length()); 
		
		String numStr = txt.replaceAll("[^0-9]", ""); 
		System.out.println("Number count: " + numStr.length()); 
		
		String upperStr = txt.replaceAll("[^A-Z]", ""); 
		System.out.println("Uppercase count: " + upperStr.length()); 
		
		String lowerStr = txt.replaceAll("[^a-z]", ""); 
		System.out.println("Lowercase count: " + lowerStr.length());
		

	}

}
