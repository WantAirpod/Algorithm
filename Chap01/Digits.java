package Chap01;

import java.util.Scanner;

public class Digits {
//2�ڸ��� ����� �Է��Ͻÿ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no;

		do {
			System.out.println("���ڸ��� ����� �Է��Ͻÿ�");
			no = input.nextInt();

		} while (no < 10 || no >100);

		System.out.println(no);

	}
}
