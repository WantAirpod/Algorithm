package Chap03;

import java.util.Scanner;

public class SeqSearch {
	// �����˻�
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("��ڼ�");
		int num = input.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = input.nextInt();
		}

		System.out.println("�˻��� �� : ");
		int ky = input.nextInt();
		int idx = seqSearch(x, num, ky); // idx�� return ��

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� ����");
		} else
			System.out.println(ky + "��(��) x[" + idx + "] �ֽ��ϴ�.");
	}

	static int seqSearch(int[] a, int n, int key) {
//���� key���� �ش��ϴ� �迭�� ��Ұ� ���� �� �̸� ������� �߰��� ����� �ε����� ����
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i; // �˻�����(�ε�����ȯ)
			}

		}
		return -1; // �˻� ����(-1��ȯ)
	}
}

/*
 * while (true) { if (i == n) { return -1; // �˻� ����(-1�� ��ȯ) } if (a[i] == key) {
 * return i; // �˻� ���� (�ε����� ��ȯ) }
 * 
 * i++; }
 */
