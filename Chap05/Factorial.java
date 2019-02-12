package Chap05;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n > 0) {
			// 양의 정수 n의 팩토리얼을 반환
			return n * factorial(n - 1);
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int x = input.nextInt();

		System.out.println(x + "의 팩토리얼은" + factorial(x) + "입니다.");

	}

}

//5*f(4)
//5*4*f(3)
//5*4*3*f(2)
//5*4*3*2*f(1)
//5*4*3*2*1*f(0)
//5*4*3*2*1*1