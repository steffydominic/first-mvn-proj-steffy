package com.fssa.steffy.sampleprogs.project;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SignupValidation {

	public static boolean validate(User user)
			throws IllegalArgumentException {

		// check for nullity of the parameter
		if (user == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		else {
			return false;
		}
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.

	}
	

	public static boolean validateEmail(String email)
			throws IllegalArgumentException {
		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		Boolean isMatch = matcher.matches();
//				Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			return true;
		} else {
			throw new IllegalArgumentException("The email address is: Invalid");
		}
	}
	
	
	public class PasswordValidation {
		public static boolean passvalidation(String a) {
			String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(a);
//			Boolean isMatch = matcher.matches();
			Boolean isMatch = Pattern.matches(regex, a);

			if (isMatch) {
				return true;
			} else {
				throw new IllegalArgumentException("The password is Invalid");
			}
		}
		

			// regular expression for the password validation
			//the pass should contain one spl character,one caps,one small,8 charc long
			
	}
	

	public static void main(String[] args) {
		User s = null;
		validate(s);
	}


}
