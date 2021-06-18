package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		// 고객등급에 맞게 고객을 관리하는 프로그램을 만들어보자 
		
		// 모든 등급의 고객을 담을수있는것은 Customer 타입 
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		Customer lee = new Customer(10010, "Lee");
		Customer kim = new Customer(10011, "Kim");
		GoldCustomer song = new GoldCustomer(10012, "Song");
		GoldCustomer park = new GoldCustomer(10013, "Park");
		VIPCustomer yoon = new VIPCustomer(10014, "Yoon", 100);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(song);
		customerList.add(park);
		customerList.add(yoon);
		
		System.out.println("---------------------- 고객정보 출력 ------------------");
		// 향상된 for문
		for(Customer customer: customerList) {
			System.out.println(customer.showInfo()); // 오버라이딩 되어있는 메서드 호출 
		}
		
		System.out.println("---------------------- 할인율과 보너스 포인트 결과 ------------------");

		int price = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하였습니다.");
			System.out.println(customer.showInfo());
		}
		
		// 이렇게 다형성의 활용을 해볼 수 있다. 
		
	}

}
