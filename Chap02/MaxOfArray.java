package Chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
	public static void main(String[] args) {
		Random rand =new Random();

		Scanner input = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오");
		int n = input.nextInt();
		int[] a = new int[n];

		System.out.println("각각의 배열값 ㄱ");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			//a[i] = 100 + rand.nextInt(90);
			//0~1까지 난수생성. -> 90이면 0~89까지의 난수생성.
		}

		int max = 0;
		max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Max값은 " + max);

	}

}
