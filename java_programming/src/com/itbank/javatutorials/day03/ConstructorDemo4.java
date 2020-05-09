package com.itbank.javatutorials.day03;

class Calculator4 {
	int left, right;
	
	public Calculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("현재 합은?"+(this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class AddSubstractCalculator4 extends Calculator4{
	public AddSubstractCalculator4(int left, int right) {
		// super: 부모클래스 의미 
		// super(left, right): 부모클래스의 생성자에게 left, right값을 전달
		// 부모클래스의 생성자를 자식클래스의 생성자에서 호출해서 실행시키고 있다
		super(left, right);
		// 자식클래스 초기화코드...
		
		// 주의사항
		// 자식클래스의 초기화코드가 super구문보다 먼저 등장해서는 안된다. 
		// 이유: 자식클래스가 인스턴스화된다라는 말은 즉, 부모클래스가 미리 인스턴스화된 이후에
		//      자식클래스가 인스턴스화된다는 의미이기 때문에 부모클래스를 먼저 초기화시켜줘야함
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
