package operation;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 20 
		System.out.println(i); // 2
		// &&: 앞의 항이 false라면 뒤 항의 결과를 평가하지 않더라도 false임을 알 수 있음
		// 따라서 앞의 항이 false이기 때문에 뒤 항을 실행하지 않음
		
		int num2 = 10;
		int j = 2;
		
		boolean value2 = ((num2 = num2 + 10) > 10) || ((j = j + 2) < 10);
		System.out.println(value2); // true 
		System.out.println(num2);//20
		System.out.println(j); // 2
		// ||: 두 항이 모두 false여야 false를 반환. 즉, 둘 중 하나가 true이면 true반환 
	}

}
