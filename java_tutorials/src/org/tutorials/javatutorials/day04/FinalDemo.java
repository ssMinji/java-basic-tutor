package org.tutorials.javatutorials.day04;

class Calculator2 {
	// static이라고 했던 맥락은
	// 모든 인스턴스에서 공유할 수 있는 값이기 때문에 사용했음
	// 하지만 이 값이 바뀌지 않는다는 의미에서 final을 붙여주는 것
    static final int base = 10;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // 에러
        //Calculator2.base = 10;
    }
 
    public void sum() {
        System.out.println(this.left + this.right + this.base);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

// final 메소드 
class Ex1{
	final void b() {}
}

class Ex2 extends Ex1{
	// 에러
	// 오버라이딩 불가 
	// 해당 메소드 상속 불가 
	void b() {}
}

public class FinalDemo {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
        System.out.println(c1.base);
        // 에러 
        //Calculator.PI = 10;

        // 결론
        // 단순한 사용 용도로는 변수의 변경 막는 것
        // 메소드 재정의 막는 것 - final변수만큼 사용빈도가 높지는 않음 
        // final클래스는 해당 클래스를 대상으로 일체의 상속이 불허 
	}

}
