package com.itbank.javatutorials.interfaces;

class E{
	public String x() {
		return "E.x";
	}
}

class F extends E{
	public String x() {
		return "F.x";
	}
	
	public String y() {
		return "y";
	}
}


public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// 클래스 F로 인스턴스를 만들었지만, 이는 클래스 E의 데이터타입의 행세를 하고 있는 것 
		//F obj1 = new F();
		E obj = new F();
		System.out.println(obj.x());// F.x
		//obj.y(); // 에러 
		
		// obj는 클래스 E의 행세를 하고 있기 때문에
		// x를 호출하는 것은 정상적으로 동작하지만
		// E가 가지고 있지 않은 y메소드는 호출 불가능 
		
		// 결론
		// 클래스를 인스턴스화할 때 인스턴스를 담는 변수의 데이터타입은
		// 해당 클래스가 될 수도 있고, 그 클래스의 부모클래스가 될 수도 있음 
		
		// 오버라이딩 함수 -> 자식클래스의 메소드 호출 
		// 결국에는 E클래스 행세를 하고 있지만 메소드 x라는 것은? F의 멤버다 
		
		// 결론
		// 클래스 F에서 추가적으로 정의한 메소드(y())는 실행되지 않는다는 것
		// 오버라이딩한 메소드가 있다면 인스턴스화 시킨 클래스의 메소드를 실행시킴

	}

}
