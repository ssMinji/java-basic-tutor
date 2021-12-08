package control;

public class SwitchEx {

	public static void main(String[] args) {

		int rank = 1;
		char medalColor;
		
		switch(rank) {
		case 1: {
			medalColor = 'G';
			break;
		}
		case 2: {
			medalColor = 'S';
			break;
		}
		case 3: {
			medalColor = 'B';
			break;
		}
		default: {
			medalColor = 'N';
		}
		}
		System.out.println(medalColor);
		
		// 위와 비교 
		switch(rank) {
		case 1: medalColor = 'G';
		case 2: medalColor = 'S';
				//break;
		case 3: medalColor = 'B';
				break;
		default: medalColor = 'N';
		}
		System.out.println(medalColor);
		// switch-case 문을 사용할 때 break는 필수!! 
	}

}
