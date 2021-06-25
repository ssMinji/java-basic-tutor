package bookshelf;

public interface Queue {

	void enQueue(String title); // 넣기
	String deQueue(); // 꺼내기(선입선출)
	int getSize(); // 몇개의 요소를 가지고 있는지 파악하는 
}
