package Chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("요소수");
		int num = input.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요");
		System.out.println("x[0] : ");
		x[0] = input.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = input.nextInt();
			} while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력

		}

		System.out.println("검색할 값 : ");
		int ky = input.nextInt(); // 키 값을 입력

		int idx = Arrays.binarySearch(x, ky);

		if (idx <0 ) {
			System.out.println("그 값의 요소가 없습니다." + idx);
		} else {
			System.out.println(ky + "은x[" + idx + "]에 잇습니다.");
		}
	}

}
