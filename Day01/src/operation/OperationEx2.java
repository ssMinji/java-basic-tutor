package operation;

public class OperationEx2 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(++num); // 11
		// ++ 혹은 --가 변수 앞에 붙으면, 문장이 끝나기 전에 연산하라는 의미 
		
		System.out.println(num--); // 11 
		System.out.println(num); // 10 
		// 문장이 다 끝난 이후에 연산 실행. num의 값이 출력된 이후에 연산이 이루어짐 
	}

}
