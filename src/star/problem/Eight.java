package star.problem;

import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		int i, j, k, row;

		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();

		for (i = 1; i <= row; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = row; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
