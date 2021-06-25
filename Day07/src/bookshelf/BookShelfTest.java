package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("A");
		shelfQueue.enQueue("B");
		shelfQueue.enQueue("C");
		shelfQueue.enQueue("D");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		// A, B, C, D 순서대로 나오는 것 확인 가능 
		
	}

}
