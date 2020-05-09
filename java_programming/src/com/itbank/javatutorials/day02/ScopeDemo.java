package com.itbank.javatutorials.day02;

public class ScopeDemo {
	
	public static void a() {
		int i=0; 
		// i라는 변수가 a라는 메소드 안에서 선언되고 있으므로 i는 a 메소드 밖에는 영향미치지 않음
		// 유효범위(Scope)스코프
	}

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}
		
		// 결과값 예상? -> 무한루프?
		// 결과는 무한루프가 아닌 0 1 2 3 4 

	}

}
