package Chap01;

import java.util.Scanner;

public class Digits {
//2자리의 양수를 입력하시오.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int no;

		do {
			System.out.println("두자리의 양수를 입력하시오");
			no = input.nextInt();

		} while (no < 10 || no >100);

		System.out.println(no);

	}
}
