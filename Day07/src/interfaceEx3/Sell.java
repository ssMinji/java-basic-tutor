package interfaceEx3;

public interface Sell {

	void sell();
	
	// 두번째 설명할때!!
	default void order(){
		System.out.println("판매주문");
	}
}
