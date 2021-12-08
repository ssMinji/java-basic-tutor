package org.tutorials.javatutorials.oop;


// 클래스 멤버와 인스턴스 멤버
class Calculator2 {
	// static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다.
	static int base = 10;
	int a, b;
	
	public void setNum(int a, int b) {
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
public class No03_Calculator2 {
	
	public static void main(String[] args) {
		// 멤버-> 변수, 메소드 
		/*인스턴스마다 서로 다른 값을 가지기 때문에 인스턴스의 멤버 
		클래스 멤버는 모든 인스턴스에서 같은 값을 가짐
		
		변수를 field라 함 
		클래스 변수란? 
		인스턴스를 생성하지 않고도 클래스에 직접 접근해서 클래스에 소속되어있는 변수에 접근해서 사용할 수 있다. 
		 
		*/
		
		// base가 무슨값인지 알고자할 때 인스턴스 생성없이 알 수 있음 
		System.out.println(Calculator2.base);
		
		Calculator2 calc = new Calculator2();
		calc.setNum(3, 5);
		System.out.println(calc.sum()); // 18
		
		// 클래스 변수값 변경
		Calculator2.base = 20;
		System.out.println(Calculator2.base); // 20 
		// 값의 변경사항 모든 인스턴스가 공유
		System.out.println(calc.sum()); // 28
		
		/*클래스 메소드란?
		 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다. 
		인스턴스 변수: non-static field / 클래스 변수: static field 
		
		*/
		
		// 상태를 공유할 필요없이 클래스에 직접 접근해 메소드 이용 
		// 일회용처럼 한번만 사용하고 싶을 때, 굳이 인스턴스 생성해 메모리 사용하지 말고 직접 클래스 접근해 메소드 사용 
		System.out.println(Calculator2.multiply(10, 30));
		System.out.println(Calculator2.multiply(40, 50));
		

	}

}
