package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {

		//Computer c1 = new Computer(); // 에러 남 
		// 추상클래스는 인스턴스 화 될 수 없음 
		
		Computer c2 = new Desktop(); // 업캐스팅관계와 동일 
		//Computer c3 = new Notebook(); // Notebook도 추상클래스이므로 인스턴스화 안됨 
		
		//Computer c4 = new MyNotebook(); // MyNotebook의 상위클래스가 Computer이기 때문에 당연히 이런식으로 가능 
		Notebook c4 = new MyNotebook();
		
		c2.display(); 
		c4.display();
		// Desktop class와 MyNotebook 클래스에서 display 정의하고 있기 떄문에 이 메서드들이 호출되는 것 
		
	}

}
