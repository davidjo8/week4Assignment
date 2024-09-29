package week04;

import java.util.Scanner;

public class Square {

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = input.nextInt();
		
		System.out.println("Enter the number of columns:");
		int columns = input.nextInt();
		
		System.out.println("Rows: " + rows + "; Columns: " + columns);
		
		for (int row = 1; row <= rows; row++) {
		  // System.out.println("*");
			for (int column = 1; column <= columns; column++);{
				System.out.print("*");
			}
			
		} System.out.println();
		
	}

}
