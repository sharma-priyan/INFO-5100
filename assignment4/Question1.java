package assignment4;

import java.util.Scanner;

public class Question1 {
	
	private static int NonRepeatingCharacter(String input) {
		int i,j,flag=-1;
		int length = input.length();
		for( i=0;i<length;i++){
			for( j=0;j<length;j++){
				if(i!=j){
				if(input.charAt(i)!=input.charAt(j)){
					continue;
				}
				else{
					break;
				}
				}
				else
					continue;
			}
			if(j==length){
				flag=0;
				break;
			}
			else{
				continue;
			}
		}
		if (flag==0)
			return i;
		else
			return flag;
	}

	public static void main(String[] args) {
		String inputString = null;
		int result;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the string");
		inputString = inputReader.nextLine();
		System.out.println("You entered :" + inputString);
		inputReader.close();
		result=NonRepeatingCharacter(inputString);
		System.out.println("The index of first non-repeating character is: "+result);
	}

	

}
