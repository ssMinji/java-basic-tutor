package org.tutorials.javatutorials.exception;

class ExceptionExam{
	public int get50thItem(int[] array) throws ArrayIndexOutOfBoundsException{
		return  array[49];
	}
}

class ExceptionExam2{
	public int get50thItem(int[] array){
		if(array.length < 50){
			//return 0;
			throw new IllegalArgumentException("길이가 50보다 작을 수 없습니다");
		}
		return  array[49];
	}

	// if(array.length < 50){throw new IllegalArgumentException("길이가 50보다 작을 수 없습니다")}
}

public class ThrowQuiz {

	public static void main(String[] args) {
		/* 1)
		 * ExceptionExam클래스의 get50thItem메소드에서는 매개변수로 받은 array의 50번째 값을
		 *  return합니다. 
		 *  만약 array의 크기가 50보다 작을 경우에는 
		 *  ArrayIndexOutOfBoundsException이라는 예외가 발생하는데요. 
		 *  get50thItem이 ArrayIndexOutOfBoundsException를 throw하도록 정의해 보세요.
		 * 
		 * 2)
		 * ExceptionExam2클래스의 get50thItem메소드에서는 매개변수로 받은 array의 50번째 값을 return합니다. 
		 * 만약 array의 크기가 50보다 작을 경우에는 0을 return하고 있는데요. 
		 * 0을 리턴하는 대신에 IllegalArgumentException을 throw하도록 만들어 보세요.
		 * */
		int[] arr = new int[3];
		ExceptionExam e = new ExceptionExam();
		//e.get50thItem(arr);
		
		ExceptionExam2 e2 = new ExceptionExam2();
		e2.get50thItem(arr);
	}

}
