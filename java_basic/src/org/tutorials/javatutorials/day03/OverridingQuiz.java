package org.tutorials.javatutorials.day03;

class Calculator7 {
	int left, right;
	 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }

	 public int avg() {
	    return (this.left + this.right) / 2;
	}
	
}

class SubstractionableCalculator7 extends Calculator7 {
	 public void sum() {
	        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
	 }
	 
	 @Override
	 public int avg() {
		 int a = super.avg();
		 int b = this.left + this.right;
		 return a+b;
		 
	 }
	 
	 public void substract() {
		 System.out.println(this.left - this.right);
	 }
	 
}

public class OverridingQuiz {

	public static void main(String[] args) {
		// 실습
		/*
		 * Calculator 클래스에 있는 avg 메소드를 오버라이딩 해봅시다
		 * 이때, 두 수의 평균을 구하는 로직은 같지만
		 * 자식클래스의 avg메소드에서는 두 수의 평균을 구하고,거기에 두 수의 합을 더해준 값을 
		 * 구하고자 합니다. 
		 * */
		SubstractionableCalculator7 c1 = new SubstractionableCalculator7();
        c1.setOprands(10, 20);
        System.out.println(c1.avg()); //45
	}

}
