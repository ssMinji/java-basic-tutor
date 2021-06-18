package inheritance2;

public class Customer {

	//이걸로 먼저 진행!!!!!!!!!!!!!!!!!!
	//private int customerId;
	//private String customerName;
	//private String customerGrade;
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	
	// protected 
	// 외부클래스에 대해선 private이지만
	// 상속관계에서는 public으로 보이게 해주는 접근제어자 
	// package가 달라도 상속관계에서는 public
	// test 페키지 만들어서 Customer 클래스 옮겨보고 customerGrade 변수 에러 안나는 것 확인 
	// 그러나 bonusRatio에서는 에러 날 것 
	// 아무것도 선언안하면 -> default 접근제어자 
	// default: 같은 패키지 내에서만 보임 
	
	// 정리
	// 가시성 순서: private ->  default -> protected -> public 
	
	
	int bonusPoint;
	double bonusRatio;
	
	
	
	//VIP 고객에 대한 단순 기능 추가 
	private int saleRatio;
	private int agentId;
	// 만약 이런식으로 속성이 추가가 된다면--> calcPrice에 조건문 추가 될 수 밖에 없음 
	// 하나의 클래스 안에 일반 고객, VIP 고객에 대한 모든 기능이 다 구현됨 
	// 문제는, 
	// 1)고객 등급이 추가가 된다면 조건문이 추가가 될 것. -> 동일하게 반복되는 if-else문이 너무 많아짐 -> 안좋은 설계
	// 2) saleRatio와 agentId는 일반고객에게는 불필요한 속성 
	// 클래스가 커지고 유지보수가 힘들어짐 
	
	public Customer(){
		// 상속 클래스 생성 순서 설명할 때 코딩!!!!!!!!!!!!!!
		// super()  있는 것 
		// Customer의 상위클래스는 Object클래스
		// 모든 자바클래스의 최상위 클래스는 Object 클래스임  나중에 다시 설명할 것 
		
		
		// 기본 등급, 적립률 
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		// 상속 클래스 생성 순서 설명할 때 코딩!!!!!!!!!!!!!!
		System.out.println("Customer() 호출");
	}
	
	// 디폴트 생성자 주석 처리 후 이것 살려내보기 
	// VIPCustomer 에러 나는 것 확인 !! 
	// super()키워드 생략되어 있는데 이것은 부모클래스의 디폴트 생성자 호출
	// 따라서 VIPCustomer 생성자 수정 
	/*public Customer(int customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	public int calcPrice(int price){
		// 포인트 적립만. 가격은 할인 안하고 그냥 리턴 
		bonusPoint += price * bonusRatio;
		return price;
		
		// VIP설명하면서 
		/*if(customerGrade.equals("SILVER")) {
			bonusPoint += price * bonusRatio;
		} else if(customerGrade.equals("VIP")) {
			
		}*/
	}
	
	public String showInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
