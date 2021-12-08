package org.tutorials.javatutorials.interfaces;

public interface Calculatable {
	public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();

}

// setOprands라는 메소드 세개의 정수형 인자를 갖는다
// sum과 avg라는 메소드도 가지고 있는데 int형식을 반환한다
// 이러한 약속을 개발자들 사이에 해준 것 
