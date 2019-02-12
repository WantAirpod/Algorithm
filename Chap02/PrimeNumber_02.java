package Chap02;

public class PrimeNumber_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ptr = 0; // 찾은 소수 갯수
		int[] prime = new int[500]; // 소수를 저장하는 공간

		prime[ptr++] = 2; // 2는 소수임

		for (int n = 3; n <= 1000; n += 2) { // 홀수만
			int i;
			for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 먼저 나누어 봄
				counter++;
				if (n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
					break; // 끝
			}
			if (ptr == i) // 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n; // 소수라고 배열에 저장
		}

		for (int i = 0; i < ptr; i++) { // 찾은 ptr개의 소수를 나타냄
			System.out.println(prime[i]);

		}
		System.out.println("나눗셈을 수행한 횟수  :  " + counter);

	}

}
