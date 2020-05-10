package org.tutorials.javatutorials.control;

import java.util.Scanner;

public class No08_WhileDemo {

	public static void main(String[] args) {
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
		    if (treeHit == 10) {
		        System.out.println("나무 넘어갑니다.");
		    }
		}
		
		// 무한루프
		while (true) {
		    System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
		}
		
		// break
		int coffee = 10;
		int money = 300;

		while (money > 0) {
		    System.out.println("돈을 받았으니 커피를 줍니다.");
		    coffee--;
		    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
		    if (coffee == 0) {
		        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
		        break;
		    }
		}
		
		// while문의 제일 처음으로 돌아가기
		int a = 0;
		while (a < 10) {
		    a++;
		    if (a % 2 == 0) {
		        continue;
		    }
		    System.out.println(a); // 짝수일경우 실행안됨 
		}
		
		// do-while 무조건 한번은 실행 
		int value = 0;

        // Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
        Scanner scan = new Scanner(System.in);
        //위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다. 

        do{
            value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
            System.out.println("입력받은 수 : " + value);  
        }while(value != 10);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

        System.out.println("반복문 종료");
	}

}
