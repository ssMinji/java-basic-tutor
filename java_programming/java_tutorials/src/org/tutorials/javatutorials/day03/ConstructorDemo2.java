package org.tutorials.javatutorials.day03;

class Calculator2 {
	int left, right;

	// 기본 생성자 정의
//	public Calculator2() {}
//	
//	public Calculator2(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
	
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

class SubstractionableCalculator2 extends Calculator2 {
	public SubstractionableCalculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10,  20);
		c1.sum();
		c1.avg();
		c1.substract();
				
		
	}

}
