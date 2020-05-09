package com.itbank.javatutorials.day03;

class Car{
	String name;
	int number;
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}

class Bus extends Car {
	int fee;
	
	public Bus(String name, int number, int fee) {
		super(name, number);
		this.fee = fee;
	}
	
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		/*
		 * 실습
		 * Bus클래스는 Car클래스의 자식클래스
		 * Car클래스의 생성자는 name(이름), number(차량번호)을 입력받고,
		 * Bus클래스의 생성자는 name(이름), number(차량번호), fee(요금)을 입력받음
		 * 부모클래스의 생성자를 이용해 name과 number를 초기화한 후 
		 * fee를 직접 초기화하는 Bus의 생성자 만들어보기
		 * 
		 * POINT: 클래스 생성 및 상속, super키워드 이용
		 * */
		Bus bus = new Bus("버스", 3000, 1050);
		System.out.println(bus.name);
		System.out.println(bus.number);
		System.out.println(bus.fee);
		
		// Car 객체 생성해보기 객체명 car
		Car car = new Car("트럭", 2020); // name, number초기화
		System.out.println(car.name);
		System.out.println(car.number);
	}

}
