package Chap04;

import java.io.InputStream;
import java.util.Scanner;

import Chap04.IntStack.OverflowIntStackException;

public class InstackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		IntStack s = new IntStack(64); // �ִ븦 64���� Ǫ���� �� �ִ� ����

		while (true) {
			System.out.println("���� ������ �� : " + s.Size() + " / " + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ" + "(4)���� (0)����");

			int menu = input.nextInt();

			if (menu == 0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.println("������ : ");
				x = input.nextInt();

				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�");

				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�");

				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;
			}
		}

	}
}
