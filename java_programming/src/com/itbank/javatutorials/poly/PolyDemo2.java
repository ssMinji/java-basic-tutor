package com.itbank.javatutorials.poly;

interface I2{
	public String A(); // A메소드 구현 강제
}

interface I3{
	public String B(); // B메소드 구현 강제
}

class D implements I2, I3{
	public String A() { // I2인터페이스에 따라서 A메소드 구현
		return "A";
	}
	
	public String B() { // I3인터페이스에 따라서 B메소드 구현
		return "B";
	}
}


public class PolyDemo2 {

	public static void main(String[] args) {
		// 1) 클래스와 데이터타입 동일
		D obj = new D();
		obj.A();
		obj.B();
		
		
		// 2) 데이터타입을 I2
		I2 obj2 = new D();
		obj2.A();
		// obj2.B(); // 에러
		// obj2가 I2 행세를 하고 있는 것이고, I2는 메소드 A의 구현을 강제하고 있음
		// 메소드 A만을 가지고 있는 클래스인 것처럼 동작하게 됨 
		
		// 3) 데이터타입을 I3
		I3 obj3 = new D();
		// obj3.A(); // 에러 
		obj3.B();
		// obj3가  I3행세를 하고 있는데, I3는 메소드 B의 구현을 강제하고 있음
		// 메소드 B만을 가지고 있는 클래스인 것처럼 동작하게 됨 
		
		// 결론
		// 어떤 클래스의 데이터타입으로 인터페이스를 사용한다는 것은 
		// 마치 그 클래스가 그 인터페이스에서 정의한 멤버들만을 가지고 있는 클래스인 것처럼 동작
		
		// 따라서 인터페이스에서 다형성을 활용하면
		// 원하는 기능만 사용하고, 나머지 기능들을 신경쓰지 않을 수 있기 때문에 
		// 해당 기능에만 집중 할 수 있다 

	}

}
