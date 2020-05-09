package com.itbank.javatutorials.eclipse;

public class IfDemo {
	public static int conditionTest(int value) {
		// value값이 선언되어 있다고 가정 
		int ret = 0;
		if (value % 3 == 0) { 
			if (value % 6 == 0) {
				ret = 3;
			} else {
				ret = 5;
			}
		} else {
			ret = -1;
		}
		// 조건문을 추가해 value가 4의 배수이면 ret에 4를 저장하는 코드 추가
		// 이외에는 모두 ret = -1;
		
		//결과 반환
		return ret;
	}
	

	public static void main(String[] args) {
		System.out.println(conditionTest(6)); //3
		System.out.println(conditionTest(5)); // -1
		
		int score = 89;
		char grade = 'F'; // char: 문자
		
		/*		if (score >= 90) {
					grade = 'A';
				} else if (score >= 80){
					grade = 'B';
				} else if (score >= 70 ) {
					grade = 'C';
				} else {
					grade = 'F';
				}
				System.out.println("grade: "+grade);*/
		
		if (score >= 70) {
			grade = 'C';
		} else if (score >= 80){
			grade = 'B';
		} else if (score >= 90 ) {
			grade = 'A';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		
		boolean isSuccess = false;
		int x = 3;
		
		// x>1 : true --> !(x>1): false -- if(false){//todo}
		if(!(x > 1)) {
			System.out.println("true");
		} else {
			System.out.println("x>1");
		}
		
		// false && true -- false 
		if (isSuccess && (x>1)) {
			System.out.println("isSuccess && (x>1)");
		} else {
			System.out.println("true");
		}
		
		// false || true -- true
		if (isSuccess || (x>1)) {
			System.out.println("isSuccess || (x>1)");
		} else {
			System.out.println("true");
		}
		
		
		
		

	}

}
