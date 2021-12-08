package org.tutorials.javatutorials.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//자바의 내장클래스 중 InputStream 클래스 내 System.in을 이용하면 콘솔 입력을 얻을 수 있다.
//java.lang 패키지에 속해 있지 않은 클래스는 항상 import해서 사용해야 한다. 
//System이나 String 등의 클래스는 java.lang 패키지에 속해있는 클래스이므로 import 필요없었다. 

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		// System.in은 InputStream의 객체임을 알 수 있다. 
		InputStream in = System.in;

        int a;
        a = in.read(); // read메소드는 1byte의 사용자의 입력을 받아들인다. 
        
        // 이 때, read메소드로 읽은 1byte의 데이터는 byte 자료형으로 저장되는 것이 아니라 int 자료형으로 저장됨 
        // 저장되는 int 값은 0-255 사이의 정수값으로 아스키코드값이다 
        // 미국표준기구에서 정한 문자를 표현하는 기구 
        // 컴퓨터의 언어는 결국 숫자이기 때문에 컴퓨터에서 문자와 기호가 해당 숫자 표현으로 변환되어야 하는 필요. 
        // 즉, 숫자로 문자를 표현하기 위한 일종의 약속
        // 0-9, a-z, A-Z, 특수문자
        // 0이라는 숫자에 해당되는 아스키코드값은 48, a라는 문자에 해당되는 아스키코드값은 97이다.
        

        System.out.println(a);	
        // 프로그램 종료되지 않고 사용자의 입력 대기 
        //  입력 후 엔터쳐야 프로그램 종료 
        
        // a 입력하면 97, abc입력해도 97
        // 이유는 read메소드는 1 byte만 읽기 때문
        // 따라서 3byte의 데이터를 전달했지만 프로그램에서 1byte만 읽은 것. 
        
        // 결론
        // 이처럼 사용자가 전달한 1byte 또는 3byte의 데이터를 입력 스트림이라 함 
        // 스트림은 이어져있는 데이터(byte)의 형태라고 이해하면 됨 
        // Stream - 수도꼭지라고 생각하자  즉, 물의 흐름처럼 데이터를 받아와 흘려주는것
//        파일 데이터 (파일은 그 시작과 끝이 있는 데이터의 스트림이다.)
//        HTTP 응답 데이터 (브라우저가 요청하고 서버가 응답하는 HTTP 응답 데이터도 스트림이다.)
//        키보드 입력 (사용자가 키보드로 입력하는 문자열은 스트림이다.)
        
        
        // 3byte읽는 법 
        int x;
        int y;
        int z;

        x = in.read();
        y = in.read();
        z = in.read();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 개선된 방법 -> 길이가 3인 바이트배열만드는 것 

        byte[] d = new byte[3];
        in.read(d);
        
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        
        // for문으로 만들어보기 
        for (byte k : d) {
        	System.out.println(k);
        }
        
        // 하지만 이렇게 아스키코드로 해석해야 하는 방식은 불편하다
        // 입력값을 그대로 출력해볼 수는 없을까?
        // 바이트 대신 문자로 입력 스트림을 읽으려면 InputStreamReader를 사용
        
        // InputStreamReader객체 생성할때는 생성자의 입력 필요 
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
        // abc (입력)
        // abc (출력)
        
        // 현재도 불편한점: 고정된 길이로만 스트림을 읽어야 한다는 점 
        // 사용자가 엔터키를 입력할 때까지 사용자의 입력 전부 받아들이려면?
        // BufferedReader 
        // 역시 객체 생성시 생성자의 입력값 필요 
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
//        HelloWorld (입력)
//        HelloWorld (출력)
        
        // 정리
//        InputStream - byte
//        InputStreamReader - character
//        BufferedReader - String

        // 이보다 더 콘솔입력 쉽게 처리하는 법?
        // Scanner 
        // 생성자의 입력으로 System.in 즉 콘솔입력인 InputStream 필요로함
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        
//        next - 단어
//        nextLine - 라인
//        nextInt - 정수
        
        // 마지막으로 콘솔출력?
        System.out.println();
        // 아까도 봤듯이 System.out은 PrintStream의 객체이다. 
        // 개발에서의 역할: 문자열 출력 or 디버깅
        System.err.println();// 오류메시지 출력 
        
       
	}

}
