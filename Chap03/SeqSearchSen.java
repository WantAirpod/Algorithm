package Chap03;

import java.util.Scanner;

public class SeqSearchSen {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("��ڼ�");
		int num = input.nextInt();
		int[] x = new int[num + 1]; // ��ڼ� num +1

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = input.nextInt();
		}

		System.out.println("�˻��� �� : ");
		int ky = input.nextInt();
		int idx = seqSearchSen(x, num, ky);

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� ����");
		} else
			System.out.println(ky + "��(��) x[" + idx + "] �ֽ��ϴ�.");

	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // �˻��� �� key�� ���ʷ� a[n]�� �����մϴ�.

		while (true) {
			if (a[i] == key) { // �˻�����
				break;
			}

			i++;

		}

		return i == n ? -1 : i;    // i=n ���ٴ� ���� ã���� ���ٴ� ��!!!

	}

}
