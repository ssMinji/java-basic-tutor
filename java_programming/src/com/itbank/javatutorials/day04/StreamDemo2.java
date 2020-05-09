package com.itbank.javatutorials.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] b = new char[3];
//		reader.read(b);
//		
//		System.out.println(b);
		
		// 개선여지: 고정된 길이로만 스트림을 읽어야 함
		// 사용자가 엔터키를 입력할 때까지 입력을 전부 받아들이려면
		//BufferedReader
		// 객체 생성시 생성자의 입력값 필요 
		BufferedReader br = new BufferedReader(reader);
//		String a = br.readLine();
//		System.out.println(a);
		
		// 정리
		// 1. InputStream : byte
		// 2. InputStreamReader : character
		// 3. BufferedReader : String 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		
		// next : 단어 입력
		// nextInt: 정수
		
		//콘솔 출력
		System.out.println(); // 문자열출력 or 디버깅 
		System.err.println(); // 오류메시지 출력 -> 디버깅 시 사용 
	}
}
