package Chap02;

import java.util.Scanner;

class PhysicalExamination {

	static final int VMAX = 21;

	static class PhyscData {
		String name;
		int height;
		double vision;

		// 생성자

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
		PhyscData[] x = { new PhyscData("박현규", 162, 0.3), new PhyscData("ㅇㅇ", 132, 0.1), new PhyscData("ㅁㅁ", 154, 0.2),
				new PhyscData("ㅋㅋ", 123, 0.32), new PhyscData("ㅂㅂ", 112, 0.33), new PhyscData("sd", 112, 0.33),
				new PhyscData("saaa", 112, 0.33), };
		int[] vdist = new int[VMAX]; // 시력 분포

		System.out.println("★신체검사 리스트★");
		System.out.println("이름      키   시력");
		System.out.println("-------------");

		for (int i = 0; i < x.length; i++) {

			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		System.out.printf("\n평균 키 : %5.1f cm\n", aveHeight(x));

		distVision(x, vdist);

		System.out.println("\n시력 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : %2d 명 \n ", i / 10.0, vdist[i]);
		}

	}

}
