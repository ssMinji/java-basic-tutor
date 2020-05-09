package com.itbank.javatutorials.day03;

// Overriding(오버라이딩) : 메소드 재정의
// 부모가 물려준 메소드 중에서 자식클래스에서 그 기능을 덮어쓰기함으로써
// 자식클래스의 독자적인 메소드를 정의해야하는 경우 
// cf) 상속된 메소드와의 차이점: 상속-> 그냥 가져다쓴다. 거기에 기능을 추가한다

class Calculator5 {
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

class SubstractClass extends Calculator5{
	@Override // 어노테이션
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SubstractClass c1 = new SubstractClass();
		c1.setOprands(10, 20);
		c1.sum();
		
		// 오버라이딩
		// 메소드를 오버라이딩해주고, 이 메소드를 호출하게 되면
		// 부모클래스에 있는 메소드는 무시가 되고 자식클래스가 가지고있는 메소드가 실행됨.
		// 부모클래스의 메소드보다 높은 우선순위를 설정한다

	}

}
