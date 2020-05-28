package javascripts;

public class ArmstrongNumberIn1000 {

	public static void main(String[] args) {
		
		// Print the armstrong numbers between 1 and 1000. 
		
		int r = 0; 
		int sum = 0; 
		
		for (int i = 1; i <= 1000; i++) { 
			sum = 0; 
			int temp = i; 
			while(temp > 0) { 
				r = temp%10; 
				sum += Math.pow(r, 3); 
				temp/=10; 
			} 
			
			if (sum == i) { 
				System.out.println("Armstrong number: " + sum);
			}
		}

	}

}
