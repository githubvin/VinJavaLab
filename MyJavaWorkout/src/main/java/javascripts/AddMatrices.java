package javascripts;

public class AddMatrices {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to add to matrices 
		 * Matrices 1: 
		 * 1 2 3 
		 * 4 5 6 
		 * 7 8 9
		 * Matrices 2: 
		 * 9 8 7 
		 * 6 5 4 
		 * 3 2 1 
		 * Solution: 
		 * 10 10 10 
		 * 10 10 10 
		 * 10 10 10
		 * 
		 */ 
		
		int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}}; 
		int[][] mat2 = {{9,8,7},{6,5,4},{3,2,1}}; 
		
		int[][] res = new int[3][3]; 
		
		System.out.println("After Adding the matrices");
		for (int i = 0; i < mat1.length; i++) { 
			for (int j = 0; j < mat2.length; j++) { 
				 res[i][j] = mat1[i][j] + mat2[i][j]; 
				 System.out.print(res[i][j] + " ");
			} 
			System.out.println();
		}

		
		
		
		
		
		
	}

}
