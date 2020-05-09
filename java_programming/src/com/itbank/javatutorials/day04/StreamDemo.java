package com.itbank.javatutorials.day04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		// System.in이 InputStream 객체임
		InputStream in = System.in;
		int a;
		a = in.read();
		// read 메소드는 1byte의 사용자의 입력을 받아들임
		
		// 이 메소드로 읽은 1byte의 데이터는 byte자료형으로 저장되는 것이 아닌 int자료형으로 저장됨
		// 저장되는 int값은 0-255 사이의 정수값으로 아스키코드값
		// 아스키코드? 미국표준기구에서 정한 문자를 표현하는 수단
		// 컴퓨터의 언어는 결국 숫자이기 때문에 컴퓨터에서 문자와 기호가 해당 숫자표현으로 변환되어야 하는 필요
		// 즉, 문자를 숫자로 표현하기 위한 약속 
		// 0-9, a-z, A-Z, 특수문자 
		// a -> 97
		
		//System.out.println(a);
		// 실행 시 프로그램 종료되지 않고 사용자의 입력 대기 
		
		// a-> 97, abc -> 97
		// 이유: read메소드가 1byte만 읽기 때문
		
		// 사용자가 전달하는 데이터를 입력 스트림이라 함
		// 스트림(Stream)은 이어져있는 데이터(byte)의 형태
		// Stream - 수도꼭지 물의 흐름처럼 데이터를 받아와 흘려주는것
		// 1. 파일데이터 (파일에는 시작과 끝이 있는 데이터의 스트림)
		// 2. HTTP 응답 데이터(브라우저가 요청하고 서버가 응답하는 HTTP응답데이터 스트림)
		// 3. 키보드 입력(사용자가 키보드로 입력하는 문자열 스트림)
		
		// 3byte읽는 법
		int x;
		int y;
		int z;
		
		x = in.read();
		y = in.read();
		z = in.read();
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		// 개선 
		byte[] d = new byte[3];
		in.read(d);
		
//		System.out.println(d[0]);
//		System.out.println(d[1]);
//		System.out.println(d[2]);
		
		// 출력문 for문으로 작성해보기 
		// for-each문 
//		for(byte k: d) {
//			System.out.println(k);
//		}
		
		// 아스키코드로 해석해야 하는 방식 -> 불편
		// 입력값을 그대로 출력하고 싶다면
		// 바이트 대신에 문자로 입력 스트림을 읽는다 -> InputStreamReader 
		
		// 객체 생성할때는 생성자의 입력이 필요
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] b = new char[3];
		reader.read(b);
		
		System.out.println(b);
		
		
		

	}

}
