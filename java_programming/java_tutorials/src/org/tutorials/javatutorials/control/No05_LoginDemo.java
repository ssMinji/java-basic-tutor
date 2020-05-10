package org.tutorials.javatutorials.control;

import java.util.Scanner;

public class No05_LoginDemo {

	public static void main(String[] args) {
        // id로 검증하는 시스템 만들기 
		/*String id = "Myname";
		if(id.equals("myname")){
		    System.out.println("right");
		} else {
		    System.out.println("wrong");
		}*/
        
        // id로 한번 검증한 뒤 password로 한 번 더 검증해야하는 시스템 만들기 
        // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
        Scanner scan = new Scanner(System.in);
        System.out.println("id, password 입력");
        
        String id = scan.next();
        int password = scan.nextInt();
        
        if (id.equals("myname")) { // 논리연산자 사용 -> 내이름 or 내짝꿍이름일때 pass 
            if (password == 111111) {
                System.out.println("welcome");
            } else {
                System.out.println("enter the right password");
            }
 
        } else {
            System.out.println("enter the right id");
        }
    }
}
