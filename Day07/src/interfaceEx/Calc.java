package interfaceEx;

public interface Calc {
	
	double PI = 3.14; 
	int ERROR = -999999999;
	// 아무런 키워드를 쓰지 않아도 public static final

	
	//interface 키워드 안에 선언이 되면 abstract 키워드 없이드 abstract 메서드가 됨 
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	
	/* 여기까지 정리
	 * 인터페이스에는 상수와 추상메서드가 선언됨 
	 * */
	
	// 마지막에 
	// 인터페이스 내에 정의된 추상메서드 및 변수들은 구현부는 없지만 
	// 저번에도 설명했듯 변수의 이름, 매개변수, 리턴타입을 정의하는 것 만으로도 기능에 대한 정의는 거의 다한 것 
	// 따라서 이렇게 뼈대를 만드는 인터페이스 설계가 굉장히 중요하다 
}
