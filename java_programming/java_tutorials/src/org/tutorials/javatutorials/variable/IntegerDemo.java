package org.tutorials.javatutorials.variable;


// 1. 변수
// 2. 주석
// 3. main 메소드 
public class IntegerDemo {
	// 사용자가 직접 자료형 만들 수 있음 
	// 클래스 직접 생성 
	class Animal {
		
	}

	public static void main(String[] args) {
		// 변수의 이름은 마음대로 지을 수 있다. 
		// 단, 변수명은 지켜야 할 몇가지 규칙이 있다. 
		// 숫자로 시작할 수 없다. _와 $이외의 특수문자는 사용할 수 없다
		// 자바 키워드는 변수명으로 사용할 수 없다(ex) public, static, void)
		int a; // int:데이터 형식  a:변수 이름 변수선언구문
		String b;
		Animal dog;
		// 의미: dog라는 변수는 Animal자료형 변수. Animal 자료형에 해당하는 값만 담을 수 있음 
		
		
		a = 1; // 변수 할당 
		b = "hello";
		System.out.println(a+1); 
		System.out.println(b);
		
		int one; 
//		one = "hello";
		one = 1;
		
		String ex;
		ex = "hi";
		String ex1 = "hi";

		
	
	}

}
// 블록을 닫은 것으로 의미가 있기 때문에 세미콜론 불필요. 
// 하지만 라인이 끝났음을 명시하기위해서는 세미콜론 필요 
