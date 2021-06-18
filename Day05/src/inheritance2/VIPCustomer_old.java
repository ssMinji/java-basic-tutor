package inheritance2;


// VIPCustomer라는 클래스를 따로 구현하고 보니 Customer 클래스와 굉장히 유사 
// 따라서 Customer의 기능을 그대로 가져다 쓰겠다 -> 상속 
public class VIPCustomer_old {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	private int saleRatio;
	private int agentId;
	
	public VIPCustomer_old(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
	}

	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;

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