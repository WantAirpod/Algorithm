package Chap04;

import java.util.EmptyStackException;

import Chap04.IntStack.OverflowIntStackException;

public class IntQueue {
	private int max; // ť�� �뷮
	private int front; // ù ��° ��� Ŀ��
	private int rear; // ������ ��� Ŀ��
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü

	// ť�� �������
	public class EmptyIntQueueExcetion extends RuntimeException {
		public EmptyIntQueueExcetion() {

		}
	}

	// ť�� ����
	public class OverflowIntQueueExceetion extends RuntimeException {
		public OverflowIntQueueExceetion() {

		}
	}

	// ������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// ť�� ������ ��ť
	public int enque(int x) throws OverflowIntQueueExceetion {
		if (num >= max) { // ���簪�� max���� ũ��=������.
			throw new OverflowIntQueueExceetion(); // ť�� ������
		}
		que[rear++] = x;
		num++;
		if (rear == max) { // rear��0���� �ٲ������...
			rear = 0;
		}
		return x;
	}

	public int deque() throws EmptyIntQueueExcetion {
		if (num <= 0) { // ť�� �������.
			throw new EmptyStackException();
		}
		int x = que[front++];
		num--;
		if (front == max) {
			front = 0;
		}
		return x;
	}

	// ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueExcetion {
		if (num <= 0) {
			throw new EmptyIntQueueExcetion();
		}
		return que[front];
	}

	// ť���� x�� �˻��Ͽ� �ε���(ã�����ϸ�-1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) { // �˻� ����
				return idx;
			}
		}
		return -1; // �˻� ����.
	}

	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� �׿��ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ����ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ����á����?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� ��� �����͸� ����Ʈ ->���� ������ ���
	public void dump() {
		if (num <= 0) {
			System.out.println("ť�� ��� �ս��ϴ�.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i + front) % max] + " ");
			}
			System.out.println();
		}
	}
}
