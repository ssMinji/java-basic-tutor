package com.itbank.javatutorials.other;

import com.itbank.javatutorials.same.*;

class A{}
// public class B{}
// 주의점
// public 클래스가 포함된 소스코드는 public클래스의 클래스명과 소스코드의 파일명이 같아야 함
// 하나의 소스코드내에는 하나의 public클래스만 존재 가능

public class ClassAccessDemo2 {
	PublicClass p = new PublicClass();
	// DefaultClass d = new DefaultClass();
	
	// 따라서, default클래스는 같은 클래스에서만 사용 가능하다. 
	// 다른 패키지에 있는 클래스에서는 접근 불가능

}


