package org.tutorials.javatutorials.oop;

public class No02_Fruit {
	int price = 0;
	String name;
	
	// 여기서의 this는 해당 객체, 자기 자신을 나타냄. 
	// 클래스 내에서의 name을 가리킴. 
	// 파라미터로 들어온 name과 객체 name 이 이름이 동일하기 때문에 명확히 해주는 것. 
	// 만약 파라미터 변수명이 달랐다면 this는 필요없음 
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// new 키워드 사용해 객체 생성 
		No02_Fruit apple = new No02_Fruit();
		System.out.println(apple.price); // .도트연산자 이용해 객체가 보유한 속성에 접근가능
		apple.price = 990;
		System.out.println(apple.price);
		
		System.out.println(apple.name); 
		// null 따라서 해당 값에 대한 조작을 해주는 메소드 구현 
		
		
		// 객체 여러개 생성
		No02_Fruit kiwi = new No02_Fruit();  // Object 1
	    No02_Fruit banana = new No02_Fruit();  // Object 2
	    System.out.println(kiwi.price);
	    System.out.println(banana.price);
	    
	    kiwi.setName("키위"); 
	    System.out.println(kiwi.name); // 키위
	    
	    banana.setName("바나나");
	    System.out.println(banana.name);
	    
	    // name이라는 객체변수는 공유되지 않는다. 
	    // 객체변수의 값이 독립적으로 유지된다는 것은 클래스의 존재 이유. 매우 중요한 포인트 !!!!!!!!!!2
	    
	    // Quiz
	    // 과일 이름을 가져오는 메서드를 작성해보자. 

	}

}
