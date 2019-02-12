package Chap02;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// 진수변환 알고리즘... 이해하기 귀찬핟 ㅠㅠ 하 하하핳 ㅏ하핳 ㅏㅠㅠ
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

		System.out.println("10진수를 기수로 변환합니다.");
		do {
			do { // 음수 거르기
				System.out.println("변환하는 음이 아닌 정수 ");
				no = input.nextInt();

			} while (no < 0);
			do { // 진수표현 do
				System.out.print("어떤진수로 변환할까요 ?  ( 2~36 ");
				cd = input.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);

			System.out.print(cd + "진수로는  ");

			for (int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다. ");

			System.out.print("한번더 할 까요 ?? ( 1.예 / 2. 아니요) :  ");
			retry = input.nextInt();

		} while (retry == 1); // 전체 do

	}
}
