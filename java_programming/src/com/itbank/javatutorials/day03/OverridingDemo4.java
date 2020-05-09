package com.itbank.javatutorials.day03;

class OverrideCalc2 extends Calculator7 {
	@Override
	public int avg() {
		int a = super.avg();
		int b = super.sum();
		return a + b;
	}
}

public class OverridingDemo4 {

	public static void main(String[] args) {
		/*
		 * OverridingDemo3파일에 정의된 Calculator7클래스 가져다 쓸 것. 
		 * 
		 * Calculator7클래스 상속받는 OverrideCalc2 클래스 생성
		 * avg()메소드 오버라이딩
		 * (두 수의 평균 + 두 수의 합) 리턴 
		 * super키워드 사용 
		 * 
		 * */

	}

}
