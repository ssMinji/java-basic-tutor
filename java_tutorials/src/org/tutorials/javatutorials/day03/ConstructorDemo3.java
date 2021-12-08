package org.tutorials.javatutorials.day03;

class Calculator3 {
	int left, right;

	public Calculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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

class SubstractionableCalculator3 extends Calculator3 {
	public SubstractionableCalculator3(int left, int right) {
		super(left, right);
		// 자식클래스 초기화 코드 ... 
		
		// 주의사항
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo3 {

	public static void main(String[] args) {

		SubstractionableCalculator3 c1 = new SubstractionableCalculator3(10,  20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
