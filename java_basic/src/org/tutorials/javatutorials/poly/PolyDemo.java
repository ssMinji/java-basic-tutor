package org.tutorials.javatutorials.poly;

interface I{}
class C implements I{}

public class PolyDemo {
	public static void main(String[] args) {
        I obj = new C();
        
        // C라는 것은 I라는 인터페이스를 구현하고 있죠. 
        // 즉, 클래스가 인터페이스를 구현하고 있다면, 클래스의 인스턴스는 데이터타입이 인터페이스일 수 있다. 

	}
}
