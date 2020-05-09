package com.itbank.javatutorials.interfaces;

// 다형성(Polymorphism)
// 하나의 메소드가 클래스에 있을 때 이것들이 다양한 방법으로 동작하는 것 
// 메소드는 동일하지만 그 요청을 받는 구현 클래스에 따라서 동작방식이 달라지는 것

class D{
	// 오버로딩(Overloading)
	public void a(int param) {
		System.out.println("숫자출력"+param);
	}
	public void a(String param) {
		System.out.println("문자출력"+param);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");
		
		// 다형성의 가장쉬운 예제가 오버로딩
		// 같은 메소드이지만 매개변수의 형식에 따라서 다른 로직 실행 가능

	}

}
