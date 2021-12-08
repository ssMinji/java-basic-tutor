package operation;

public class OperationEx5 {

	public static void main(String[] args) {

		// 조건식 ? 결과1 : 결과2
		int num = (3 > 2) ? 10 : 20;
		System.out.println(num);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
	}

}
