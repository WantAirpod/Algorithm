package Chap02;

public class PrimeNumber_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0; // �������� Ƚ��

		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) { // ������ �Ҽ� ����
				counter++;
			if (n % i == 0) // ����������� �Ҽ��� �ƴ�
				break; // �� �̻��� �ݺ��� ���ʿ�
		}
			if (n == i) // ������ ���� ������ �������� ����
				System.out.println(n); // �Ҽ� ����

		}
		
		System.out.println("�������� ������ Ƚ��" + counter);
		

	}

}