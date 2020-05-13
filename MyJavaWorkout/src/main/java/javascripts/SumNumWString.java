package javascripts;

public class SumNumWString {

	public static void main(String[] args) { 
		
		// Program to get the sum of digits from a given string 
		
		String str = "asdf1qwer9as8d7"; 
		
		// First extracting the numbers from the string 
		String numStr = str.replaceAll("\\D", ""); 
		
		// Converting the above string to integer 
		int num = Integer.parseInt(numStr); 
		System.out.println("Extracted number: " + num); 
		
		int sum = 0; 
		
		// Adding the sum of digits 
		while (num != 0) {
			sum = sum + num % 10; 
			num = num/10;  
		} 
		
		System.out.println("Sum of the given digits: " + sum); 
		
		
		// We can use ASCII 
		// Another method is using Character class character.isDigit 
		

	}

}
