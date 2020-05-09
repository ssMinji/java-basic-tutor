package com.itbank.javatutorials.interfaces;

interface I {
	public void z();
	// z() 메소드는 본체가 없음
}

// implements: 인터페이스 구현 키워드
public class A implements I{

	public void z() {
		System.out.println("z()");
	}
	
	public static void main(String[] args) {
		// 인터페이스 의미
		// 특정한 클래스를 특정한 인터페이스와 결합시키게 되면
		// 클래스를 정의할 때 인터페이스 내에 정의되어있는 메소드를 반드시 구현하도록 강제하고 있음 
		// 클래스 A는 인터페이스 I를 구현한다 

	}

}
