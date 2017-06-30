package star.problem;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, temp;
		while (true) {
			System.out.println("Enter the odd number of rows");
			temp = sc.nextInt();
			if (temp % 2 != 0) {
				row = temp;
				break;
			} else {
				System.out.println("You Can not Enter Even number of Rows");
			}
		}
		/*
		 * System.out.println("Enter the number of columns"); int col =
		 * sc.nextInt();
		 */
		int i, j, k;
		for (i = 0; i <= row; i++) {
			for (j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
