package org.tutorials.javatutorials.day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

// 파일 읽기 
public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\test.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();

        // FileInputStream 클래스 이용 
        // byte 배열을 이용하여 파일을 읽어야 하기 때문에 읽어야 하는 정확한 길이를 모를 경우에는 좀 불편한 방법
        
        // 파일을 라인 단위로 읽기 
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Workplace\\src\\org\\tutorials\\javatutorials\\day04\\Practice.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
        }
        br.close();
        // BufferedReader의 readLine 메소드는 더이상 읽을 라인이 없을 경우 null 리턴 
        // 위에서의 while문은 무한 반복이지만 
        // 따라서 더이상읽을 라인 없는 경우 while 문 빠져나감 
        
        
	}	

}
