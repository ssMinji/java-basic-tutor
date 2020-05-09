package com.itbank.javatutorials.abstracts;

// 추상화 
abstract class Ex {
	// final: 상속/변경을 금지하는 규제 -> 상수선언에 사용되는 키워드 
	// public static 키워드로 선언해주는 것이 일반적
	// static: 클래스 변수
	public static final int BASE = 10; // 상수
	
	public abstract int b();
	// 추상메소드는 본체를 가질 수 없음 
	
	// public abstract void c() {System.out.println("hello");};
	
	public void d() {
		System.out.println("hello");
	}
}

// b() 메소드는 추상메소드이고, 추상메소드의 특징은 중괄호로 시작하는 본체가 존재하지 않음
// 즉, 구체적인 로직을 담고있는 본체가 없고, 시그니처만이 남아있는 메소드
class B extends Ex {
	// 메소드를 반드시 '오버라이딩'해서 구체적인 로직을 정의해줘야 함 
	public int b() {
		return 1;
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		//Ex obj = new Ex();
		// 에러
		// 추상클래스는 반드시 상속해서 사용해야 함 
		
		B obj = new B();
		System.out.println(obj.b());
		
		//  추상클래스를 사용하는 이유 -> 상속을 강제하기 위함
		
		// Ex라는 클래스는  abstract 클래스를 먼저 정의했다기보다는
		// b라는 메소드가 추상메소드이기 때문에 이를 가지고 있는 클래스 Ex는 자동으로 추상클래스가된것
		// 메소드 중 하나라도 추상메소드이면 그 메소드를 담고 있는 클래스는 abstract 클래스가 됨 

	}

}
