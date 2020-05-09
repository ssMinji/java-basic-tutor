package com.itbank.javatutorials.eclipse;

public class Strings {

	public static void main(java.lang.String[] args) {
		String str1 = "Hello Java";
		String str2 = "123";
		
		System.out.println(str1 + " "+ str2);
		
		//new : 새로운 객체 만들때 사용 
		// 객체: 새로 생성된 자료형... 
		String str3 = new String("Hello world");
		String str4 = new String("Hello world");
		
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true
		
		String a = "Hello Java";
		// indexOf: 문자열에서 특정 문자가 시작되는 인덱스 리턴 
		System.out.println(a.indexOf("Java")); // 6
		System.out.println(a.replaceAll("Java", "world"));
		// 첫지점<= <끝지점
		System.out.println(a.substring(0, 4)); //Hell
		System.out.println(a.toUpperCase()); 
		System.out.println(a.toLowerCase());
		

	}

}
