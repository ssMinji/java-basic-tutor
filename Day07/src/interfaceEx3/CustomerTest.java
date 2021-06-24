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
	}

}
