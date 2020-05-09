package com.itbank.javatutorials.day04;

class A {
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		//System.out.println(a.z()); 
		// 에러 이유: private
		System.out.println(a.x());
		
		// y는 public, z는 private
		// 만약 변수 or 메소드가
		// public : 누구든지 클래스의 메소드를 호출해서 사용 가능 
		// private: 내부적으로는 사용할 수 있지만 외부 클래스는 사용 불가능 
		// a.x()는 z()메소드를 호출하고 있음
		// z메소드와  x메소드는 같은 클래스 내에 존재 
		// 따라서 같은 클래스에서는 private 메소드를 호출 가능 
		// 즉, 클래스에서 직접적으로 메소드를 호출하는 것은 불가능 
		
		// 접근제어자 사용 이유 
		// 어플리케이션 - 은행 , 사용자 정보 - 금고 

	}

}
