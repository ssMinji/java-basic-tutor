package interfaceEx2;

public class CalcTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		
		
		// 1. default 
		calc.description(); // 구현하지않아도 호출 가능 
		// 당연히 인터페이스 implements 하는 곳에서 오버라이딩 가능 -> CompleteCalc 클래스 이동 후 재정의
		// 다시 실행해보면 재정의된 함수 호출됨
		// 즉, 지난시간에 배운 가상메서드  방식에 의해 인스턴스의 메서드가 호출된다 
		
		// 2. static
		int[] arr = new int[]{1, 2, 3, 4, 5};
		int sum = Calc.total(arr); // 인스턴스 생성과 상관없이 인터페이스 이름으로 호출해서 메서드 사용 가능 
		System.out.println(sum);
		
	}

}
