package javascripts;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		// Write a java programs to print the duplicate items in the array
		
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2}; 
		
		System.out.println("Duplicates are: ");
		for (int i = 0; i < my_array.length-1; i++) { 
			if (my_array[i] == my_array[i+1]) { 
				System.out.println(my_array[i]);
			}
		} 
		
		// Another way 
		System.out.println("\nAnother way:"); 
		
		for (int i = 0; i < my_array.length-1; i++) { 
			for (int j = i+1; j < my_array.length; j++) { 
				if ((my_array[i] == my_array[j]) && (i != j)){
					System.out.println("Duplicate: " + my_array[i]);
				}
			}
		}

	}

}
