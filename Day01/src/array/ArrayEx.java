package array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		int score_01, score_02, score_03, score_04;
		
		Scanner sc = new Scanner(System.in);	
		
//		score_01 = sc.nextInt();
//		score_02 = sc.nextInt();
//		score_03 = sc.nextInt();
//		score_04 = sc.nextInt();
		
		int[] scores = new int[4]; 
		
//		for(int i=0; i<4; i++) {
//			scores[i] = sc.nextInt();
//		}
		
		// 배열: 인덱스와 인덱스에 대응하는 데이터로 이루어진 자료구조 
		
		int[] numbers = new int[] {0, 1, 2};
		System.out.println(numbers.length); // 3
		
		int[] numbers2 = {0, 1, 2};
		
		int[] numbers3 = new int[3];
		numbers3[0] = 0;
		numbers3[1] = 1;
		numbers3[2] = 2;
		
		for(int i=0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
		int[] numbers4 = new int[3];
		
		for(int i=0; i<numbers4.length; i++) {
			System.out.println(numbers4[i]);
		}
		// 초기화 없이 선언만 경우, 정수는 0, 실수는 0.0, 객체는 null 로 초기화 
	
	}

}
