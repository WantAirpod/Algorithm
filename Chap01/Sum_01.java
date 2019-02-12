package Chap01;

import java.util.Scanner;

public class Sum_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.println("n의 값");
			n = input.nextInt();

		} while (n <= 0); // n이 0보다 작을 때
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;

		}

		System.out.println(sum);

	}

}
