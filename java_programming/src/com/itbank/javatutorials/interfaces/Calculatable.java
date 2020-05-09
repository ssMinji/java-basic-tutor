package com.itbank.javatutorials.interfaces;


// 인터페이스 생성 
// 잘못된 커뮤니케이션으로 인해 잘못 개발되는 문제가 발생할 수 있는데, 
// 이를 방지하기 위해서 약속을 정해두는 것
public interface Calculatable {
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
	
	// 인터페이스 내의 메소드들은  public으로 지정
	// 인터페이스를 구체적으로 구현하고 있는 클래스를 외부에서 조작하기 위한 조작장치이다
	// 따라서 인터페이스의 멤버들의 접근제어자는 반드시 public
}
