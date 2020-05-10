package org.tutorials.javatutorials.api;

//Math클래스
public class MathDemo {

	public static void main(String[] args) {
		// 1) abs: 절댓값 반환
		System.out.println(Math.abs(-1));
		
		// 2) max: 최댓값 반환
		System.out.println(Math.max(10, 20));
		
		int[] a = {2, 1, 7, 5, 3};
		// a의 원소 중 최댓값을 알아내보자 
		// max메소드 사용하기
		int num = -1000;
		for(int i: a) {
			num = Math.max(num, i);
		}
		System.out.println(num);

	}

}
