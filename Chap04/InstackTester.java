package Chap04;

import java.io.InputStream;
import java.util.Scanner;

import Chap04.IntStack.OverflowIntStackException;

public class InstackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		IntStack s = new IntStack(64); // 최대를 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.println("현제 데이터 수 : " + s.Size() + " / " + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크" + "(4)덤프 (0)종료");

			int menu = input.nextInt();

			if (menu == 0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.println("데이터 : ");
				x = input.nextInt();

				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다");

				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다");

				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4: // 뎀프
				s.dump();
				break;
			}
		}

	}
}
