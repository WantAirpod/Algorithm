package Chap01;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.print("몇단 삼각형입니까");
			n = input.nextInt();

		} while (n < 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");

		}

	}

}
