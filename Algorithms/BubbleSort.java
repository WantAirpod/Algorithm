package Algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인접하는거 계속 비교
		// 결국 맨 끝이 최대값이 되더라
		// 1 5 3 2 1 2 3 1 2 | 9 10
		// bar뒤에는 최대 값으로 끝
		// 몇번 반복하야하나 ? 숫자만큼.
		// 한번 훑으면 맨끝한자리

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			// n번 훑겠다.
			// 1 7 10 8 3 2 9 7 3 8 4 |
			// j->j->j
			// j시작0 시작해서 8까지 가야한다.0~9번째 까지 -처음(i=0일때)
			// j시작0 마지막에서 한칸앞까지만 보면 됨.0~8까지 보면됨 -두번쨰(i=1)
			// j시작0 마지막에서 두칸앞까지만 보면 됨.0~7까지 보면됨 -세번쨰(i=2)
			// ... 따라서 j의 범위는 0~n-i-2
			for (int j = 0; j <= n - i - 2; j++) {
				if (data[j] > data[j + 1]) {
					int temp;
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;

				}
			}
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", data[j]);
			}
			 System.out.println("");
		

		}
		
		/*
		 * for (int i = 0; i < n; i++) { System.out.printf("%d ", data[i]); }
		 * 
		 * System.out.println("");
		 */

	}

}
