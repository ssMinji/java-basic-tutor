
public class ArrayPractice {

	public static void main(String[] args) {
		/*
		 * 배열을 활용해 구구단을 구현한다. 
		 * 구구단 결과를 배열에 저장한 후 배열의 결과를 출력한다. 
		 * */
		
		
		for(int k=2; k<=9; k++){
			int[] result = new int[9];
			for(int i=0; i<result.length; i++){
				//계산 결과를 배열에 저장
				result[i] = k * (i+1);
			}
			for(int i=0; i<result.length; i++){
				//계산 결과를 화면에 출력 
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
		
		
	}

}
