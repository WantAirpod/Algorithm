package Chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
	public static void main(String[] args) {
		Random rand =new Random();

		Scanner input = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��Ͻÿ�");
		int n = input.nextInt();
		int[] a = new int[n];

		System.out.println("������ �迭�� ��");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			//a[i] = 100 + rand.nextInt(90);
			//0~1���� ��������. -> 90�̸� 0~89������ ��������.
		}

		int max = 0;
		max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Max���� " + max);

	}

}
