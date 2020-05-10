package org.tutorials.javatutorials.interfaces;

class D{
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");

	}
}

// 즉, 오버로딩은 다형성의 한 예라고 볼 수 있다 
// 오버라이딩도 마찬가지로 다형성의 한 예라고 볼 수 있다. 