package org.tutorials.javatutorials.api;

// String과 StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "world";
		System.out.println(temp);
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // append: 문자열을 내부 데이터에 추가 
		sb.append(" ");
		sb.append("world");
		System.out.println(sb);
		
		// String을 사용한 문자열 추가연산과 StringBuffer를 사용한 문자열 추가 연산 비교
		// 결론: 시스템자원의 효율성 측면에서 StringBuffer가 유리 
		
		// String 객체는 변경이 불가능한(Immutable)한 객체임. 즉, 문자열의 값 변경 불가능하고
		// 변경해야 할 경우 새롭게 String객체 생성됨 
		// 즉, += 은 기존 String객체에 새로운 문자열이 붙는 것이 아니라 새로운 String 객체가 생성되는 것
		
		// 반면 StringBuffer는 변경가능한 객체(Mutable)한 객체. 
		// 즉, 값의 변경이 필요한 경우 새로운 객체 만들 필요 없이 내부의 문자열 변경할 ㅜ 있다. 
		// 따라서 append실행될 때 새로운 StringBuffer 객체 만드는 것이 아니고 
		// 기존 StringBuffer객체가 append된 문자열을 가리키도록 변경됨 
		// 비슷한 클래스로 StringBuilder도 있는데, StringBuilder와 StringBuffer의 차이는
		// StringBuffer의 append함수가 동기화를 지원한다는 것. 
		// 이 부분은 동기화라는 것의 내용을 알아야하므로 스킵
		// 포인트는 String에서의 + 연산은 가급적 StringBuffer나 StringBuilder를 사용하는 것이 낫다는 것.
		// 몇 개안되는 + 연산은 상관없지만 예를 들면 반복문 내의 +연산은 좋지 않음 
		

	}

}
