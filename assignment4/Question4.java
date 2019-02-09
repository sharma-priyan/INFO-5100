package assignment4;

import java.util.Scanner;

public class Question4 {
	
	
	static String checkPalindrome(String s, int start, int end) {
		if (start > end) return null;
		while (start >= 0 && end < s.length()
				&& s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return s.substring(start + 1, end);
	}

	
	 static String PalindromicString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like desed
			String palindrome = checkPalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like vffv
			palindrome = checkPalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		String inputString = null;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the string");
		inputString = inputReader.nextLine();
		System.out.println("You entered :" + inputString);
		inputReader.close();
		System.out.println(PalindromicString(inputString));
	}

}
