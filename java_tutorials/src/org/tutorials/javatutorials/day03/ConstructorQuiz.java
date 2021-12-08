package org.tutorials.javatutorials.day03;

class Car {
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
        // super를 이용해서 Car클래스의 생성자를 이용하세요.
        super(name, number);
        this.fee = fee;
    }
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		 /*
		  * 실습: 
		  * Bus 클래스는 Car 클래스의 자식 클래스
		  * Car클래스의 생성자는 name(이름)을 입력받고, 
		  * Bus 클래스의 생성자는 name(이름), number(차량번호), fee(요금)을 입력받음 
		  * 부모 클래스의 생성자를 이용해 name과 number를 초기화 한 후 fee를 직접 초기화하는 Bus의 생성자 만들어보기. 
		  * */
		 Bus bus = new Bus(new String("버스"), 3000, 1050);
		 System.out.println(bus.name);
		 System.out.println(bus.number);
		 System.out.println(bus.fee);
	}

}
