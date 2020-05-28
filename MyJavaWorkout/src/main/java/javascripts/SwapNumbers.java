package javascripts;

public class SwapNumbers {

	public static void main(String[] args) {
		
		// Write a java program to swap two numbers
		
		// Using a Third variable 
		int a = 5, b= 10; 
		int c = 0; 
		
		System.out.println("Befor Swapping: a = " + a + " b = " + b); 
		
		c = a; 
		a = b; 
		b = c; 
		
		System.out.println("After Swapping: a = " + a + " b = " + b); 
		
		
		// Without using Third variable 
		
		a = a + b; // a becomes 15 
		b = a - b; // 15-10 assigned to b and becomes 5 
		a = a - b; // b becomes 5 here and 15-5 assigned to a becomes 10 

		System.out.println("After Swapping without third variable: a = " + a + " b = " + b); 

	}

}
