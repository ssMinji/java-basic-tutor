package org.tutorials.javatutorials.day03;

// class Calculator extends Object
// 모든 클래스들의 공통된 조상
// 아무것도 상속받지 않다면 암시적으로 Object클래스를 상속받게됨
// https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// 메소드 종류를 보면 눈에 익은 메소드들도 있고 아닌 것들도 있는데, 
// 결국 클래스를 생성하게 되면 이러한 메소드들을 상속받아 쓸수있다는 의미 
class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class AddSubstractCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class AddMultiplyCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

class AddDivisionCalculator extends AddMultiplyCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

// 계산기의 기능과, substract기능을 할 수 있으면서도 left값을 right값으로 나눈 나머지를구하는 있는 클래스 만들어보기 
class AddRemainderCalculator extends AddSubstractCalculator{
	public void remainder() {
		System.out.println(this.left % this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.setOprands(10,  20);
//		c1.sum();
//		c1.avg();
//		c1.substract();

		AddSubstractCalculator c1 = new AddSubstractCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        
        AddMultiplyCalculator c2 = new AddMultiplyCalculator();
        c2.setOprands(10, 20);
        c2.sum();
        c2.avg();
        c2.multiplication();
        
        AddDivisionCalculator c3 = new AddDivisionCalculator();
        c3.setOprands(10, 20);
        c3.sum();
        c3.avg();
        // c3.substract();
        c3.multiplication();
        c3.division();
	}

}
