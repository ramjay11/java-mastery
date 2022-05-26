package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {

	public static void main(String[] args) {
		String longString = "Huskey Saint Pasig City 09182238383 huskey@outlook.com";
		// Word that is 2 to 20 characters in length
		// [A-Za-z] {2,20}  \\w{2,20}
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
}
