package javascripts;

public class AverageArray {

	public static void main(String[] args) {
		
		// Write a java program to find the average of the numbers in an arrray. 
		
		int[] array= {20, 30, 25, 35, -16, 60, -100}; 
		
		int sum = 0; 
		
		for(int i = 0; i < array.length; i++) { 
			sum += array[i]; 
		} 
		
		System.out.println("Average is: " + sum/array.length); 
		
		// Another method using for each loop 
		int sum1 = 0; 
		for (int n : array) {
			sum1 += n; 
		} 
		
		System.out.println("\nAverage using for each loop: " + sum1/array.length);

	}

}
