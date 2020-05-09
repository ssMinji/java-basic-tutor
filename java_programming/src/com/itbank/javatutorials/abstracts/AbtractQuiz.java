package com.itbank.javatutorials.abstracts;

abstract class Machine{
	public abstract void turnOn();
	public abstract void turnOff();
}

class Car extends Machine{
	//오버라이딩
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}
}

public class AbtractQuiz {

	public static void main(String[] args) {
		/*
		 * 추상클래스 Machine -> 추상메소드 turnOn, turnOff 
		 * 
		 * Car 클래스를 만들고,
		 * Car 클래스에 turnOn, turnOff 메소드 구현해보기 
		 * 
		 * */
		Car c = new Car();
		c.turnOn();
		c.turnOff();

	}

}
