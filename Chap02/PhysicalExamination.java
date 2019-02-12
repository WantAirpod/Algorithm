package Chap02;

import java.util.Scanner;

class PhysicalExamination {

	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		// ������

		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;

		}
	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++) {
			sum += dat[i].height;

		}
		return sum / dat.length;
	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for (i = 0; i < dat.length; i++) {
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
				
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhyscData[] x = { new PhyscData("������", 162, 0.3), new PhyscData("����", 132, 0.1), new PhyscData("����", 154, 0.2),
				new PhyscData("����", 123, 0.32), new PhyscData("����", 112, 0.33), new PhyscData("sd", 112, 0.33),
				new PhyscData("saaa", 112, 0.33), };
		int[] vdist = new int[VMAX]; // �÷� ����

		System.out.println("�ڽ�ü�˻� ����Ʈ��");
		System.out.println("�̸�      Ű   �÷�");
		System.out.println("-------------");

		for (int i = 0; i < x.length; i++) {

			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		System.out.printf("\n��� Ű : %5.1f cm\n", aveHeight(x));

		distVision(x, vdist);

		System.out.println("\n�÷� ����");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %2d �� \n ", i / 10.0, vdist[i]);
		}

	}

}