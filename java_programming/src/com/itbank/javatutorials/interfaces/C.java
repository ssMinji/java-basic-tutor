package com.itbank.javatutorials.interfaces;

// 인터페이스도 상속이 될까? 
// yes
// 클래스가 구현하고 있는 인터페이스가 
// 상속받고 있는 인터페이스의 메소드들도 해당 클래스에서 구현을 해줘야 함
interface I3{
	public void x();
}

interface I4 extends I3{
	public void y();
}

public class C implements I4 {
	public void x() {}
	public void y() {}
}
