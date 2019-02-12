package Chap03;

import java.util.Scanner;

public class SeqSearchSen {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("요솟수");
		int num = input.nextInt();
		int[] x = new int[num + 1]; // 요솟수 num +1

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = input.nextInt();
		}

		System.out.println("검색할 값 : ");
		int ky = input.nextInt();
		int idx = seqSearchSen(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없어");
		} else
			System.out.println(ky + "은(는) x[" + idx + "] 있습니다.");

	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; // 검색할 값 key를 보초로 a[n]에 대입합니다.

		while (true) {
			if (a[i] == key) { // 검색성공
				break;
			}

			i++;

		}

		return i == n ? -1 : i;    // i=n 같다는 것은 찾은게 없다는 뜻!!!

	}

}
