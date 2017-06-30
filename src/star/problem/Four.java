package star.problem;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		/*
		 * System.out.println("Enter the number of columns"); int col =
		 * sc.nextInt();
		 */
		int i, j, k;
		for (i = 0; i < row; i++) {
			for (k = 0; k <i; k++) {
				System.out.print(" ");
			}
			for (j = row; j >i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
