package overriding;

public class OverridingTest {

	public static void main(String[] args) {

		Customer lee = new Customer(10010, "Lee");
		int price = lee.calcPrice(10000);
		System.out.println("지불 금액은: " + price + "이고, " + lee.showInfo());
		
		
		
		VIPCustomer kim = new VIPCustomer(10010, "Lee", 100);
		price = kim.calcPrice(10000);
		System.out.println("지불 금액은: " + price + "이고, " + kim.showInfo()); 
		// 보너스 5% 반영된 것 확인 가능 
		// 지불금액이 10% 할인된 금액이 된 것 확인 가능 
		
		
		// Customer 타입의 VIPCustomer 객체 생성해보기 
		// 이 때 불리는 calcPrice가 무엇인가. 하는 것 
		Customer customerWho = new VIPCustomer(10010, "Who", 100);
		int priceWho = customerWho.calcPrice(10000);
		System.out.println("지불 금액은: " + priceWho + "이고, " + customerWho.showInfo());
		
		// 해보면, VIPCustomer의 calcPrice가 불림  
		// 어제 설명했듯이, customerWho. 을 해서 보이는 것처럼 참조변수가 참조할 수 있는 내용은 Customer것만 참조 가능 
		// 목록에도 calcPrice 가 있어서 Customer의 calcPrice가 참조가 되었는데, 실제로 불린건 인스턴스의 메서드임 
		// 이것이 바로 가상메서드(virtual method)
		// 이 개념이 다형성을 구성할 수 있는 기반이 됨 
		// 하나의 코드가 어떤 경우에는 이렇게 불리고, 다른 경우에는 저렇게 불리고..하는 게 다형성 
	}

}
