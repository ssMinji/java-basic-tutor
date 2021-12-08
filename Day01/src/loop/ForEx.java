package loop;

public class ForEx {

	public static void main(String[] args) {

		// 1부터 10까지의 합 while문 for문으로 바꿔보기 
		int sum = 0;
		int num;
		
		for(num=1; num<=10; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
		
		for(sum=0, num=1; num<=5; num++) {
			// 반복문 작성 
		}
		
		for(;;) {
			// 무한루프 
		}
	}

}
