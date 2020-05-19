package javascripts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveValueSet {

	public static void main(String[] args) {
		
		// This program is to retrieve a particular value from the Set 
		
		// Here we pick the value from an Integer Set 
		Set<Integer> testSet = new LinkedHashSet<Integer>(); 
		
		testSet.add(1); 
		testSet.add(2); 
		testSet.add(3); 
		testSet.add(4); 
		testSet.add(5); 
		testSet.add(6); 
		testSet.add(7); 
		testSet.add(8); 
		testSet.add(9); 
		
		List<Integer> list = new ArrayList<Integer>(testSet); 
		System.out.println(list.get(6)); 
		
		// Another method is by using Lambda method. Lambda method is used to write anonymous methods. 
		// Lambds is available only in Java 8 or more. 
		
		testSet.forEach((eachNum) -> { 
			if (eachNum == 7) 
				System.out.println(eachNum);
		});
		

	}

}
