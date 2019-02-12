package Algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
						//	i	
		//1 2 2 3 4 5 8 8 l 2
						//  j
		/*
		 * 10
			5 3 2 1 3 10 2 1 2 1
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)

		{
			data[i] = input.nextInt();
		}
		
		for(int i = 0 ; i<n ; i++) {
			//i가 가리키고 있는값을 넣어야한다.
			//단 i왼쪽은 모두 정렬되어야한다.
			for(int j=i ; j>=1 ;j--) {
				if(data[j-1] > data[j]) {
					int temp;
					temp =data[j-1];
					data[j-1]= data[j];
					data[j]=temp;
					
			
				}
				else break; //for문 탈출
			}
			for(int j=0 ; j<n ; j++) {
				System.out.printf("%d ",data[j]);

			
			}
			System.out.println("");		
		}
		for (int i=0; i<n ; i++) {
			System.out.printf("%d ",data[i]);
		}

	}

}
