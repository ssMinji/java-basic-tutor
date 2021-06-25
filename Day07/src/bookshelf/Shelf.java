package bookshelf;

import java.util.ArrayList;

public class Shelf {

	//private ArrayList<String> shelf;
	protected ArrayList<String> shelf; 
	//처음엔 private으로 선언하고 BookShelf에서 에러나는 것 확인 후 protected로 수정하기 
	
	public Shelf(){
		shelf = new ArrayList<String>();
		
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount(){
		return shelf.size();
	}
	
}
