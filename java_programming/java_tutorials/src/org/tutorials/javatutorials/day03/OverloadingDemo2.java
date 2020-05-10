package org.tutorials.javatutorials.day03;

// 오버로딩 제약 조건
public class OverloadingDemo2 {
	void A () {
		System.out.println("void A()");
	}
    void A (int arg1){
    	System.out.println("void A (int arg1)");
    }
    
    int A (String arg1){
    	System.out.println("return A (String arg1)");
    	return 1;
    }
    //int A (){System.out.println("void A()");}

	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");

	}

}
