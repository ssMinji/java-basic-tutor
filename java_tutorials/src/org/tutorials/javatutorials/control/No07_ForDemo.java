package org.tutorials.javatutorials.control;

public class No07_ForDemo {

	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		for(int i=0; i<numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		int[] marks = {90, 25, 67, 45, 80};
		// marks 주어졌을 때, 점수 검사해서 합불여부 판별하기  
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] >= 60) {
		        System.out.println((i+1)+"번 학생은 합격입니다.");
		    }else {
		        System.out.println((i+1)+"번 학생은 불합격입니다.");
		    }
		}
		
		// 0부터 10까지 1씩 증가하며 출력하지만, 3일때는 출력하지 않고, 4까지만 출력하기 
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            else if (i == 3)
            	continue;
            System.out.println("Coding Everybody " + i);
        }
		
		// 이중 for문
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " " + j);
            }
        }
		
		// 퀴즈: 구구단 만들어보기
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" "); // 개행문자 없이 출력. 따라서 같은 단은 같은줄에 출력 
		    }
		    System.out.println("");
		}
		
		// 심화: for each
		String[] numbers = {"one", "two", "three"};
		for(String number: numbers) {
		    System.out.println(number);
		}
		// 위 iterate는 루프를 돌릴 객체이고 iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문을 수행하게 된다. iterate부분에 들어가는 타입은 루프를 돌릴수 있는 형태인 배열 및 ArrayList등이 가능하다.
		// foreach문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.
		
	}

}
