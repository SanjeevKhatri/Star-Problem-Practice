package star.problem;

import java.util.Scanner;

public class Fifth {

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
		int r = row;
		int i, j, k;
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

	}
}
