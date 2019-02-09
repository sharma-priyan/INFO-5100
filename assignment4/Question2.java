package assignment4;

import java.util.Scanner;

public class Question2 {

	static void AddNumbers(int num) {
		int n;
		int sum = 0;
		do {
			if (num == 0) { 
                num = sum; 
                sum = 0; 
            } 
			n = num % 10;
			num= num / 10;
			sum = sum + n;
		} while (num != 0||sum>9);
		System.out.println("sum is " + sum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		System.out.println("You entered :" + number);
		input.close();
		AddNumbers(number);

	}

}
