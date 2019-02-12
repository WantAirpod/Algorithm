package Chap02;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

	}

	static void reverse(int[] a) {

		for (int i = 0; i < a.length/ 2 ; i++) {

			swap(a, i, a.length - i - 1); 
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("¿ä¼Ú¼ö   :   ");
		int num = input.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			x[i] = input.nextInt();

		}

		reverse(x);
		
		
		for (int i = 0; i < num; i++) {
			System.out.println(x[i]);

		}

	}
}
