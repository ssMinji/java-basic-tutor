package org.tutorials.javatutorials.datatype;

public class No02_Conversion {

	public static void main(String[] args) {
		double a = 3.0F;
		float a = 3.0; // 에러 : double형을 표현범위가 좁은 float에 넣으려고하기 때문 
		// 원칙: 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용 
		
		// 명시적 형변환
		float b = (float) 100.0;
		int c = (int) 100.0F;
		
		// 상수
		final double PI = 3.14;
		System.out.println(PI * 2);
		
		// Quiz
		long longValue = 20;
        //이 아래줄에 int형 변수 intValue를 선언하고 longValue에 들어있는 값을 담아보세요.
        // 정답: int intValue = (int)longValue;
        
        System.out.println(intValue);

	}

}
