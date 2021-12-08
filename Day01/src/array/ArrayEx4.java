package array;

public class ArrayEx4 {

	public static void main(String[] args) {

		// 배열을 활용해 구구단 구현 
		for(int i=2; i<=9; i++) {
			int[] result = new int[9];
			for(int j=0; j<result.length; j++) {
				result[j] = i * (j+1);
				System.out.print(result[j] + " ");
			}
			System.out.println();
		}
	}

}
