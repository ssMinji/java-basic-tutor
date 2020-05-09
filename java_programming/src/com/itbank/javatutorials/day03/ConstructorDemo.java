package com.itbank.javatutorials.day03;

// 생성자
// 객체를 생성하는 역할
// 객체를 생성하는 과정에서 최초로 수행해야 하는 일을 위한 메소드를 정의할 수 있도록 하는 것 
public class ConstructorDemo {
	
	// 기본생성자를 명시적으로 선언
	public ConstructorDemo() {}
	
	// 사용자정의 생성자 선언 --> 자바가 기본생성자를 암묵적으로 생성해주지 않는다
	public ConstructorDemo(int a) {
		
	}
	
	public static void main(String[] args) {
		// ConstructorDemo(): 기본생성자
		ConstructorDemo c = new ConstructorDemo();
		
		// 기본생성자가 아닌 생성자 즉, 어떠한 생성자가 개발자에 의해 명시적으로 생성이되면
		// 자바는 기본생성자를 암시적으로 만들어주지 않는다. 
	}

}
