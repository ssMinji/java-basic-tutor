package org.tutorials.javatutorials.oop;

public class No05_ScopeDemo {
	
	public static void a() {
		int i = 0; // i라는 변수가 a라는 메소드 안에서 선언되고있으므로 i는 a 메소드 밖에는 영향 미치지 않음 --> 스코프
	}

	public static void main(String[] args) {
		// 결과값이 무한히 0이 될까?
		for (int i=0; i<5; i++) {
			a(); 
			System.out.println(i);
		}

	}

}
