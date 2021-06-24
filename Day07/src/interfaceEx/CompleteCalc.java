package interfaceEx;

public class CompleteCalc extends Calculator{

	// class extends -> 구현 상속 
	
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		if(num2 != 0) {
			return num1 / num2;
		} 
		
		return ERROR; // 에러를 반환. 인터페이스에 정의된 상수 사용 
 	}

	public void showInfo(){
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
