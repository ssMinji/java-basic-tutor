package org.tutorials.javatutorials.day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadQuiz {
	public static void main(String[] args) throws IOException {
		/*
		 * Congress 파일 읽어서
		 * 이름 (공백) 당선지역 으로 작성 후 
		 * Congress_edit.txt 으로 저장 
		 * */
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Docs\\Congress.txt"));
		PrintWriter pw = new PrintWriter("C:\\Users\\User\\Desktop\\Docs\\Congress_edit.txt");
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            String name = line.substring(0, 3);
            String address = line.substring(3);
            System.out.println(name + " " + address);
            pw.println(name + " " + address);
        }
        br.close();
        pw.close();
        
	}

}
