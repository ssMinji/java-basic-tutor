package org.tutorials.javatutorials.same;
import org.tutorials.javatutorials.other.*;
// 접근제어자에 따라 어떻게 동작하는지 확인 

// 1) 같은 클래스
class SameClassChecker {
	//생성자 --> 자기 자신에 정의되어있는 메소드들 호출하고있음 
	// 같은 클래스에 존재하면 모든 접근제어자에 대해 접근 가능 
	public SameClassChecker() {
		// 같은 클래스에 존재하는 메소드들 
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
}

//2) 같은 패키지 
class SamePackageChecker extends Same {
	// 생성자
	public SamePackageChecker() {
		// 같은 패키지
		// Same을 인스턴스화
		Same same = new Same();
		same._public(); // 접근가능
		same._protected(); // 접근가능
		same._default(); // 접근가능 
		//same._private(); // 접근 불가능
		
		// 같은 패키지 상속관계 (Same을 상속받았음)
		// 여기서 this
		// this는 클래스 자기자신을 의미하지만 
		// 클래스가 어떤 클래스를 상속받았고, 자기자신의 클래스내에 가지고있는
		// 메소드가 존재하지 않으면 부모클래스에서 메소드를 찾게됨.
		// 따라서 this의 메소드들은 부모클래스의 메소드들인셈
		this._public(); //접근가능
		this._protected();//접근가능
		this._default();//접근가능
		//this._private(); // 접근불가능
	}
}

// 3) 다른패키지
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		// 다른 패키지
		Other other = new Other();
		other._public(); // 접근 가능
//		other._protected(); //접근불가능
		//other._default(); //접근불가능
		//other._private(); //접근불가능
		
		// 다른 패키지, 자식클래스
		this._public();
		this._protected(); // 상속관계라면 protected에 접근 가능
		//this._default();
		//this._private();
		
		// 요기서 protected와 default가 아주 미묘한 차이 
		// 상속이냐 아니냐에 따라 접근 가능 여부가 달라짐

	}
}

public class Checker {

	public static void main(String[] args) {
		// 다른 패키지
		Other other = new Other();
		other._public();
		
	}

}
