package interfaceEx2;

public interface Calc {
	
	double PI = 3.14; 
	int ERROR = -999999999;

	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	
	
	// 1. default 
	default void description(){ // default 키워드 없으면 에러남. abstract이 기본형이라 구현코드를 가질 수 없기 때문에 default라고 명시해줘야 함 
		System.out.println("점수 계산기를 구현합니다.");
		myMethod();
	}
	
	// 2. static - 인스턴스의 생성과 상관없이 사용 가능 
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
			
		}
		return total;
	}
	
	// 3. private 
	private void myMethod() {
		System.out.println)("private 메서드입니다.")
	}
}
