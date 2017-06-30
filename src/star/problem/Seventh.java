package star.problem;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		int i, j, k, row;

		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();

		for (i = 1; i <= row; i+=2) {
			for (j = 1; j <= i; j+=2) {
				System.out.print(" ");
			}
			for (k = row; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
