package org.tutorials.javatutorials.poly;

// 쿨래스와 다형성 
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    
    int _sum() {
    	return this.left+this.right;
    }
    
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }

}

class CalculatorKor extends Calculator {
    public void sum(){
        System.out.println("두 수의 합은 sum :"+_sum());
        
    }
    public void avg(){
        System.out.println("두 수의 평균은 avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorEng extends Calculator {
    public void sum(){
        System.out.println("Sum of two numbers:"+_sum());
    }
    public void avg(){
        System.out.println("Average of two numbers:"+(this.left+this.right)/2);
    }
}  
public class CalculatorDemo {
	// execute라는 메소드 추가
	// 이 메소드는 cal이라는 변수의 run을 호출하고 있는데, cal이라는 것은 메소드의 매개변수이고
	// 이것의 데이터 타입은 Calculator입니다. 
	public static void execute(Calculator cal) {
		System.out.println("실행결과" );
		cal.run();
	}
	
	// 아래에는 오버로딩으로 해결하는 방법 -- 좋은 방법이 아님
	// 완전한 코드의 중복이므로 
	public static void execute(CalculatorKor cal) {
		System.out.println("실행결과" );
		cal.run();
	}
	
	public static void execute(CalculatorEng cal) {
		System.out.println("실행결과" );
		cal.run();
	}
	
	
	
    public static void main(String[] args) { 
    	// 예전
//    	CalculatorKor c1 = new CalculatorKor();
//        c1.setOprands(10, 20); // 부모클래스에 있는 메소드 
//        c1.run();
//         
//        CalculatorEng c2 = new CalculatorEng();
//        c2.setOprands(10, 20);
//        c2.run();
        
    	// 수정 후 
        Calculator c1 = new CalculatorKor();
        c1.setOprands(10, 20);
        c1.run();
         
        Calculator c2 = new CalculatorEng();
        c2.setOprands(10, 20);
        c2.run();
        
        // 같은 데이터타입을 가지고 있지만 
        // c1.run();을 실행했을 때와  c2.run();을 실행했을 때 동작하는 방법이 다르죠. 
        
        // 수정 후 2
        Calculator c3 = new CalculatorKor();
        c1.setOprands(10, 20);
         
        Calculator c4 = new CalculatorEng();
        c2.setOprands(10, 20);
        
        execute(c1);
        execute(c2);
        // 여기서 execute메소드는 CalculatorKor와 CalculatorEng 클래스의 메소드 run을 호출
        // 즉 메소드 execute내부에서는 매개변수로 전달된 객체의 메소드 run을 호출하고 있다
        // 만약 메소드 execute의 매개변수 데이터 타입이 Calculator가 아니라면 어떻게 해야할까?
        // 위와 같은 로직을 처리할 수 없을 것이다. 
        // 즉 메소드 execute입장에서는 매개변수로 전달된 값이 caculator이거나 혹은 그 자식이라면, 
        // 메소드 run을 가지고 있다는 것을 보장받을 수있게 되는 것이다
        // 이 맥락에서 다형성이란 하나의 클래스(Calculator)가 다양한 동작방법 (CalculatorKor, CalculatorEng)
        //을 가지고 잇는데 이것을 다형성이라고 할 수 있는 것
    }
   
}