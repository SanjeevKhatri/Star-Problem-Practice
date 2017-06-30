package star.problem;

import java.util.Scanner;

public class Ninth {
	public static void main(String[] args) {
		int i, j, k, a, b, c, row;

		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();

		int r = row;
		for (i = 1; i <= (row); i++) {
			for (j = 1; j <= r; j++) {
				System.out.print(" ");
			}
			r--;
			for (k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.print("\n");
		}

		for (a = 2; a <= row; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for (c = row; c >= a; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
