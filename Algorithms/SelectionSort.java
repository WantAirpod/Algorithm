package Algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 10
		 1 5 6 8 3 4 5 9 2 10
		 ----
		 1 2 3 4 5 5 6 8 9 10
		*/

		int[] data = new int[50];
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			data[i] = (int) input.nextInt();
		}

	 
	 

		//i를 0부터 n까지 한칸한칸 움직임
		for (int i = 0; i < n; i++) {
			//이제 i번쨰에 최소값을 넣어라
			//I번쨰 부터 맨끝까지의 값중 최소값을 넣어라.
			//       I       INX
			// 1 2 | 6 4 8 3  2  10
			//		INX 
			//         j->j->j->j->j
			int inx = i; // inx=i로놓고 j랑 비교하기
			for (int j = i; j < n; j++) {

				if (data[inx] > data[j]) {
					inx = j; // inx를 j로 옮김.
				}
			}
				int temp;
				temp = data[i];
				data[i] = data[inx];
				data[inx] = temp;
				
				for (int j = 0 ; j<n ; j++)
					System.out.printf("%d ",data[j]);
				System.out.println("");

			}

	 
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", data[i]);
		}
	}

}
