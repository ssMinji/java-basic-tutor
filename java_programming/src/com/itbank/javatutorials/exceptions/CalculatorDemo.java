package com.itbank.javatutorials.exceptions;

// Exception: 예외 
class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 에러: java.lang.ArithmeticException: / by zero
	public void divide() {
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다");
		} catch(Exception e) { // 매개변수로 에러에 대한 정보를 담고있는 객체 전달 
			// 데이터타입은 Exception이라는 클래스
			System.out.println("오류 발생!! " + e.getMessage());
			System.out.println("e.toString: " + e.toString());
			System.out.println("e.printStackTrace()");
			e.printStackTrace();
			
			/* 1. e.getMessage() : / by zero
			 * 2. e.toString() : java.lang.ArithmeticException: / by zero
			 * 3. e.printStackTrace(): java.lang.ArithmeticException: / by zero
	at 									com.itbank.javatutorials.exceptions.Calculator.divide(CalculatorDemo.java:15)
at 										com.itbank.javatutorials.exceptions.CalculatorDemo.main(CalculatorDemo.java:33)
				1. 오류에 관한 기본적인 내용을 출력해줌. 상세하지 않음
				2. 예외상황에 대한 좀 더 자세한 정보. ArithmeticException: 수학적인 계산 과정에서 발생하는 예외
				3. 리턴값이 없음. 가장 자세한 예외 정보 제공
			 */
		}
		
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();

	}

}
