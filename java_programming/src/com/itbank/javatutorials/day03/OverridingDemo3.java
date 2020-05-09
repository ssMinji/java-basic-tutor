package com.itbank.javatutorials.day03;

class Calculator7{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int sum() {
		return (this.left + this.right);
	}
	
	public int avg() {
		return (this.left + this.right)/2;
	}
	
}

class OverrideCalc extends Calculator7{
	public void devision() {
		System.out.println(this.left / this.right);
	}
	
	@Override
	public int avg() {
		// 부모메소드에 정의되어있는 메소드를 호출
		return super.avg();
		//로직 추가 
	}
}
public class OverridingDemo3 {
	public static void main(String[] args) {
		/*
		 * Calculator7 클래스 생성
		 * left, right 변수 필요(int 데이터타입)
		 * left, right 변수 초기화해주는 메소드인 setOprands 메소드 필요
		 * 두 수의 합 구하는 메소드 작성(void 리턴타입)
		 * 두 수의 평균 구하는 메소드(int 리턴타입)
		 * 
		 * Calculator7 클래스 상속받는 OverrideCalc 클래스 생성
		 * 상속받은 두 변수 left, right 나눗셈 연산해주는 메소드(void리턴타입) 필요
		 * 평균 구하는 메소드 오버라이딩(단, 평균구하는 로직은 바꾸지않음)
		 * 
		 * */
		
		// super키워드 활용한 오버라이딩
		// super키워드 밑에 로직 추가하면 추가 기능 개발 가능
		
		// 오버라이딩의 규칙
		// 1. 메소드의 서명(Signature)가 동일해야한다.
		// ---> 1) 메소드의 이름 2) 메소드의 매개변수의 갯수, 데이터타입, 순서
		//      3) 메소드의 리턴타입 
		// 결론: 오버라이딩은 부모클래스가 가지고있는 기능을 필요에 따라서 변경하는 것 
		//      자식메소드가 부모메소드를 호출하기 위해서는  super키워드 사용한다.
		
	}
}
