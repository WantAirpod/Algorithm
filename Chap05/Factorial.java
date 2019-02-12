package Chap05;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n > 0) {
			// ���� ���� n�� ���丮���� ��ȯ
			return n * factorial(n - 1);
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int x = input.nextInt();

		System.out.println(x + "�� ���丮����" + factorial(x) + "�Դϴ�.");

	}

}

//5*f(4)
//5*4*f(3)
//5*4*3*f(2)
//5*4*3*2*f(1)
//5*4*3*2*1*f(0)
//5*4*3*2*1*1