package Chap01;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= n) { //i�� n�� �ݺ�
			
			sum += i;
			i++;
		}

		System.out.println(sum);
	}
}
