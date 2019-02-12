package Chap03;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0; //처음 값  초기화 
		int pr = n - 1;    // 마지막 값   

		do {
			int pc = (pl + pr) / 2; //중앙 값 초기화
			if (a[pc] == key) {    
				return pc;   // 중앙 값이 key값인 경우.  
			} else if (a[pc] < key) {
				pl = pc + 1;  
			} else {
				pr = pc - 1;// 검색 범위를 앞쪽 절반으로 좁힘
			}

		} while (pl <= pr);    //맨 뒷 값이 맨앞 값보다 크거나 같으면 do 실행  pl과pr이 같아지는 순간 까지 계속 실행 
		return -1;

	}

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

		int idx = binSearch(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else
			System.out.println(ky + "여기에 있습니다." + idx);

	}

}
