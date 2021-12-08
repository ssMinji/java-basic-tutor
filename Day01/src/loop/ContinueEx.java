package loop;

public class ContinueEx {

	public static void main(String[] args) {

		// 1부터 10까지 홀수만을 더하기 
		int sum = 0;
		int num;
		
		for(num=1; num<=10; num++) {
			
			if(num % 2 == 0) {
				continue; // 나머지 수행문을 수행하지 않고 증감식을 수행함 
			}
			sum += num;
		}
		
		System.out.println(sum);
	}

}
