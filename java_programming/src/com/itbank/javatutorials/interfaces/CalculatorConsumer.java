package com.itbank.javatutorials.interfaces;

// 가짜클래스
// 나중에 구체적인 로직이 만들어져서 사용할 수 있을 것이라고 가정하고 
// 나머지 로직을 구현하는 것
/*class CalculatorDummy {
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}*/

// 인터페이스 적용 후 
// 나중에 이 더미 클래스가 실제 완성된 클래스로 대체될 때 
// 동작이나 로직이 달라지지 않는다는 것을 보장받을 수 있음 
class CalculatorDummy implements Calculatable{
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}


public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20, 30);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
		
		// 개발자입장에서 서로 다른 생각을 가지고 구현하게 되는 상황을 방지해주는 것 
		
	}

}
