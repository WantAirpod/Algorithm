package Chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] x = { "aaaa", "bbbb", "cccc", "dddd" };

		System.out.println("���ϴ� Ű���带 �Է��Ͻÿ� : ");// Ű ���� �Է�
		String ky = input.next(); // ��Ʈ�� �Է½� �׳� next !!!

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0) {
			System.out.println("�����ϴ� idx ���� : " + idx);

		}

		else {
			System.out.println("ky�� x[" + idx + "�� �ֽ��ϴ�.");
		}

	}

}
