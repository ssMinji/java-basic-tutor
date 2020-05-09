package com.itbank.javatutorials.abstracts;

abstract class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	// 상황에 따라 달라질 수 있는 부분 -> 메소드 사용자에게 구현 위임할 부분
	public abstract void sum();
	public abstract void avg();
	
	// default 제어자
	// 같은 패키지 안에서만 사용할 수 있는 접근제어자 
	int _sum() {
		return this.left + this.right;
	}
	
	int _avg() {
		return (this.left + this.right)/2;
	}
	
	// 공통적인 부분 
	public void run() {
		sum();
		avg();
	}
	
}

class CalculatorKor extends Calculator{
	public void sum() {
		System.out.println("두 수의 합은: " + _sum());
	}
	public void avg() {
		System.out.println("두 수의 평균은 : "+ _avg());
	}
}

class CalculatorEng extends Calculator{
	public void sum() {
		System.out.println("Sum of two numbers: "+ _sum());
		
	}
	public void avg() {
		System.out.println("Average of two numbers: " + _avg());
	}
}


public class AbstractCalculator {

	public static void main(String[] args) {
		CalculatorKor c1 = new CalculatorKor();
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorEng c2 = new CalculatorEng();
		c2.setOprands(10, 20);
		c2.run();
		
		// 정리 
		// 추상클래스에서 공통적으로 사용되는 로직을 구현하고 그것을 상속받는 자식클래스에서
		// 용도에 따라서 달라지는 구현을 사용자가 직접하도록 하는 것이 추상클래스의 용도

	}

}
