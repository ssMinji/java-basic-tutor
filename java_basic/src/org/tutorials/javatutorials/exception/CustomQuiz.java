package org.tutorials.javatutorials.exception;

class MyCheckedException extends Exception{
	
    
}

public class CustomQuiz {
	public int get50thItem(int []array) throws MyCheckedException{
        if(array.length < 50){
            throw new MyCheckedException();
        }
        return  array[49];
    }

	public static void main(String[] args) {
		/*
		 * MyCheckedException클래스가 Checked Exception이 되도록 만들어 보세요
		 * 
		 * error: unreported exception MyCheckedException; must be caught or declared to be thrown
		 * 에러메시지가 나옵니다. get50thItem에서 exception을 throw하는데 try/catch문으로 처리되고 있지 않기 때문입니다
		 * 에러 해결해보기 
		 * */
		
		
		ExceptionExam exam = new ExceptionExam();
        int[] array = new int[10];
        
        exam.get50thItem(array);

	}

}
