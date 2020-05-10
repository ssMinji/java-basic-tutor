package org.tutorials.javatutorials.day06;

class Item<T>{
	T a, b;
	
	void setA(T a) {
		this.a = a;
	}
	T getA() {
		return a;
	}
	
	void setB(T b) {
		this.b = b;
	}
	T getB() {
		return b;
	}
	
}

public class GenericQuiz {

	public static void main(String[] args) {
		/*
		 * 제네릭 클래스 Item만들기
		 * 변수로 a, b가지고 있음. 데이터타입은 제네릭 선언 
		 * 
		 * a, b값을 세팅해주는 setA, setB메소드 작성(void)
		 * a, b값을 가져오는 getA, getB메소드 작성(제네릭)
		 * 
		 * 매소드 작성 시 매개변수의 데이터타입을 어떻게 설정해야하는지 고민해보세요
		 * */

	}

}
