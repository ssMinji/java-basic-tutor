package witharraylist;

public class GoldCustomer extends Customer{

	// 단골에 대한 고객 등급 추가
	// 포인트 적립률 2%
	// 할인율 10% - 
	// 담당 상담원은 없음 
	
	double saleRatio; // VIPCustomer에만  있던 변수. 따라서 VIPCustomer에서 상속받으면 되지 않냐 할 수도 있지만 
	                  // agentId는 없고 계층구조가 깊게 들어가면 좋은 구조가 아님. 따라서 하나 추가 
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = (int) (price * saleRatio);
	}
	
	
	
}
