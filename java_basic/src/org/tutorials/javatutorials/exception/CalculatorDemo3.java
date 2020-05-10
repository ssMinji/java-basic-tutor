package org.tutorials.javatutorials.exception;

// 사용자 정의 예외 
class DivideException extends RuntimeException {
    DivideException(){
        super();
    }
    // new DivideException("0으로 나누는 것은 허용되지 않습니다.");이런식으로 해주기 위해
    // 부모생성자 중에 문자를 받아오는 생성자 구현해줘야함 
    DivideException(String message){
        super(message);
    }
}

// step2 
// extends Exception
class DivideException extends Exception {
    DivideException(){
        super();
    }
    // new DivideException("0으로 나누는 것은 허용되지 않습니다.");이런식으로 해주기 위해
    // 부모생성자 중에 문자를 받아오는 생성자 구현해줘야함 
    DivideException(String message){
        super(message);
    }
}

class Calculator3{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
    
    // step2
    // 해결책 1 트라이 캐치 
    public void divide(){
        if(this.right == 0){
            try {
                throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
    
    //step3
    // 해결책 2 사용자에게 예외 던지기 따라서 사용자가 반드시 예외처리 
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
    
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
        
        // step3
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
        

	}

}
