package star.problem;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		/*System.out.println("Enter the number of columns");
		int col = sc.nextInt();*/

		for (int i = row; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
