package assignment6;

import java.util.*;

public class Target {

	public static void main(String[] args) {

		int[] InputArray = new int[10];
		int[] key = new int[10];

		TreeMap<Integer, ArrayList> treemap = new TreeMap<>();
		Scanner count = new Scanner(System.in);
		System.out.println("how many elements u want to enter in array");
		int number = count.nextInt();
		Scanner input = new Scanner(System.in);
		System.out.println("enter the elements of array");
		for (int i = 0; i < number; i++) {
			InputArray[i] = input.nextInt();
		}
		Scanner trgt = new Scanner(System.in);
		System.out.println("Enter the target value");
		int target = trgt.nextInt();
		count.close();
		input.close();
		trgt.close();

		ArrayList<Integer>[] value = new ArrayList[10];
		value[0] = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			{
				key[i] = Math.abs(target - InputArray[i]);
				if (key[i + 1] == key[i]) {
					value[i].add(i);
					value[i].add(i + 1);
				} else
					value[i] = new ArrayList<Integer>();
				value[i].add(i);
				System.out.println(key[i]);

				treemap.put(key[i], value[i]);
				System.out.println("The tree map is"+treemap.toString());
			}

			}
		System.out.println("first key is" + treemap.firstKey());
		System.out.println("The index of closest value is " + treemap.get(treemap.firstKey()));
	
	}
}
