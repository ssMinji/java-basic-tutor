package classpart;

public class FunctionTest {
	
	// 리턴타입 명시, 메서드명, 매개변수 설정 
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result; // 메서드 정의할 때 설정한 리턴타입과 반드시 동일해야 함 
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}

}
