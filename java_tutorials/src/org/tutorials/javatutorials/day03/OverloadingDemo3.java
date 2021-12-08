package org.tutorials.javatutorials.day03;


// 오버로딩과 상속
public class OverloadingDemo3 extends OverloadingDemo2{

	void A (String arg1, String arg2){
		System.out.println("sub class : void A (String arg1, String arg2)");
	} 
    void A (){
    	System.out.println("sub class : void A ()");
	}
    // 설명한뒤에 위에 메소드에 @Override 어노테이션 붙여주기 
    
	public static void main(String[] args) {
		OverloadingDemo3 od = new OverloadingDemo3();
        od.A();
        od.A(1);
        od.A("hello java");
        od.A("hello java", "hello java");
        // 위 메소드들이 어떤 메소드를 호출하고있는지 하나씩 매치해보기 

	}

}
