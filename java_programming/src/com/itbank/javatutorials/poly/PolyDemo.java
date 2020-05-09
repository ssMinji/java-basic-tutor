package com.itbank.javatutorials.poly;

// 인터페이스와 다형성
interface I{}

class C implements I{}

public class PolyDemo {

	public static void main(String[] args) {
		I obj = new C();
		
		// 클래스가 인터페이스를 구현하고 있다면,
		// 클래스의 인스턴스는 데이터타입이 인터페이스일 수 있음

	}

}
