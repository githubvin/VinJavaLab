package javascripts;

import java.util.Arrays;
import java.util.Collections;

public class SortReverseArray {

	public static void main(String[] args) {
		
		// This program is to sort and Reverse the given array. 
		
		int[] array = {5,1,33,79,22,11,45}; 
		
		Arrays.sort(array); // We use Arrays class to sort the given array 
		
		// Using loop and printing each value 
		System.out.println("Sorted Array:");
		for(int i = 0; i < array.length; i++) { 
			System.out.println(array[i] + " ");
		}
		
		// Reversing the loop and we print each value 
		System.out.println("\nReversed Array: ");
		for (int i = array.length-1; i >= 0; i--) { 
			System.out.println(array[i] + " ");
		}
		
		
		// Another way is to consider the given array as a List and playing with that 
		
		Integer[] array1 = {5,1,33,79,22,11,45}; 
		
		Arrays.sort(array1); // Using Arrays class. 
		System.out.println("\nSorted with List: " + Arrays.toString(array1)); 
		
		Collections.reverse(Arrays.asList(array1)); // Reversing using Collections class. 
		System.out.println("\nReversed with List: " + Arrays.toString(array1));
		

	}

}
