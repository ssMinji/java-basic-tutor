package org.tutorials.javatutorials.day05;

abstract class Calculator1{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
    
    
    // 코드 개선하기
    // 접근제어자가 존재하지 않는 것은 default 접근제어자 
    // 같은 패키지안에서만 사용할 수 있는 접근제어자
    // 따라서 다른 패키지에서는 접근 불가능 
    int _sum() {
    	return this.left+this.right;
    }
    int _avg() {
    	return (this.left+this.right)/2;
    }
}

// 상속받은 후 사용자가 직접 구현
class CalculatorKor extends Calculator1 {
    public void sum(){
        System.out.println("두 수의 합은 sum :"+(this.left+this.right));
        
        // 개선 후
        // System.out.println("두 수의 합은 sum :"+ _sum());
    }
    public void avg(){
        System.out.println("두 수의 평균은 avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorEng extends Calculator1 {
    public void sum(){
        System.out.println("Sum of two numbers:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("Average of two numbers:"+(this.left+this.right)/2);
    }
} 

public class AbsCalculator {

	public static void main(String[] args) {
		CalculatorKor c1 = new CalculatorKor();
        c1.setOprands(10, 20); // 부모클래스에 있는 메소드 
        c1.run();
         
        CalculatorEng c2 = new CalculatorEng();
        c2.setOprands(10, 20);
        c2.run();
        
        // 상위클래스에 기본적으로 가지고 있는 setOprands라는 메소드는
        // 이 메소드에 대한 구현이나 개선을 상위클래스에 위임할 수 있게 되는것
        // 즉 그냥 갖다 써도 된다
        // sum()은 자식클래스에서 구현한 것이 호출되는 것이다. 
        // run()은 어떤 순서로 메소드를 호출하는지에 대한 메소드이고,
        // 이는 모든 경우에 공통이다. 
        

	}

}
