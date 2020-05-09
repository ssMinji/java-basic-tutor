package com.itbank.javatutorials.eclipse;

import java.util.Scanner;

// id와 password 검증하는 시스템 만들기 
public class LoginDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id, password를 입력하세요");
		
		String id = scan.next();
		int password = scan.nextInt();
		/*System.out.println("id: "+id);
		System.out.println("password: "+password);*/
		
		// id = "Eclipse", password = 0000이여야만 로그인 가능한 시스템 작성
		// 둘 다 맞아야 로그인("welcome!")
		// id 틀리면 "enter the right id" 
		// password 틀리면 "enter the right password"
		if(id.equals("Eclipse")) {
			if(password == 0000) {
				System.out.println("welcome!");
			} else {
				System.out.println("enter the right password");
			}
		}else {
			System.out.println("enter the right id");
		}
		
		

	}

}
