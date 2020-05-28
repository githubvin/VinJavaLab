package javascripts;

public class FibonacciReverse {

	public static void main(String[] args) {
		
		// Print the first 10 fibonacci numbers in reverse order 
		
		int range = 10; 
		int a = -1, b = 1;  // Declaring -1 becoz to start the series with 0 when the sum is a + b 
		int array[] = new int[range]; // With this array we reverse the print of obtained Fibonacci series 
		
		for (int i = 0; i < range; i++) { 
			array[i] = a + b; 
			a = b; 
			b = array[i]; 
			System.out.print(array[i] + " ");
		} 
		
		System.out.println("\nAfter reversing:"); 
		for (int i = array.length-1; i >= 0; i--) { 
			System.out.print(array[i] + " ");
		}
		

	}

}
