	package Chap03;
	
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.Scanner;
	
	public class PhysExamSearch {
	
		static class PhyscData {
			private String name; // �̸�
			private int height; // Ű
			private double vision; // �÷�
	
			// ������
			public PhyscData(String name, int height, double vision) {
				this.name = name;
				this.height = height;
				this.vision = vision;
			}
	
			// ���ڿ��� ��ȯ�ϴ� �޼���(����Ȯ�ο�)
			public String toString() {
				return name + " " + height + " " + vision;
			}
	
			// ������������ �����ϱ� ���� comparator
			public static final Comparator<PhyscData> HEGIT_ORDER = new HeightOrderComparator();
	
			private static class HeightOrderComparator implements Comparator<PhyscData> {
				public int compare(PhyscData d1, PhyscData d2) {
					return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
				}
			}
	
		}
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); // Ű�� ������������ ���ĵǾ��ֽ��ϴ�.
			PhyscData[] x = { new PhyscData("�̳���", 160, 0.001), new PhyscData("������", 161, 0.3),
					new PhyscData("���Ѱ�", 163, 0.4), new PhyscData("ȫ�ر�", 164, 0.5), new PhyscData("������", 165, 0.6),
					new PhyscData("��ȣ��", 166, 0.7), new PhyscData("�̼���", 167, 0.8), };
	
			System.out.println("�� cm�� ����� ã�� �ֳ���");
			
			int height = input.nextInt();// Ű �� �Է�
			int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEGIT_ORDER);
			// �迭 x���� Ű�� height�� ��Ҹ� HEIGHT_ORDER�� ���� �˻�
			
			if (idx < 0)
				System.out.println("��Ұ� �����ϴ� : " + idx);
			else {
				System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
				System.out.println("ã�������� : " + x[idx]);
			}
	
		}
	}
