package javascripts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		
		// This program is to validate the given email in the right format or not. 
		
		String email = "balaji.chandrasekaran._@testleaf.com"; 
		String regex = "[A-Z0-9]+[._]+[A-Z0-9]+@[A-Z0-9]+.[A-Z.]{2,}"; 
		
		// Alternative regular expression is "^(.+)@(.+)$"
		
		//"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);  
		Matcher match = pattern.matcher(email); 
		System.out.println(match.matches());

	}

}
