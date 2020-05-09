package com.itbank.javatutorials.interfaces;

// 하나의 클래스가 여러개의 인터페이스를 구현할 수 있을까?
// yes
// 각각의 인터페이스에 정의되어있는 메소드들을 해당 클래스에서 모두 구현해줘야함

interface I1{
	public void x();
}

interface I2 {
	public void y();
}


public class B implements I1, I2{
	public void x() {}
	public void y() {}
	// 클래스 상속에서는 상속받는 클래스는 하나의 부모클래스만을 상속받을 수 있음
	// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있음
}
