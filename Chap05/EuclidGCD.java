package Chap05;

import java.util.Scanner;

public class EuclidGCD {
//��Ŭ���� ȣ�������� �ִ����� ���ϱ�
	static int gcd(int x, int y) {
		if (y == 0) {
			return x;
			// ���� x,y�� �ִ������� ���Ͽ� ��ȯ�մϴ�.
		} else
			return gcd(y, x % y);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.print("������ �Է��ϼ���");
		int x = input.nextInt();
		System.out.print("������ �Է��ϼ���");
		int y = input.nextInt();

		System.out.println("�ִ�������" + gcd(x, y) + "�Դϴ�.");

	}

}
