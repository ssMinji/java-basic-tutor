package org.tutorials.javatutorials.control;

public class No04_If {
	public static int conditionTest(int value){
        // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
		// else if 문을 추가해 value가 4의 배수이면 ret에 4를 저장하는 코드를 추가해보세요.
        int ret = 0;
        if( value % 3 == 0 ){
            ret = 3;
        }
        else if( value % 4 == 0) ret = 4; // 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.

        // 결과 체크를 위한 코드입니다.
        return ret;
    }
	
	public static void main(String[] args) {
		System.out.println(conditionTest(5));
        if(true){
            System.out.println("result : true");
        }
        if(false){
            System.out.println("result : false");
        }
        
        // step 2 if - else
        if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
 
        // step 3 if - else if - else
        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
       
    }

}
