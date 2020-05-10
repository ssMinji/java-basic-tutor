package org.tutorials.javatutorials.exception;

class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
    	// step1
    	if(right == 0){
            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	
    	//step2
    	if(this.right == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
		c1.divide();
		
		// step2
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
        
        // 정리
        // throw는 예외를 발생시키는 명령이다. 
        //throw 뒤에는 예외 정보를 가지고 있는 예외 클래스가 위치한다. 
        //자바 가상 머신은 이 클래스를 기준으로 어떤 catch 구문을 실행할 것인지를 결정한다. 
        //또 실행되는 catch 구문에서는 예외 클래스를 통해서 예외 상황의 원인에 대한 다양한 정보를 얻을 수 있다. 
        //이 정보를 바탕으로 문제를 해결하게 된다.

	}

}
