package Chap02;

public class PrimeNumber_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ptr = 0; // ã�� �Ҽ� ����
		int[] prime = new int[500]; // �Ҽ��� �����ϴ� ����

		prime[ptr++] = 2; // 2�� �Ҽ���

		for (int n = 3; n <= 1000; n += 2) { // Ȧ����
			int i;
			for (i = 1; i < ptr; i++) { // �̹� ã�� �Ҽ��� ���� ������ ��
				counter++;
				if (n % prime[i] == 0) // ������ �������� �Ҽ��� �ƴ�
					break; // ��
			}
			if (ptr == i) // ���������� ������ �������� ����
				prime[ptr++] = n; // �Ҽ���� �迭�� ����
		}

		for (int i = 0; i < ptr; i++) { // ã�� ptr���� �Ҽ��� ��Ÿ��
			System.out.println(prime[i]);

		}
		System.out.println("�������� ������ Ƚ��  :  " + counter);

	}

}
