package star.problem;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		/*
		 * System.out.println("Enter the number of columns"); int col =
		 * sc.nextInt();
		 */

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
