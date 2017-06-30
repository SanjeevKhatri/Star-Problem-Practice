package star.problem;

import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows you want: ");
		Scanner sc = new Scanner(System.in);
		int row, i, j, k;
		row = sc.nextInt();

		for (i = 1; i <= row; i+=2) {
			for (j = 1; j <= i; j+=2) {
				System.out.print(" ");
			}
			for (k = i; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = 1; i <= row; i+=2) {
			for (j = i; j <= row; j+=2) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
