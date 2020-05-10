package org.tutorials.javatutorials.oop;

public class No05_ScopeDemo3 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		// int i=30;
		System.out.println(i); // 여기의 i는 전역변수 사용했음을 의미 
	}

	public static void main(String[] args) {
		a(); // 5
		
		//왜 5인가?
		// 1. a()의 호출이 main의 스코프에서 영향을 받은 것인지확인하려면 
		int i = 1;
		a();
		// 하지만 똑같이 5 출력 
		
		// 2. b()메소드 수정해보기
		//수정해보면, 결과값이 30으로 나옴
		// i는 b의 스코프를 사용했음을 의미
		// 만약 지역변수 i가 없다면, 전역변수 i가 사용됨 
		
		// 결론
		// b라는 메소드를 호출하고 있는 메소드들(a, main)이 가지고 있는 지역변수들은 
		// b가 가지고 있는 변수에 영향을 미치지 않음
		
		// 이 때, 메소드 자기자신, 혹은 전역변수에만 접근할 수 있다고해서 정적인 유효범위(static(lexical) scope)라 함 
		// 즉, b라는 메소드를 누가 호출했는지는 중요하지 않음
		// 만약, b를 호출한 a 메소드에서의 i값이 출력되었다면 이는 동적인 유효범위(dynamic scope)라 함 
		
		

	}

}
