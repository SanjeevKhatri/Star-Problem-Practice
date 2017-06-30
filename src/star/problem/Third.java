package star.problem;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		/*
		 * System.out.println("Enter the number of columns"); int col =
		 * sc.nextInt();
		 */
		int i, j, k;
		for (i = row; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (k = row; k >= i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
