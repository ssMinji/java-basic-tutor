package com.itbank.javatutorials.eclipse;

public class WhileDemo {

	public static void main(String[] args) {
		// 무한루프 가능 --> 어느시점에 조건문을 탈출할지 잘 정해야함 
		/*int i = 0;
		int sum = 0;
		while(i<=3) {
			sum += i;
			System.out.println(sum);
			i++;
		}*/
		
		// 커피 사먹기 
		// coffee= 10잔  money = 300원
		// 커피 한 잔에 10원
		// 커피 한 잔 팔때마다 남은 커피 수 출력(남은 커피 수는 ?잔 입니다.)
		// 돈이 다 떨어질때까지 커피를 마시고싶어...
		// 돈은 있지만 커피가 다 떨어진다면, 판매중지 메시지 출력 
		/*int coffee = 10;
		int money = 300;
		int price = 10;
		while (money > 0) {
			if(coffee == 0) {
				System.out.println("커피 판매 완료!");
				break;
			}
			coffee--;
			money -= price;
			System.out.println("남은 커피: "+ coffee+ "잔");
		}*/
		
		//1부터 10까지 출력하는데 3의 배수는 출력 안함 
		int a = 0;
		while (a<=10) {
			a++;
			if (a % 3 == 0) {
				continue;
			}
			System.out.println(a);
		}
		
		
		

	}

}
