package org.tutorials.javatutorials.interfaces;

class Taxi implements Meter {
	// Meter인터페이스의 start와 stop메소드를 구현해야 합니다.
	public void start() {
		System.out.println("운행을 시작합니다.");
	};
	public int stop(int distance) {
		int fee = distance * 2;
		return fee;
	};
}



public class InterfaceQuiz {
	public static void main(String[] args) {
		/**
		 * Meter(택시 미터기)인터페이스는 start와 stop이라는 추상 메소드를 가지고 있습니다. 
		 * start메소드는 "운행을 시작합니다"라는 메시지를 출력합니다. 
		 * stop메소드는 달린 거리에 해당하는 값(distance)를 매개변수로 받아 요금을 int형으로 반환하는 메소드입니다. 
		 * Meter인터페이스를 구현하는 택시 클래스를 완성해 보세요. 
		 * 요금은 distance x 2로 계산하세요.
		 * 
		 * */
	}

}
