package org.tutorials.javatutorials.other;

// 클래스 임포트
import org.tutorials.javatutorials.same.*;

public class ClassAccessDemo2 {
	PublicClass publicClass = new PublicClass();
	//DefaultClass defaultClass = new DefaultClass();
	
	// 에러 발생
	// default는 같은 패키지에서만 사용가능하다. 
	//따라서 default 접근제어자를 가지고 있는 클래스는 다른 패키지에 있는 클래스에서 
	// 접근 불가능하다 

}

// 하나 주의점 
// public 클래스가 포함된 소스코드는 public 클래스의 클래스명과 소스코드의 파일명이 같아야함
// 하나의 소스코드안에는 하나의 public 클래스만 존재 가능 
// 즉, 이 파일에서 여러개의 클래스 생성가능하지만, public class 는 ClassAccessDemo2만 가능
class A{
	
}

// 에러
public class B{
	
}
