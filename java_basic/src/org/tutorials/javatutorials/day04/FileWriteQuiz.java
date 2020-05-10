package org.tutorials.javatutorials.day04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Write 실습
		 * 학생의 이름, 키가 담긴 배열이 주어졌을 때 다음의 파일을 생성하시오 
		 * 결측치 없음 
		 * 
		 * */
		String[] names = {"Jack", "Rachel", "Tom", "Anna", "Jenny"};
		int[] heights = {170, 155, 180, 185, 160};
		
		PrintWriter pw = new PrintWriter("C:\\Users\\User\\Desktop\\Docs\\class.txt");
		
		pw.println("이름 키");
		for (int i=0; i<names.length; i++) {
			String line = names[i] + " " +  heights[i];
			pw.println(line);
			
		}
		pw.close();

	}

}
