package loop;

public class BreakEx {

	public static void main(String[] args) {

		// 1부터 쭉 더하다가 100이 넘는 순간의 n의 값? 
		int sum = 0;
		int num = 1;
		
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println(sum); // 105
		System.out.println(num); // 15
		
		// 위의 코드 개선
		sum = 0;
		num = 1;
		
		while(true) {
			sum += num;
			
			if(sum > 100) {
				break;
			}
			
			num++;
		}
		System.out.println(num);
	}

}









