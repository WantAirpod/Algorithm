	package Chap03;
	
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.Scanner;
	
	public class PhysExamSearch {
	
		static class PhyscData {
			private String name; // 이름
			private int height; // 키
			private double vision; // 시력
	
			// 생성자
			public PhyscData(String name, int height, double vision) {
				this.name = name;
				this.height = height;
				this.vision = vision;
			}
	
			// 문자열을 반환하는 메서드(정보확인용)
			public String toString() {
				return name + " " + height + " " + vision;
			}
	
			// 오름차순으로 정렬하기 위한 comparator
			public static final Comparator<PhyscData> HEGIT_ORDER = new HeightOrderComparator();
	
			private static class HeightOrderComparator implements Comparator<PhyscData> {
				public int compare(PhyscData d1, PhyscData d2) {
					return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
				}
			}
	
		}
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); // 키의 오름차순으로 정렬되어있습니다.
			PhyscData[] x = { new PhyscData("이나령", 160, 0.001), new PhyscData("유지훈", 161, 0.3),
					new PhyscData("김한결", 163, 0.4), new PhyscData("홍준기", 164, 0.5), new PhyscData("전서현", 165, 0.6),
					new PhyscData("이호현", 166, 0.7), new PhyscData("이수민", 167, 0.8), };
	
			System.out.println("몇 cm인 사람을 찾고 있나요");
			
			int height = input.nextInt();// 키 값 입력
			int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEGIT_ORDER);
			// 배열 x에서 키가 height인 요소를 HEIGHT_ORDER에 의해 검색
			
			if (idx < 0)
				System.out.println("요소가 없습니다 : " + idx);
			else {
				System.out.println("x[" + idx + "]에 있습니다.");
				System.out.println("찾은데이터 : " + x[idx]);
			}
	
		}
	}
