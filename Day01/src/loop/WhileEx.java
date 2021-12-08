package loop;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
//		while(true) {
//			// 무한반복문
//		}
		
		// do-while
		num = 1;
		sum = 0;
		
		while(num < 1) {
			sum += num;
			num++;
		}
		
		// 반복될 문장을 반드시 한 번은 수행 
		do {
			sum += num;
			num++;
		} while(num < 1);
		System.out.println(sum);

	}

}










