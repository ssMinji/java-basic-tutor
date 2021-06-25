package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 주소값말고 실제값이 출력되도록 하고 싶다면, toString 재정의 하기
	// Source -> Overriding 클릭 하면 리스트에 toString 메서드가 뜰 것임 
	@Override
	public String toString() {
		return title + ", " + author;
	}
	// 재정의 후 다시 run 해보면 자바, Jack으로 나오는 것 확인 가능 
	
}

public class ToStringEx {

	public static void main(String[] args) {

		Book book = new Book("자바", "Jack");
		System.out.println(book); // 주소값
		
		String str = new String("test");
		System.out.println(str); // test 
		
		// String 클래스의 toString은 재정의 되어있기 떄문 
	}

}
