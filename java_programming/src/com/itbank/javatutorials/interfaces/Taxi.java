package com.itbank.javatutorials.interfaces;

public class Taxi implements Meter{
	/*start메소드는 "운행을 시작합니다" 메시지 출력
	 * stop메소드는 주행거리(distance)값을 매개변수로 받아 요금(fee)을 int형으로 반환
	 * 
	 * Meter인터페이스를 구현하는 Taxi 클래스 만들기
	 * 이 때, 요금은 주행거리 *2 로 계산*/
	public void start() {
		System.out.println("운행을 시작합니다");
	}
	public int stop(int distance) {
		int fee = distance * 2;
		return fee;
	}
	
}
