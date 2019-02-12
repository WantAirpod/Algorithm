package Chap02;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// ������ȯ �˰���... �����ϱ� ������ �Ф� �� �����K �����K ���Ф�
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;

		} while (x != 0);
		return digits;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10������ ����� ��ȯ�մϴ�.");
		do {
			do { // ���� �Ÿ���
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� ");
				no = input.nextInt();

			} while (no < 0);
			do { // ����ǥ�� do
				System.out.print("������� ��ȯ�ұ�� ?  ( 2~36 ");
				cd = input.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);

			System.out.print(cd + "�����δ�  ");

			for (int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�. ");

			System.out.print("�ѹ��� �� ��� ?? ( 1.�� / 2. �ƴϿ�) :  ");
			retry = input.nextInt();

		} while (retry == 1); // ��ü do

	}
}
