package com.itbank.javatutorials.eclipse;

public class Conversion {

	public static void main(Strings[] args) {
		double a = 3.0f;
		//float b = 3.0; 
		//  double형을 표현 범위가 더 좁은 float에 넣으려고하기 때문
		// 자동형변환: 표현범위가 좁은 데이터 타입에서 넓은 데이터타입으로 넣을때만 가능 

		// 명시적 형변환
		float c = (float) 4.0009;
		int d = (int) 100.0F;
		
		// 해보기
		long longVal = 10;
		// int형 변수  intVal을 선언하고 longVal에 들어있는 값 할당
		int intVal = (int) longVal;
		
		System.out.println(intVal);
		
		final int BASE = 10;
		
		
	}

}
