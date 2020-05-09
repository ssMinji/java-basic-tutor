package com.itbank.javatutorials.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws IOException {

		/*
		 * 파일 생성 실습
		 * 학생의 이름, 키가 담긴 배열이 주어졌을 때 다음의 파일을 생성하시오.
		 * docs디렉터리 내 class.txt로 생성
		 * 
		 * 학생의 수는 알 수 없다고 가정. 단, 이름과 키의 결측치는 없고 제대로 일대일매칭이 되어있음
		 * 
		 * 
		 * */
		String[] names = {"Jack", "Rachel","Tom", "Anna", "Jenny"};
		int[] heights = {170, 155, 180, 185, 160};
		
		PrintWriter pw = new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\class.txt");
		
		pw.println("이름 키");
		
		for(int i=0; i<names.length; i++) {
			String student = names[i] + " " + heights[i];
			pw.println(student);
		}
		pw.close();
		
		
	}

}
