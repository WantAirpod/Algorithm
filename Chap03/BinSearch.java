package Chap03;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //ó�� ��  �ʱ�ȭ 
		int pr = n - 1;    // ������ ��   

		do {
			int pc = (pl + pr) / 2; //�߾� �� �ʱ�ȭ
			if (a[pc] == key) {    
				return pc;   // �߾� ���� key���� ���.  
			} else if (a[pc] < key) {
				pl = pc + 1;  
			} else {
				pr = pc - 1;// �˻� ������ ���� �������� ����
			}

		} while (pl <= pr);    //�� �� ���� �Ǿ� ������ ũ�ų� ������ do ����  pl��pr�� �������� ���� ���� ��� ���� 
		return -1;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��Ҽ�");
		int num = input.nextInt();
		int[] x = new int[num];

		System.out.println("������������ �Է��ϼ���");
		System.out.println("x[0] : ");
		x[0] = input.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = input.nextInt();
			} while (x[i] < x[i - 1]); // �ٷ� ���� ��Һ��� ������ �ٽ� �Է�

		}

		System.out.println("�˻��� �� : ");
		int ky = input.nextInt(); // Ű ���� �Է�

		int idx = binSearch(x, num, ky);

		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else
			System.out.println(ky + "���⿡ �ֽ��ϴ�." + idx);

	}

}
