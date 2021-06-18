package inheritance;

public class Circle {

	private int x;
	private int y;
	
	private int radius;
	
}


// 그렇다고 해서 

public class Circle  extends Point{
	
	private int radius;
	
}

// 이런 식으로 작성하지는 않음 
// Circle과Point는 일반적이고 구체적인 관계가 아니고 Circle은 단순히 Point를 활용하고 싶은 것 -> 이럴때는 상속하는 것이 아님 

// 맞는 방법 
public class Circle {
	
	Point point; // 합성 : has - a 관계 
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}

// 결론
// 오해하지 말것 
// 상속은 이미 있는 클래스를 가져다 쓰는 것이 아니라 보편적인 클래스가 정의되어있고 그 기능을 그대로 가져다 쓰면서  
// 좀 더 addon된, 구체적인 클래스를 만들 때 사용하는 것. is-a 관계





