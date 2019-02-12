package Chap02;

import java.util.Scanner;

public class ArrayEqual {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			b[i] = input.nextInt();
		}
		
		System.out.println((equals(a, b) ? "같습니다" : "같지 안습니다"));

	}

	static boolean equals(int[] a, int[] b) {

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;

	}
}
