package com.itbank.javatutorials.day03;

// 오버로딩과 상속
public class OverloadingDemo3 extends OverloadingDemo2 {
	
	// 오버로딩 메소드
	public void A(String arg1, String arg2) {
		System.out.println("sub class:void A(String arg1, String arg2) ");
	}
	
	// 부모클래스에 있는 A() 메소드 재정의함
	// 오버라이딩 메소드
	@Override
	public void A() {
		System.out.println("sub class: void A()");
	}

	public static void main(String[] args) {
		OverloadingDemo3 o1 = new OverloadingDemo3();
		o1.A();
		o1.A("hello", "hello2");

	}

}
