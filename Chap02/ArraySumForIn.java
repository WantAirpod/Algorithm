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
			//for each�� �迭 a�� ó������ ������ ��� ��Ҹ� �� ���� ��ĵ�մϴ�. 
			sum += i;
		}
		System.out.println("��� ����� ���� " + sum + " �Դϴ�.");

	}

}
