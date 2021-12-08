package org.tutorials.javatutorials.day04;

import java.io.FileOutputStream;
import java.io.IOException;

// 파일을 이용한 입출력 방법 
public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
		output.close();
		// 실행해보면 새로운 파일 생성됨 
		// 생성자의 입력으로 파일명 넘겨주어야 함 
		// output.close(); -> 사용한 파일 객체를 닫아주는 것. 
		// 사실 이것은 생략해도 되는데, 자바프로그램이 종료할때 사용한 파일 객체를 자동으로 닫아주기 때문
		// 하지만 직접 사용한 파일을 닫아주는 것이 좋다. 
		// 이유는 닫지 않고 다시 사용하려고 할 경우에는 에러 발생 가능 


		FileOutputStream output = new FileOutputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			output.write(data.getBytes());
		}
		output.close();

		// OutputStream도 역시 바이트 단위로 데이터 처리하는 클래스. 
		// FileOutputStream은 OutputStream상속받아 만든 클래스인데 역시 바이트 단위로 데이터 처리
		// 따라서 String을 byte배열로 바꿔주는 getBytes() 메소드 사용
		//\r\n은 줄바꿈문자 
		// 윈도우즈의 경우 \r\n 처럼 \r 문자를 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시되어 보인다.)

		// 바이트 배열로 변환해야 하는 점 개선
		FileWriter fw = new FileWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();

		// FileWriter 이용하면 문자열 직접 파일에 쓸수 있음 

		// \r\n해야하는 불편함 개선 
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		// println 메소드 사용 

		// 위의 for문과 비교 
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.";
			System.out.println(data);
		}
		// 첫번재 방법은 콘솔대신에 파일로 출력하는 방법인 것 

		// 파일에 내용 추가하기 
		// 이미 작성된 파일을 다시 추가모드로 열어야 함 
		FileWriter fw = new FileWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();

		FileWriter fw2 = new FileWriter("c:/out.txt", true);
		for(int i=11; i<21; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw2.write(data);
		}
		fw2.close();
		// 두번째 입력값 true 추가로 입력되어 생성됨 
		// boolean 입력 파라미터는 추가모드(apppend)로 열것인지에 대한 구분값 
		// true로 명시하면, 기존 파일의 내용 이후부터 파일이 쓰여지게 됨

		// 다른 방법 
		PrintWriter pw = new PrintWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();

		// PrintWriter의 생성자의 입력으로 파일명대신 추가모드로 열린 FileWrited의 객체 사용하면 됨 
		PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
		for(int i=11; i<21; i++) {
			String data = i+" 번째 줄입니다.";
			pw2.println(data);
		}
		pw2.close();

	}

}
