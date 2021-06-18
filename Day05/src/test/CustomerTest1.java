package test;

import inheritance2.Customer;
import inheritance2.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer lee = new Customer();
		// 자동완성으로 해보면 멤버변수들에 대한 자동완성 안보임-> protected이기 떄문. protected는 다른 패키지에서는 안 보임 
		// 여기까지 설명하고 다시 inheritance2 패키지로 옮기자. 
		// 옮겨서 자동완성하면 이제 멤버변수 자동완성에 뜸. 같은 패키지에서는 접근 가능함 확인 
		lee.setCustomerId(10100);
		lee.setCustomerName("Lee");
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerId(10101);
		kim.setCustomerName("Kim");
		
		kim.bonusPoint = 1000;
		
		System.out.println(lee.showInfo());
		System.out.println(kim.showInfo());
		
		// 클래스 생성 순서 설명 
		// 하위클래스가 생성될 떄는 항상 상위클래스가 먼저 생성됨 
		
		// 업캐스팅 설명 
		Customer cust1 = new VIPCustomer();
		
		//cust1.agentId;
		// agentID 에 대해 자동완성 불가능
		// 가시성이 있는데도. 
		// 업캐스팅이 되면 상위 클래스의 메서드나 변수만 접근 가능하기 때문.
		
		// 정리 
		// 하위클래스가 생성될 때는 상위 클래스가 먼저 생성이 됨
		// 하위클래스가 상위클래스의 타입을 내포하고 있기 때문에 업캐스팅 가능 
		
	}

}
