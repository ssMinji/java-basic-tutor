package org.tutorials.javatutorials.oop;


class C1{
	static int base = 10;
	int a, b;
	int c = 3;
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 인스턴스 메소드는 클래스 변수에 접근 가능 
	public void sum() {
		System.out.println(this.a + this.b + base);
	}

	// 클래스 메소드는 클래스 변수에 접근 가능
	public static void static_multiply() {
		System.out.println(base*10);
	}
	
	// 클래스 메소드는 인스턴스 변수에 접근 불가 
	public static void static_sum() {
		//System.out.println(c + base);
	}
}
public class No03_StaticDemo {
	

	public static void main(String[] args) {
		
		/*인스턴스 메소드는 클래스 멤버에 접근할 수 있다. 
		클래스 메소드는 인스턴스 멤버에 접근할 수 없다. 
		인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 
		클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에 클래스 메소드가 인스턴스 멤버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.*/
		C1 c = new C1();
		c.setNum(3,  4);
		
		// 인스턴스 메소드 호출
		c.sum(); // 17
		
		// 클래스 메소드 호출 - 클래스 변수에 접근 가능 
		c.static_multiply(); // 100
		
		// 인스턴스 생성없이 바로 클래스 메소드 호출
		C1.static_multiply(); // 100 
		
	}

}
