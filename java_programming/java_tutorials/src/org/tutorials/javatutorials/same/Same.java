package org.tutorials.javatutorials.same;

public class Same {
	private void _private() {
		System.out.println("private");
	}
	// 접근제어자를 명시하지 않으면 디폴트 접근제어자 
	void _default() {
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}


}
