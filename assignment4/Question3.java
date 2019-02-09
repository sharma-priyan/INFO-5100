package assignment4;

import java.util.Scanner;

public class Question3 {

	static void MoveZeroes(int length, int a[]) {
		int j=0;
		int b[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (a[i] != 0) {
					b[j]=a[i];			//copy all non-zero values to another array
					j++;
					} else
						continue;
				}
		do
		{
			b[j]=0;						//fill the remaining cells of array with zero
			j++;
		}while(j<length);
		System.out.println("\n\nArray of numbers after moving all 0's to the end is below:");
		for (int i : b) {
			System.out.print(i + "\t");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many number you want to put in the array?");
		int count = input.nextInt(); // take the array size from user
		int array[] = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("number" + i + ":");
			array[i] = input.nextInt(); // take the array numbers from user
		}
		System.out.println("Array of numbers you entered is as below:");
		for (int i : array) {
			System.out.print(i + "\t");
		}
		input.close();
		MoveZeroes(count, array);

	}

}
