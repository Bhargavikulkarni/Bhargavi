package Assignment;

import java.util.Scanner;

public class ArrayUsingSwitch {
	// int final SUM = "SUM";
	public static void main(String[] args) {
		int i, j, row, col;
		int op;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();
		System.out.print("Enter the number of cols: ");
		col = sc.nextInt();

		int M1[][] = new int[row][col];
		int M2[][] = new int[row][col];
		// int sum[][] = new int[row][col;]
		int transpose[][] = new int[row][col];
		int original[][] = new int[row][col];

		System.out.println("Enter the elements of matrix1");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {

				M1[i][j] = sc.nextInt();
			}

			System.out.println();
		}
		System.out.println("Enter the elements of matrix2");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {

				M2[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter your choice :");
		op = sc.nextInt();

		switch (op) {

		case 1:
			System.out.println("Sum of two matrix :"); {
			for (int i1 = 0; i1 < row.length; i1++) {
				for (int j1 = 0; j1 < col.length; j1++) {
					int sum = M1[row][col] + M2[row][col];
					System.out.println();
				}
			}
		}
			break;
		case 2:
			System.out.println("Subtraction of two matrix :");
			int sub = M1[row][col] - M2[row][col];
			System.out.println();
			break;
		case 3:
			for (int i1 = 0; i1 < row; i1++) {
				for (int j1 = 0; j1 < col; j1++) {
					transpose[i1][j1] = original[j1][i1];
				}
			}
			System.out.println("Printing Matrix After Transpose:");
			for (int i11 = 0; i11 < row; i11++) {
				for (int j11 = 0; j11 < col; j11++) {
					System.out.print(transpose[i11][j11] + " ");
				}

			}
		}
	}

}
