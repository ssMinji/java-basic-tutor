package org.tutorials.javatutorials.api;

// String 주요 메소드 실습
public class StringAPIDemo {

	public static void main(String[] args) {
		
		// 1) charAt : 해당 인덱스의 문자 반환
		char c = "hello".charAt(1);
		System.out.println(c); // e

		// 2) endsWith: 해당 suffix로 끝나는지 여부 검사
		boolean e = "hello".endsWith("lo");
		System.out.println(e); // true
		
		// 3) equals: 동일한 문자열인지 비교
		boolean isEqual = "hello".equals("Hello");
		System.out.println(isEqual); // false
		
		// 4) format: 문자 포맷 조정
		// %s: 문자열 의미 
		String s = String.format("%s says hello to %s", "Jack", "Rachel");
		System.out.println(s);
		
		// 5) indexOf: 해당 문자열이 포함되어있으면 해당위치 반환, 없으면 -1반환
		int i = "hello".indexOf("e");
		System.out.println(i); // 1
		System.out.println("hello".indexOf("k")); // -1
		
		// 정규식
		// 6) matches: 정규표현식이 해당하는 문자열이면 true반환
		String reg = "^[0-9]*A$"; // A로 끝나는 숫자를 가리키는 정규식
		boolean matches = "0123A".matches(reg);
		System.out.println(matches);// true
		
		// 7) replace: 해당 문자열 찾아서 교체
		String r = "hello".replace("ello", "i");
		System.out.println(r); //hi
		
		// 8) split: 문자열을 분리. 구분자 매개변수로 넣어줌
		// 문자열 배열로 리턴됨 
		String[] sp = "he:ll:0".split(":");
		for(String item: sp) {
			System.out.println(item);
		}
		
		// 9) subString: 시작점부터 끝지점까지의 문자열 반환
		// 끝지점 포함 안됨
		String sub = "hello".substring(0, 4);
		System.out.println(sub);
		
		// 10) trim: 문자열 양끝에 포함되어있는 공백 제거
		String tr = " hello   ".trim();
		System.out.println(tr);
		
		
		
		
	}

}
