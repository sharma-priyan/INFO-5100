package assignment4;

import java.util.Scanner;

public class Question5 {
	
	private static void Rotate90degrees(int[][] a,int rows,int columns) {
		int b[][]= new int[columns][rows];
		for(int i=0;i<columns;i++){
			int k=0;
			for(int j=rows-1;j>=0;j--){
				b[i][k]=a[j][i];				//copy the array values to a new array
				k++;
			}
		}
		System.out.println("Matrix after rotating 90 degress is as below:");
		for (int i = 0; i < columns; i++) {
			System.out.println("");
			for(int j=0;j<rows;j++){
				System.out.print(b[i][j]+"\t");
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many rows and columns you want to put in the matrix?");
		System.out.println("Enter the rows");
		int rows = input.nextInt(); 	// take the row size from user
		System.out.println("Enter the columns");
		int columns = input.nextInt();	// take the column size from user
		int matrix[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for(int j=0;j<columns;j++){
				System.out.println("number" + i + j +":");
				matrix[i][j] = input.nextInt(); // take the array numbers from user	
			}
			
		}
		System.out.println("Matrix you entered is as below:");
		for (int i = 0; i < rows; i++) {
			System.out.println("");
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			
		}
		input.close();
		Rotate90degrees(matrix,rows,columns);
	}

	

}
