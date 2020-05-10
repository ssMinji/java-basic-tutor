package org.tutorials.javatutorials.day03;

class Calculator8 {
	int left, right;
	int third = 0; // sum 과 avg 메소드의 올바른 동작 위한 초기화
	 
	public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
	// 메소드 오버로딩 
    public void setOprands(int left, int right, int third){
    	// 개선사항
        //this.setOprands(left, right);
    	// 로직의 재활용성, 중복의 제거, 유지보수의 편의성 동시에 달성 
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
 
    public void sum() {
        System.out.println(this.left + this.right+this.third);
    }

	 public int avg() {
	    return (this.left + this.right+this.third) / 2;
	}
	
}


public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
//		c1.setOprands(10,  20);
//		c1.setOprands2(10,  20, 30);
		
		c1.setOprands(10,  20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,  20, 30);
		c1.sum();
		c1.avg();
		
	}

}
