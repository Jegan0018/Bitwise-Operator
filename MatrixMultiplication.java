package ArraysDemo;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows1 = scanner.nextInt();
		int columns1 = scanner.nextInt();
		int rows2 = scanner.nextInt();
		int columns2 = scanner.nextInt();
		int array1[][] = new int[rows1][columns1];
		int array2[][] = new int[rows2][columns2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				array1[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		if (columns1 != rows2) {
			System.out.println("Matrix Multiplication is Not Possible");
		}

		int array3[][] = new int[rows1][columns2];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < rows2; k++)
					array3[i][j] += array1[i][k] * array2[k][j];
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
