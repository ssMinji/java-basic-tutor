package object;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

// 처음에는 Cloneable implements 안하고 시작 
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 = " + this.point + ", 반지름은 = " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class CloneEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle) circle.clone(); // 반환형이 object이므로 강제로 다운캐스팅 하기 
		// 예외처리에 관해서도 에러가 나는데 일단 throw처리 하기 
		// 클론할 수 없는데 클론하려고 시도하는 경우에 대한 예외처리를 요구하고 있는 것 
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));
		// 해보면 에러남. 
		// Circle 클래스에서 Cloneable 인터페이스 implements 하기 
		
		// 서로다른 hashcode 값을 갖는 객체임을 확인 가능 
		
		System.out.println(circle);
		System.out.println(cloneCircle);
		// 이때 인스턴스변수는 정확히 복제가 됨 

	}

}
