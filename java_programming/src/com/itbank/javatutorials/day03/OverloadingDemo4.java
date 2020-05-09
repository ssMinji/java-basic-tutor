package com.itbank.javatutorials.day03;

//OverloadingDemo코드 개선하기
class Calculator9 {
	int[] oprands; // 배열
	
	// 매개변수로 배열 사용
	// 이렇게 사용하면 하나의 인자로 여러개의 값을 받을 수 있다. 
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		// for-each문
		for(int value: this.oprands) {
			total += value;
		}
		System.out.println(total);
	}
	
	// avg() 구현 
	public void avg() {
		int total = 0;
		int avarage;
		for(int value: this.oprands) {
			total += value;
		}
		avarage = total / this.oprands.length;
		System.out.println(avarage);
	}
}

public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
		c1.setOprands(new int[] {10, 20});
		c1.sum(); //30
		c1.avg(); // 15
		c1.setOprands(new int[] {10, 20, 30});
		c1.sum();// 60
		c1.avg(); // 20 

	}

}
