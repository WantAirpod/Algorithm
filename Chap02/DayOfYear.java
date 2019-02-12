package Chap02;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 20, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;  //1 아니면 0으로 간단하게 표현했네...ㅎ 윤년이면 1 아니면 0 이네 
		

	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];  //윤년이면 1 아니면 0 윤년이면 어쩌고[1][-1] 부터시작 아니면 [0][-1] 부터 시작 계속 더해서 어디까지 ? y,m,d 에따라달라짐
		}

		return days;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int retry;

		do {
			System.out.print("년: ");
			int year = input.nextInt();
			System.out.print("월: ");
			int month = input.nextInt();
			System.out.print("일: ");
			int day = input.nextInt();
			System.out.printf(" 그 해 %d일 째 입니다. \n: ", dayOfYear(year, month, day));
			System.out.print("한번더 할 까요  ? 1.예 2.아니오 : ");
			retry = input.nextInt();

		} while (retry == 1);

	}

}