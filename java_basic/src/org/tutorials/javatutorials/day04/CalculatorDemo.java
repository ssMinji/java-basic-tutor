package org.tutorials.javatutorials.day04;


class Calculator{
    private int left, right;
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return this.left+this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
        
        // 실제 계산이 일어나는 부분은 private으로 지정해서 
        // 사용자들이 내부 메소드에 접근하는 것을 통제할 수 있다. 
        
        // 전역변수의 값이 private으로 지정 
        // c1.left = 100 을 통해서도 인스턴스변수의 값을 변경할 수 있었지만
        // 변수를 직접 변경하게 되면 사용자가 입력하는 값을 통제할 수가 없게 됨 
        // 예를들어 항상 양수여야 하는 조건이 있다고한다면, 사용자가 음수를 입력해도 제어할 수 없음
        // 따라서 이경우에 private으로 변수 지정 
        // 사용자가 의도하지 않은 방법으로 내부적인 변수, 메소드의 상태를 변경하는 불상사 막는다.
        // 사용자 입장에서도, sum()에 접근하지 못하기 때문에 이것에 대해서 신경쓰지 않아도됨
        // 따라서 계산기를 사용함에 있어서 더 적은 메뉴얼로 사용할 수 있다. 
	}

}
