package Chap02;

public class PrimeNumber_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ptr = 0; // ã�� �Ҽ� ����
		int[] prime = new int[500]; // �Ҽ��� �����ϴ� ����

		prime[ptr++] = 2; // 2�� �Ҽ���
		prime[ptr++] = 3; // 2�� �Ҽ���

		for (int n = 5; n <= 1000; n += 2) { // Ȧ����
			boolean flag = false;
			int i;
			for (i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) // ������ �������� �Ҽ��� �ƴ�
					flag = true;
				break; // ��
			}
			if (!flag) { // ���������� ����������� ����
				prime[ptr++] = n; // �Ҽ���� �迭�� ����.
				counter++;
			}

		}

		for (int i = 0; i < ptr; i++) { // ã�� ptr���� �Ҽ��� ��Ÿ��
			System.out.println(prime[i]);

		}
		System.out.println("�������� ������ Ƚ��  :  " + counter);

	}
}
