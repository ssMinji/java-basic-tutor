package org.tutorials.javatutorials.oop;

// 인스턴스의 유효범위 
class C{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v); // 지역변수에게 우선순위가 주어지게 됨 
		System.out.println(this.v); // this가 붙어있으므로 전역변수를 가리키게 됨 
	}
}
public class No05_ScopeDemo4 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
		
		// this 붙여서 출력하면
		// 20, 10 출력
		// 인스턴스 자신을 의미하는 것이 this
		// 인스턴스에 대한 전역을 의미하게 됨 
		
		// 결론
		// 변수를 전역변수, 지역변수 나눠서 좀 더 관리하기 편리하도록 한 것
		// 객체라는 개념이 존재하지 않는 절차지향 프로그래밍에서는 모든 메소드에서 접근이 가능한 변수의 사용을 죄악시함
		// 만약 적절한 변수와 메소드를 묶어 객체로 생성하면 그 것들은 객체 내에서의 전역으로 동작하기 때문에 유효범위 제한할 수 있음 
		// 따라서 연관된 변수와 메소드를 그룹핑함으로서 마음놓고 객체 안에서 전역변수를 사용할 수 있는 것
		// 하지만 객체도 너무 커질 수 있기 때문에 적당한 크기를 유지하고 전역변수를 남용하지 않는 것이 중요 

	}

}
