
package org.tutorials.javatutorials.oop;


//클래스 멤버와 인스턴스 멤버
class Calculator6 {
	// static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다.
	static int base = 10;
	int a, b;
	
	// 어떤 메소드보다도 먼저 실행됨 
	// 객체가 가장 먼저 해야할 일, 즉 초기화를 수행하게 됨 
	// 생성자의 이름은 클래스의 이름과 동일하다. 매우 중요!!! 
	public Calculator6(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b + base;
	}
	
	public int avg() {
		return (this.a + this.b)/2 ;
	}
	
	// 클래스 메소드 생성 
	public static int multiply(int c, int d) {
		return c * d;
	}
		
}
public class No06_ConstructorDemo {
	
	public static void main(String[] args) {
		
		// before 
		Calculator2 calc = new Calculator2();
		calc.setNum(3, 5);
		System.out.println(calc.sum()); // 18
		
		// 이렇게 변수 초기값 설정을 객체 생성 당시에 강제함 
		// 객체를 사용할 때 반드시 해야하는 일을 놓치지 않을 수 있도록 함 
		// 실수로 setNum을 하지 않는 문제를 방지 
		Calculator6 calc2 = new Calculator6(3, 5);
		
		// 결론
		// 클래스 정의할 때, 생성자 없으면 자동 생성해줌. 
		// 객체 생성할 때, new 뒤에 오는 것은 클래스의 생성자였음. 
		

	}

}
