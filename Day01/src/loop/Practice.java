package loop;

public class Practice {

	public static void main(String[] args) {

		// 1부터 10까지 출력하는데 3일 때는 출력하지 않고, 6까지만 출력 
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue;
			} else if(i==7) {
				break;
			}
			System.out.println(i);
		}
		
		// 2단부터 9단까지 구구단 
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "= " + dan*times);
			}
		}
		
		// while 문으로 작성해보기 
		dan = 2;
		times = 1;
		
		while(dan<=9) {
			times = 1; // 초기화과정 필수! 
			while(times<=9) {
				System.out.println(dan + "X" + times + "= " + dan*times);
				times++;
			}
			dan++;
		}
		
	}

}










