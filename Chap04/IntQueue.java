package Chap04;

import java.util.EmptyStackException;

import Chap04.IntStack.OverflowIntStackException;

public class IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 큐가 비어있음
	public class EmptyIntQueueExcetion extends RuntimeException {
		public EmptyIntQueueExcetion() {

		}
	}

	// 큐가 꽉참
	public class OverflowIntQueueExceetion extends RuntimeException {
		public OverflowIntQueueExceetion() {

		}
	}

	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 큐에 데이터 인큐
	public int enque(int x) throws OverflowIntQueueExceetion {
		if (num >= max) { // 현재값이 max보다 크다=가득참.
			throw new OverflowIntQueueExceetion(); // 큐가 가득참
		}
		que[rear++] = x;
		num++;
		if (rear == max) { // rear를0으로 바꿔줘야함...
			rear = 0;
		}
		return x;
	}

	public int deque() throws EmptyIntQueueExcetion {
		if (num <= 0) { // 큐가 비어있음.
			throw new EmptyStackException();
		}
		int x = que[front++];
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}

	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueExcetion {
		if (num <= 0) {
			throw new EmptyIntQueueExcetion();
		}
		return que[front];
	}

	// 큐에서 x를 검색하여 인덱스(찾지못하면-1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) { // 검색 성공
				return idx;
			}
		}
		return -1; // 검색 실패.
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 ->리어 순으로 출력
	public void dump() {
		if (num <= 0) {
			System.out.println("큐가 비어 잇습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
