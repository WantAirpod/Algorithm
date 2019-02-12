package Chap03;

import java.util.Scanner;

public class SeqSearch {
	// 선형검색
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("요솟수");
		int num = input.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = input.nextInt();
		}

		System.out.println("검색할 값 : ");
		int ky = input.nextInt();
		int idx = seqSearch(x, num, ky); // idx는 return 값

		if (idx == -1) {
			System.out.println("그 값의 요소가 없어");
		} else
			System.out.println(ky + "은(는) x[" + idx + "] 있습니다.");
	}

	static int seqSearch(int[] a, int n, int key) {
//만약 key값에 해당하는 배열에 요소가 여러 개 이면 가장먼저 발견한 요소의 인덱스가 추출
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i; // 검색성공(인덱스반환)
			}

		}
		return -1; // 검색 실패(-1반환)
	}
}

/*
 * while (true) { if (i == n) { return -1; // 검색 실패(-1을 반환) } if (a[i] == key) {
 * return i; // 검색 성공 (인덱스를 반환) }
 * 
 * i++; }
 */
