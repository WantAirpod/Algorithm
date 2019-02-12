package Algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����ϴ°� ��� ��
		// �ᱹ �� ���� �ִ밪�� �Ǵ���
		// 1 5 3 2 1 2 3 1 2 | 9 10
		// bar�ڿ��� �ִ� ������ ��
		// ��� �ݺ��Ͼ��ϳ� ? ���ڸ�ŭ.
		// �ѹ� ������ �ǳ����ڸ�

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			// n�� �Ȱڴ�.
			// 1 7 10 8 3 2 9 7 3 8 4 |
			// j->j->j
			// j����0 �����ؼ� 8���� �����Ѵ�.0~9��° ���� -ó��(i=0�϶�)
			// j����0 ���������� ��ĭ�ձ����� ���� ��.0~8���� ����� -�ι���(i=1)
			// j����0 ���������� ��ĭ�ձ����� ���� ��.0~7���� ����� -������(i=2)
			// ... ���� j�� ������ 0~n-i-2
			for (int j = 0; j <= n - i - 2; j++) {
				if (data[j] > data[j + 1]) {
					int temp;
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;

				}
			}
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", data[j]);
			}
			 System.out.println("");
		

		}
		
		/*
		 * for (int i = 0; i < n; i++) { System.out.printf("%d ", data[i]); }
		 * 
		 * System.out.println("");
		 */

	}

}
