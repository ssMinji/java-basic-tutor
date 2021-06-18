package inheritance2;

public class VIPCustomer extends Customer{
	
	// 상위클래스에 있는 기능을 내가 다 가져다쓰겠다는 의미이므로 
    // 추가되는 속성 정의만 필요 
	private double saleRatio;
	private int agentId;
	
	
	public VIPCustomer(){
		
		// 상속 클래스 생성 순서 설명할 때 코딩!!!!!!!!!!!!!!
		// super();
		// this 키워드와 비슷. this는 생성자내에서 다른 생성자를 호출할 때 사용되었는데
		// super는 자기 바로 위 상위클래스를 가리키는 참조자 키워드 . 상위클래스의 생성자가 호출됨 
		// 이때 매개변수가 하나도 없음. 그렇다는 건 default 생성자를 호출 
		
		
		// Customer 클래스의 디폴트생성자 주석처리 후 진행!! 
		// 이렇게 명시적으로 불러줘야 함 
		// super(0, null);
		// 혹은 매개변수로 int customerId, String customerName 받아와서
		// super(customerId, customerName); 해주기 
		
		customerGrade = "VIP"; // 빨간줄이 뜨는 이유는 Customer에서 customerGrade를 private으로 선언했기 때문 
		                       // 따라서 protected로 키워드 변경 
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		// 상속 클래스 생성 순서 설명할 때 코딩!!!!!!!!!!!!!!
		System.out.println("VIPCustomer() 호출");
	}
	
	// 바꾸는건 제공하지 않겠다. 라고 했을 때 
	public int getAgentId(){
		return agentId;
	}
	
	

}
