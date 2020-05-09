package com.itbank.javatutorials.day04;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 파일을 이용한 입출력 방법 
public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\KGITBANK\\Desktop\\docs\\test.txt");
		//output.close();
		
		// 새로운 파일 생성됨
		// 객체 생성시 생성자의 입력으로 파일명 넘겨줘야 함
		// output.close() -> 사용한 파일 객체를 닫아주는 역할 
		// 생략가능. 자바프로그램이 종료될 때 사용한 파일 객체를 자동으로 닫아주기 때문
		// 직접 사용한 파일에 대한 작업이 끝났을 때 개발자가 close이용해 닫아주는 것이 좋다
		// 객체를 닫아주지 않고 다시 사용하려 하는 경우, 에러 발생 
		
		for (int i=1; i<=10; i++) {
			String data = i + "번째 줄입니다.\r\n";
			output.write(data.getBytes());
		}
		output.close();
		
		// \r\n은 줄바꿈 문자
		// FileOutputStream : byte단위로 데이터를 처리하는 크래스 
		// String을 byte배열로 바꿔주는 getBytes() 메소드 사용해야 함 
		
		// byte로 변환해야 하는 점 개선
		FileWriter fw = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test2.txt");
		
		for (int i=1; i<=10; i++) {
			String data = i + "번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
		
		// \r\n해야하는 불편함 개선
		PrintWriter pw = new PrintWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt");
		for(int i=1; i<=10; i++) {
			String data = i + "번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		
		// 파일에 내용 추가하기 
		FileWriter fw2 = new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt", true);
		for (int i=11; i<=20; i++) {
			String data = i + "번째 줄입니다\r\n";
			fw2.write(data);
		}
		fw2.close();
		// 작성된 파일을 추가모드로 열때는 boolean 파라미터를 true로 지정
		// 기존 파일의 내용 이후부터 파일이 작성됨 
		
		// 다른 방법
		// PrintWritedr의 생성자의 입력: 파일명 대신 추가모드로 열린 FileWriter객체를 사용
		PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\KGITBANK\\Desktop\\docs\\test3.txt", true));
		for (int i=21; i<=30; i++) {
			String data = i + "번째 줄입니다";
			pw2.println(data);
		}
		pw2.close();

	}

}
