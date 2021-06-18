package overriding;

// Source -> Override 선택하면 자동 생성 가능 
public class GoldCustomer extends Customer {

	public GoldCustomer(){
		bonusRatio = 0.05;
	}
	
	@Override // annotation : 컴파일러에게 어떤일을 한다는걸 알려주는 역할 
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showInfo() {
		return super.showInfo();
	}
	
	// 이런식으로 재정의 가능하다 
}
