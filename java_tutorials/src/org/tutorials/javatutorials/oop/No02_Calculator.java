package org.tutorials.javatutorials.oop;

// 메소드 설명 
class Calculator{
	int a, b;
	
	// Quiz 
	// a, b값 설정하는 함수 만들어보기 
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 1. 평범한 메서드 
	public int sum(int num1, int num2) { // 리턴자료형 명시 
		return num1+num2;
	}
	
	// 2. 입력값 없는 메소드
	public int avg() {
		//return (this.a + this.b) / 2;
		return a+b;
	}
	
	// 3. return 값 없는 메소드
	public void sum2(int num1, int num2) { // 리턴자료형 명시 
		System.out.println(num1+"과 "+num2+"의 합은 "+(num1+num2)+"입니다.");
	}
	
	// 4. void에서의 return 사용
	// return 문만을 이용해 메서드 빠져나가는 방법은 void에서만 가능 
	public void matchVersion(String version) {
		if ("V1".equals(version)) {
			return;
		}
		System.out.println("현재 버전은 " + version + " 입니다.");
	}
	
}
public class No02_Calculator {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		Calculator calc = new Calculator();
		// 1
		System.out.println(calc.sum(a, b));
		
		// 2
		int c = calc.avg();
		System.out.println(c);
		
		// 3
		calc.sum2(3,  4);
		
		// 4
		calc.matchVersion("V1"); // 출력하지않고 메서드 즉시 빠져나옴 
		calc.matchVersion("V2");
		
	}

}
