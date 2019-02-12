package Chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] x = { "aaaa", "bbbb", "cccc", "dddd" };

		System.out.println("원하는 키워드를 입력하시오 : ");// 키 값을 입력
		String ky = input.next(); // 스트링 입력시 그냥 next !!!

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0) {
			System.out.println("없습니다 idx 값은 : " + idx);

		}

		else {
			System.out.println("ky는 x[" + idx + "에 있습니다.");
		}

	}

}
