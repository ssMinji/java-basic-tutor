package com.itbank.javatutorials.poly;

abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int _sum() {
		return this.left + this.right;
	}
	
	public int _avg() {
		return (this.left+this.right)/2;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalculatorKor extends Calculator{
	public void sum() {
		System.out.println("두 수의 합은: "+ _sum());
	}
	public void avg() {
		System.out.println("두 수의 평균은: "+ _avg());
	}
}

class CalculatorEng extends Calculator{
	public void sum() {
		System.out.println("Sum of two numbers: " + _sum());
	}
	public void avg() {
		System.out.println("Avg of two numbers: " + _avg());
	}
}

public class CalculatorDemo {
	// cal의 run을 호출하고 있음
	public static void execute(Calculator cal) {
		cal.run();
	}
	
	
	// 오버로딩의 불편함을 다형성이 해소 
	/*public static void execute(CalculatorKor cal) {
		cal.run();
	}
	
	public static void execute(CalculatorEng cal) {
		cal.run();
	}*/
	

	public static void main(String[] args) {
		Calculator c1 = new CalculatorKor();
		c1.setOprands(10, 20);
//		c1.run();
		
		Calculator c2 = new CalculatorEng();
		c2.setOprands(10, 20);
		//c2.run();
		// 같은 데이터타입을 가지고 있고, 동일한 run메소드를 실행하고 있지만
		// 클래스에 따라 동작하는 방법이 달라짐
		
		execute(c1);
		execute(c2);

	}

}
