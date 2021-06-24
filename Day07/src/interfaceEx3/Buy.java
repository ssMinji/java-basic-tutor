package interfaceEx3;

public interface Buy {
	
	void buy();
	
	
	// 두번째 설명할때!!
	default void order(){
		System.out.println("구매주문");
	}
}
