package Chap04;

import java.util.Scanner;



public class IntStack {
	

	private int max; // ������ �뷮
	private int ptr; // ���� ������ (�� �ִ� ���� ���� �� �� ������ max�� ����)
	private int[] stk; // ���� ��ü

	// ���� �� ���� : ������ ��� ����...empty
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// ���� �� ���� : ������ ���� ��...full
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// ������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����.
			max = 0;
		}

	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) { // ���� ptr�� max(Stack�� �뷮)���� ũ�� Exception�� ������.
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x; // push�ϰ� �Ǹ� stk�� ptr���� �ϳ� �� �����ϰ� x���� �����Ѵ�.
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr--];
	}

	public int peek() throws EmptyIntStackException {
		// ���� ������ �޼��� ������ ����ִ� ��� ���� ó��
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];// ������ ������� ������ ������� ���[stk[ptr-1]��ȯ
	}

	// ���ÿ��� x�� ã�� �ε���(������-1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮�� ��ȯ(�˾ƺ��� �뵵)
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿� �ִ� �������� ��
	public int Size() {
		return ptr;
	}

	// ������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� �� �ִ°�
	public boolean isFull() {
		return ptr >= max;
	}

	// ���� ���� ��� �����͸� �ٴ�-> ����� ������ ���
	public void dump() {
		if (ptr <= 0) {
			System.out.println("������ ����ֽ��ϴ�.");

		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");

			}
			System.out.println();
		}
	}

}
