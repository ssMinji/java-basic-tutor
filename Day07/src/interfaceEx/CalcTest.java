package interfaceEx;

public class CalcTest {

	public static void main(String[] args) {

		
		Calc calc = new CompleteCalc();
		/*
		 * 이렇게 쓸 수 있음
		 * 이렇게 쓸 수 있다는 것의 의미?
		 * CompleteCalc가 Calc 타입에 대한 정보를 내포하고 있어야 함 
		 * Calc에 코드가 없는데 무엇을 상속했냐 할 수 있겠지만 이런 경우는 타입 상속이 일어난 것
		 * 따라서 calc. 해보면 Calc 인터페이스에 선언된 메서드들을 호출 가능. 
		 * 그리고 실제로 불리는건 CompleteCalc에 구현된 메서드임 
		 * */
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		// 12가 나오는 것 확인 가능 
		
		Calc calc1 = new Calc(); // 인터페이스는 new 로 인스턴스화 될 수 없음 
		Calc calc2 = new Calculator(); // Calculator도 마찬가지 추상클래스이므로 인스턴스화 될 수 없음  
		
		// 아래의 케이스 전부 가능 
		// CompleteCalc 클래스의 타입이 여러개라는 것 . 해당 타입들로 업캐스팅 가능하다는 것 
		Calc calc3 = new CompleteCalc();
		Calculator calc4 = new CompleteCalc();
		CompleteCalc calc5 = new CompleteCalc();
		
		// 다만 주의할 점 
		calc.showInfo(); // 불가능
		// 이유는 calc의 타입이 Calc이기 때문.
		// 다시말해서 인스턴스가 무엇이냐 인것과 상관없이 타입에 종속되어서 타입에 선언된 메서드들만 호출할 수 있다. 
		// 다시 CompleteCalc에만 선언된 메서드를 호출하고 싶다면, 다운캐스팅을 해야하는 것! 
		// 그리고 이제 곧 하겠지만 Calc 라는 인터페이스를 구현한 클래스가 여러개일 수 있음 
		// 즉, CompleteCalc말고도 다른 클래스들도 Calc 타입을 가지고 선언될 수 있다 
		// 그때 호출되는 메서드들은 오버라이딩으로 구현된 인스턴스의 메서드가 불리게 될 것이고  그로인해서 다형성이 구현될 수 있다 
		
		//  '클래스 상속과 달리 구현코드가 없기 때문에 여러 인터페이스를 구현 가능 '의 의미
		// implements 뒤에는 여러개의 인터페이스 사용 가능 
		// 인터페이스는 구현코드 없이 타입만 상속받는 것이기 때문임.
		// 클래스 상속은 여러개를 상속받으면 모호해질 수 있기 떄문에 단일상속만 가능 
		
	}

}
