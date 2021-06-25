package interfaceEx3;

public class Customer implements Buy, Sell{ // 여러 개의 인터페이스 구현 가능 

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	// 두번쨰 설명할때!!
	// 각 인터페이스에서 default 메서드 정의한 뒤 Customer에 오류난 것 확인 
	// 메서드 이름이 같아서 오류 난 것 
	// 메서드 오버라이딩 필요 
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
}
