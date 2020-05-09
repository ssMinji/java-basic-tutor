package com.itbank.javatutorials.same;

import com.itbank.javatutorials.other.*;

class SamePackageChecker extends Same{
	// 생성자
	public SamePackageChecker() {
		// 같은 패키지 내에 있는 Same을 인스턴스화
		Same same = new Same();
		same._public(); //접근가능
		same._protected(); // 접근가능
		same._default(); // 접근가능 
		//same._private(); // 접근불가능
		
		// 클래스가 어떤 클래스를 상속 받았고, 자기자신의 클래스 내에 
		// 가지고있는 메소드가 존재하지 않으면, 부모클래스에서 메소드를 찾게 됨
		// 따라서 여기서 this 메소드는 부모클래스의 메소드
		this._public(); // 접근가능
		this._protected(); // 접근가능 
		this._default(); // 접근가능
		//this._private(); // 접근불가능
	}
}
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		// 다른 패키지의 클래스 접근 가능여부
		Other other = new Other();
		other._public(); // 접근가능
		// other._protected();// 접근불가능
		// other._default(); // 접근불가능
		// other._private(); //접근불가능
		
		// 다른패키지, 자식클래스 
		this._public(); // 접근가능
		this._protected(); // 접근 가능
		//this._default(); // 접근 불가능
		//this._private(); // 접근 불가능
	}
	
}

class SameClassChecker {
	// 생성자
	public SameClassChecker() {
		// 같은 클래스 내에 존재하는 메소드 호출 
		this._public(); // 접근가능
		this._protected(); // 접근가능
		this._default(); // 접근가능
		this._private(); // 접근가능 
		// 결론: 같은 클래스에 존재하면 모든  접근제어자에 대해 접근 가능 
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



public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
