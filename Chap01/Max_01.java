package Chap01;

public class Max_01 {
//�޼��� ����
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		return max;  //return �ϴ� ���� �߿�
	}

	public static void main(String args[]) {
		int d = max3(3, 22, 1);
		System.out.println(d);
	}
}
