package com.itbank.javatutorials.day03;

// 상속 : 물려준다는 의미
// 어떤 객체가 있을 때 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능

// class Calculator (extends Object)
// Object: 모든 클래스의 공통된 조상 
// 아무것도 상속받지 않고 있다면 암묵적으로 Object클래스를 상속받게됨.
// https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// 따라서 Object클래스의 메소드들을 상속받아서 쓸 수 있다는 의미 
class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("현재 합은?"+this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

// class 자식클래스  extends 부모클래스 {}
class AddSubstractCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

// Calculator를 상속받는 곱셈 클래스 
class AddMultiplyCalculator extends Calculator{
	public void multiply() {
		System.out.println(this.left*this.right);
	}
}

// setOprands(), sum(), avg(), substract() 메소드 상속받게됨
class AddDevisionCalculator extends AddSubstractCalculator{
	public void devision() {
		System.out.println(this.left / this.right);
	}
}

// 계산기의 기본기능과, multiply기능을 할 수 있으면서,
// left값을  right값으로 나눴을때의 나머지출력 가능한 기능 가진 클래스 구현 
// 나머지: remainder
class AddRemainderCalculator extends AddMultiplyCalculator{
	public void remainder() {
		System.out.println(this.left % this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
//		c1.substract(); // -10
		
		AddSubstractCalculator c2 = new AddSubstractCalculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();
		
		AddMultiplyCalculator c3 = new AddMultiplyCalculator();
		c3.setOprands(3, 4);
		c3.multiply(); // 12
		
		AddDevisionCalculator c4 = new AddDevisionCalculator();
		c4.setOprands(10, 20);
		// Calculator에서 상속
		c4.sum();
		c4.avg();
		// AddSubstractCalculator에서 상속
		c4.substract();
		// 기능 추가
		c4.devision();
		
		AddRemainderCalculator c5 = new AddRemainderCalculator();
		c5.setOprands(7, 11);
		c5.sum();
		c5.avg();
		c5.multiply();
		c5.remainder();
		// c5.substract(); 불가능 
		
		// 결론
		// 끊임없이 상속관계를 이어나갈 수 있겠죠. 
		
		// 상속의 효용 
		// 1. 중복의 제거 : 부모가 가지고 있는 기능을 자식이 또 만들 필요가 없음.
		// 2. 코드의 재활용성 증대 
		// 3. 유지보수의 편의성 증대 
		//    : 부모클래스를 개선하게 되면, 이를 상속받고 있는 모든 자식 클래스에게 혜택이 자동으로 돌아간다
		// 4. 가독성 증가 : 클래스가 가지고 있는 주요 기능을 제외한 나머지코드는 부모에게 존재. 
		

	}

}
