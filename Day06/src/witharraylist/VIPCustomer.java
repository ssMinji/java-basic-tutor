package witharraylist;

public class VIPCustomer extends Customer{

	double saleRatio;
	private int agentId;
	
	
	public VIPCustomer(){
		
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;

	}
	
	public VIPCustomer(int customerId, String customerName, int agentId){
		super(customerId, customerName);
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;

	}
	
	// Customer에 calcPrice 메서드 있었는데 
	// VIP에 대해서는 가격을 할인해줄 필요가 있다. 따라서 calcPrice 재정의 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	// 오버로딩 - 같은 이름의 메서드지만 매개변수 다르게 함으로써 다른 메서드 생성하는 것 
	// 오버라이딩 - 메서드 재정의 (덮어쓰기의 개념) 
	
	public int getAgentId(){
		return agentId;
	}

	@Override
	public String showInfo() {
		return super.showInfo()  + "담당 상담원 아이디는: " + agentId + "입니다.";
		// 주의
		//super 키워드 빼면 재귀호출이 되어버림. 
		// 현재 showInfo()는 String 타입을 리턴하고 있기 때문에 뒤에 +로 연결해서 이어주면 됨 
	}
	
	
	

}
