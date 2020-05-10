package org.tutorials.javatutorials.interfaces;

interface I{
    public void z();
}

class A implements I{
	public void z() {}
}

// interface키워드는 해당 I가 인터페이스라는 의미
// z()는 본체가 없음. 마치 추상클래스 내에 있는 추상메소드가 본체가 없는 것과 똑같음

// 클래스 A에 implements라고하면 I라는 인터페이스를 구현하고 있다는 의미 
// 클래스 A를 만들때 public void z()가 없으면 에러가 남 
// z라는 메소드를 직접 구현해줘야 함 

// 의미
// 특정한 클래스를 특정한 인터페이스와 결합시키게 되면
// 클래스를 정의할 때 인터페이스 내에 있는 메소드를 반드시 구현하도록 강제하는 것 
// 클래스 A는 인터페이스 I를 구현한다 라고 이야기한다. 