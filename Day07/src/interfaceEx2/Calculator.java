package interfaceEx2;

public abstract class Calculator implements Calc{
	
	// 인터페이스 구현할 때 : implements 키워드 
	// 다 구현하지 않고 일부만 구현해보자 
	// 그랬다면 내부적으로 추상메서드를 갖게 되는 것이고 따라서 class에 abstract 키워드 추가 
	// interface implements -> 타입 상속 
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return  num1 - num2;
	}

}
