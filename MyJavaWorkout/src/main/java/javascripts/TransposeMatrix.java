package javascripts;

public class TransposeMatrix {

	public static void main(String[] args) { 
		
		/*
		 * Write a java program to transpose the matrix.
		 * 
		 * Actual Matrix 
		 * 1 2 3 
		 * 4 5 6 
		 * 7 8 9 
		 * 
		 * Transposed Matrix 
		 * 1 4 7 
		 * 2 5 8 
		 * 3 6 9
		 */ 
		
		// This can be done using two dimensional array as follows. 
		
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}}; 
		
		System.out.println("Actual Matrix"); 
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr.length; j++) { 
				System.out.print(arr[i][j] + " ");
			} 
			System.out.println();
		} 
		
		
		System.out.println("\nTransposed Matrix"); 
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr.length; j++) { 
				System.out.print(arr[j][i] + " ");
			} 
			System.out.println();
		}

	}

}
