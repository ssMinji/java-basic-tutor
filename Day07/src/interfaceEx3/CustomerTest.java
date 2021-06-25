package interfaceEx3;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy(); // buy 만 호출 가능 
		
		Sell seller = customer; // Customer가 Sell이라는 인터페이스를 구현하고 있으므로 customer 인스턴스를 Sell이라는 인터페이스 변수에 대입 가능
		seller.sell(); // sell만 호출 가능 
		
		customer.buy();
		customer.sell();
		// Customer 인스턴스로는 모두 호출 가능 
		
		// 결론: 하나의 클래스에서 여러개의 인터페이스 구현 가능 
		//      인스턴의 타입이 어떤 것으로 바인딩 되었느냐에 따라 호출되는 것이 한정될 수 있음 
		
		
		// 디폴트 메서드 오버라이딩 후 
		customer.order();
		buyer.order();
		seller.order();
		// 결과 전부 동일! -> 가상메서드 (인스턴스의 메서드가 불리는 것)
		// 현재 어사인된 인스턴스가 Customer이므로Customer의 order가 불리는 것 
	}

}
