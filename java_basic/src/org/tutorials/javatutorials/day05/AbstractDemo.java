package org.tutorials.javatutorials.day05;

abstract class Ex{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    
    public void d(){
        System.out.println("world");
    }
}

// 에러: 클래스 B는 클래스 Ex의 메소드 중 b()메소드를 상속해야합니다. 
// 클래스 Ex가 가지고 있는 메소드 b는 abstract 키워드를 가지고 있음 
// 즉, b는 추상메소드라는 의미이고, 추상메소드의 특징은 중괄호로 시작하는 본체가 존재하지 않음
// 그냥 딱 ()로 끝나버림 
// 즉 구체적인 로직을 담고있는 본체가 없고, 시그니처만이 남아있는 메소드이다. 
// 추상메소드를 사용하기 위해서는 반드시 메소드를 '오버라이딩'해서 구체적인 로직을 정의해줘야함 
class B extends Ex {
	// b 오버라이딩 하기 
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
//		 Ex obj = new Ex();
		 // 에러 발생.
		 // 추상클래스는 반드시 상속해서 사용해야 함 
		 B obj = new B();
		 
		 // 결론
		 // 사실은 Ex라는 클래스는 abstract 클래스를 먼저 정의했다기보다
		 // b라는 메소드가 추상메소드이기 때문에 이를 가지고 있는 클래스 A는 자동으로 추상클래스가 되는것
		 // 메소드 중 하나라도 추상메소드라고 한다면 그 메소드를 담고잇는 클래스는 abstract가 됨
		 
		 // 클래스 A가 추상클래스임에도 불구하고
		 // 추상메소드 뿐만아니라 구체적인 로직을 가지고 있는 d같은 메소드를 가질 수도있다.
	}

}
