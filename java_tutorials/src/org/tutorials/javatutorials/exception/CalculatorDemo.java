package org.tutorials.javatutorials.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    // step1
    // 에러: Exception in thread "main" 계산결과는 java.lang.ArithmeticException: / by zero
    // System.out.print("계산결과는 "); 까지 실행되고 오류 발생했다.
    // 즉, 로직 호출한 부분이 문제의 원인
    public void divide(){
        System.out.print("계산결과는 ");
        System.out.print(this.left/this.right);
        System.out.print(" 입니다.");
    }
    
    // step2
    // 하면서 ppt
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("오류가 발생했습니다 : "+e.getMessage());
            
            // step3
            
            /*
             * 실행결과 비교 
             * 1. e.getMessage(): / by zero
             * 2. e.toString(): java.lang.ArithmeticException: / by zero
             * 3. e.printStackTrace(): 
					             * java.lang.ArithmeticException: / by zero
						at org.tutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:24)
						at org.tutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:48)
             * 
             * 1. 오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.
             * 2. 예외상황에 대한 좀 더 자세한 정보. 
             *    ArithmeticException는 수학적인 계산의 과정에서 발생하는 예외상황 의미 
             * 3. getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다.
             *     이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다. 
             *     printStackTrace는 가장 자세한 예외 정보를 제공한다.
             * */
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
            
        }
    }
    
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
        
        // step2
        Calculator c2 = new Calculator();
        c2.setOprands(10, 5);
        c2.divide();
        
        // 오류가 발생하지 않음
        // 즉, 정상적인 애플리케이션처럼 동작하고 있음. 
        // System.out.print("계산결과는 ");까지 실행되었지만 
        // System.out.print(this.left/this.right);는 실행되지 않았다. 
    }
}
