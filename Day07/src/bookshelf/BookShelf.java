package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// arraylist의 개수를 하나 제거. 맨앞의 것으로  ->  remove 메서드 
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
