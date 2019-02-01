package assignment3;

import java.util.Scanner;

class ReverseString
{
	public String reverse(String s) {
		String Rightword= ""; 
		String [] words = s.split(" ");
		for (String token:words){
			s= token+ " " +Rightword;
			Rightword=s.trim();
		}
		return s;
	}
}

public class Question3 {
	public static void main(String[] args)
	{
		String input = null;
        Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the string");
		input = inputReader.nextLine();
		System.out.println("You entered :" + input);
		ReverseString R = new ReverseString();
		System.out.println("The reversed string is "+R.reverse(input));
	}

}
