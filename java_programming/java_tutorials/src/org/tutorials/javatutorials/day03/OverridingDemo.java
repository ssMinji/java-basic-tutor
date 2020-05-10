package org.tutorials.javatutorials.day03;

// 오버라이딩(Overriding) : 메소드 재정의
class Calculator5 {
	int left, right;
	 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
	
}

class SubstractionableCalculator5 extends Calculator5 {
//	@Override
//	 public void sum() {
//	        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
//	 }
	 
	 public void substract() {
		 System.out.println(this.left - this.right);
	 }
	 
}
public class OverridingDemo {

	public static void main(String[] args) {
		SubstractionableCalculator5 c1 = new SubstractionableCalculator5();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

	}

}
