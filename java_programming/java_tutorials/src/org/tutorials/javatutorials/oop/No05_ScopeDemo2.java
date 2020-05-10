package org.tutorials.javatutorials.oop;

public class No05_ScopeDemo2 {
	static int i; // 클래스 바로 밑에 i가 선언됨 
	// 클래스에 직접 속해있는 변수이기 때문에 전역변수라고도 함 global variable
	// 클래스 내에 있는 모든 메소드와 모든 것에 영향을 미침 
	
	static void a() { // 메소드 내에서 선언된 변수를 지역변수라고함 local variable
		i = 0; // int가 i앞에 없음 선언말고 할당만 함
		// 선언하지 않고 할당만 하고있기 때문에 전역변수 i 사용한 것 
	}

	public static void main(String[] args) {
		// 무한 루프 발생
		for (i=0; i<5; i++) { // i앞에 int없음 선언은 위의 전역변수에서 해준 것 
			a(); // i의 값을 다시 0으로 바꿔버림
			System.out.println(i);
		}
		
		// 만약 메소드 안의 i를 int로 선언하거나
		// for문의 i를 int로 선언하면 무한루프 발생하지 않음 
		// 메소드 안의 i를 int로 선언 -> 메소드 안에서 생성하고 있기 때문에 i는 a안에서만 유효하게 됨 
		// 같은 이름이지만 바깥쪽에 있는 전역변수 i와는 전혀 무관한 값이 됨 
		// for문의 i를 int로 선언 -> for문의 중괄호 안에서만 유효한 변수
		
		// 생성된 곳의 {}블럭 내에서만 유효
		// 변수 선언은 변수의 유효범위를 정하는 행위 
	}

}
