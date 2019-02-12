package Chap02;

public class ArraySumForIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		double sum = 0;
		for (double i : a) {      
			//for each문 배열 a의 처음부터 끝까지 모든 요소를 한 개씩 스캔합니다. 
			sum += i;
		}
		System.out.println("모든 요소의 합은 " + sum + " 입니다.");

	}

}
