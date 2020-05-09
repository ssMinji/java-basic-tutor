package com.itbank.javatutorials.day03;

// 오버라이딩 위한 제약사항
class Calculator6 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("현재 합은?"+(this.left + this.right));
	}
	
	public int avg() {
		return (this.left + this.right)/2;
	}
}

class SubstractCalc extends Calculator6{
	@Override
	public int avg() {
		return (this.left+this.right)/4;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
}
public class OverridingDemo2 {

	public static void main(String[] args) {
		SubstractCalc c = new SubstractCalc();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		
		// The return type is incompatible with Calculator6.avg()
		// 자식클래스의 avg메소드의 리턴타입이 부모클래스의 avg메소드의 리턴타입과 호환되지 않는다.
		// 따라서 오버라이딩을 할 때, 리턴타입이 달라지는 것 불가능 
	}

}
