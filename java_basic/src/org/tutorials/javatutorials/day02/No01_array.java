package org.tutorials.javatutorials.day02;

import java.util.ArrayList;
import java.util.Arrays;

public class No01_array {

	public static void main(String[] args) {
		// 배열 생성 
		int[] array1 = new int[4];
		System.out.println(array1.length);
		System.out.println(Arrays.toString(array1)); 
		array1[0] = 1;
		System.out.println(array1); // 주소값 출력 
		System.out.println(Arrays.toString(array1)); 
	    array1[1] = 2;
	    array1[2] = 3;
	    array1[3] = 4;
	    
	    int[] array2 = new int[]{1,2,3,4,5};
	    .
	    // 문자열 배열
	    String[] ex = new String[3];
	    System.out.println(Arrays.toString(ex));
	    
	    String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
	    // 에러 발생 
	    //System.out.println(weeks[7]);  // 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
	    
	    // 배열의 길이만 설정하여 변수를 먼저 생성한 다음 그 값은 나중에 대입하는 방법이다. 
	    //단, 위 예처럼 초기값 없이 배열 변수를 만들때에는 반드시 길이값이 필요하다. 
	    //즉, 다음과 같은 코드는 불가능하다.
	    //String[] weeks = new String[];    // 길이값이 없으므로 컴파일 오류가 발생한다.
	    
	    // Quiz 
	    // 길이가 10인 정수형 배열 만들고 1부터 10까지 삽입 
	    int [] iarray = new int[10];
	    System.out.println(iarray.length);
	    
	   //배열에 값을 반복적으로 넣어야 하므로, for 반복문을 이용한다. 
	    for(int i = 0; i < iarray.length; i++){ 
	    //배열의 인덱스는 0부터 시작하므로, 0부터 배열의 길이보다 하나 작을때까지 반복하면 배열의 크기만큼 반복할 수 있다. 
	            iarray[i] = i + 1;  
	            System.out.println(Arrays.toString(iarray)); 
	    //배열의 인덱스는 0부터인데 넣고 싶은 값은 1부터 사용해야하므로, 인덱스에 1을 더해준 값을 넣어준다. 
	    }
	    
	    // 2차원 배열
	    int[][] array4 = new int[3][4];
	    System.out.println(Arrays.deepToString(array4)); 
	    array4[0][0] = 10;
	    
	    int[][] array5 = new int[3][];
	    //위와 같이 선언하면 array5는 3개짜리 배열을 참조한다. 3개짜리 배열은 아직 참조하는 배열이 없다는 것을 의미.
	    System.out.println(Arrays.deepToString(array5)); 

	    array5[0] = new int[1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5 의 0 번째 인덱스가 참조한다.  
	    System.out.println(Arrays.deepToString(array5)); 
	    array5[1] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성해서 array5 의 1 번째 인덱스가 참조한다.  
	    array5[2] = new int[3]; //정수를 세개 담을 수 있는 배열을 생성해서 array5 의 2 번째 인덱스가 참조한다.
	    
	    int[][] array6 = {{1}, {2,3}, {4,5,6}};
	    //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다. 
	    
	    // Quiz
	    int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        
        // 2차원 배열 array를 출력합니다.
        for(int i = 0 ; i < array.length; i++) {
            System.out.print( (i+1) + "번째 줄을 출력합니다>");
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
	    
        // 리스트(List)
        // 리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
        // 배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다.
        // List 자료형에는 ArrayList, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다. 
        // 여기서 말하는 List 자료형은 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.
        // List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("one");
        list1.add("two");
        list1.add(2, "three");
        System.out.println(list1);
        
        // get: 특정 인덱스 값 추출
        System.out.println(list1.get(1));
        // size: 리스트 크기 리턴
        System.out.println(list1.size());
        // contains: 리스트 안에 특정 값이 있는지 판별하여 boolean 결과값 리턴 
        System.out.println(list1.contains("two"));

        // remove: 리스트에서 항목 삭제 
        // 파라미터: 객체 or 인덱스 
        System.out.println(list1.remove("one"));
        System.out.println(list1.size());
        System.out.println(list1.remove(0));
	}

}
