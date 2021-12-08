package control;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {

		// Scanner: 키보드로부터 값을 입력받을 때 유용하게 사용할 수 있는 클래스 
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		int pw = sc.nextInt();
		
		if(id.equals("Song")) {
			if(pw == 12345) {
				System.out.println("환영합니다!!");
			} else {
				System.out.println("비밀번호를 잘 못 입력하셨습니다.");
			}
		} else {
			System.out.println("아이디를 잘 못 입력하셨습니다.");
		}
		
	}

}
