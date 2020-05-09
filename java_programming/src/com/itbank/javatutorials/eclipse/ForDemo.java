package com.itbank.javatutorials.eclipse;

public class ForDemo {

	public static void main(String[] args) {
		// 초기값; 조건문; 증감식
		int sum = 0;
		for(int i=0; i<4; i++) {
			//sum += i; 
			sum = sum + i; 
			// 0 -> 0+1 = 1 --> 1+2 = 3 --> 3+3 = 6
		}
		System.out.println(sum);
		
		// 0부터 10까지 1씩 증가하며 출력하지만, 3의 배수는 출력안함 
		/*for (int i=0; i<=10; i++) {
			if (i % 3 == 0) {
				//스킵하는것
				continue;
			}else {
				System.out.println(i);
			}
		}*/
		
		/*for (int i=0; i<20; i++) {
			if (i*2 == 10) {
				break;
			}
			System.out.println(i);
		}
		*/
		
		/*for (int i=5; i>=0; i--) {
			System.out.println(i);
		}*/
		
		for (int i=0; i<=3; i++) {
			for (int j=3; j>=0; j--) {
				System.out.println(i + " " + j);
			}
		}
		
		// i=0 --> j=3 j=2 j=1 j=0
		// i=1 --> j=3 j=2 j=1 j=0
		// i=2 --> j=3 j=2 j=1 j=0
		// i=3 --> j=3 j=2 j=1 j=0
		
		String[] numbers = {"one", "two", "three"};
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for-each문
		for (String num: numbers) {
			System.out.println(num);
		}
		// numbers: iterate객체 --> 배열 
		// 1스탭씩 순차적으로만 가능 
		
		// 퀴즈: 구구단 만들기) 2~9단까지 만들기 
		// 같은 단은 한 줄에 프린트 
		// 2 4 6 8 10 ...
		// 3 6 9 12 15 ...

		
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
