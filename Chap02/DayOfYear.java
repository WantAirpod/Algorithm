package Chap02;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 20, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;  //1 �ƴϸ� 0���� �����ϰ� ǥ���߳�...�� �����̸� 1 �ƴϸ� 0 �̳� 
		

	}

	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for (int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1];  //�����̸� 1 �ƴϸ� 0 �����̸� ��¼��[1][-1] ���ͽ��� �ƴϸ� [0][-1] ���� ���� ��� ���ؼ� ������ ? y,m,d ������޶���
		}

		return days;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int retry;

		do {
			System.out.print("��: ");
			int year = input.nextInt();
			System.out.print("��: ");
			int month = input.nextInt();
			System.out.print("��: ");
			int day = input.nextInt();
			System.out.printf(" �� �� %d�� ° �Դϴ�. \n: ", dayOfYear(year, month, day));
			System.out.print("�ѹ��� �� ���  ? 1.�� 2.�ƴϿ� : ");
			retry = input.nextInt();

		} while (retry == 1);

	}

}