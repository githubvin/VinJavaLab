package javascripts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {

	public static void main(String[] args) {
		
		// Program is to validate the username in the given condition 
		// 1. It should contain minimum 8 characters.
		// 2. It allows alpha numeric characters and spl characters like . _ @ $ 
		
		String str = "vino$123"; 
		String regex = "[a-zA-Z0-9._@$]{8,}"; 
		Pattern pat = Pattern.compile(regex); 
		Matcher mat = pat.matcher(str); 
		System.out.println(mat.matches());

	}

}
