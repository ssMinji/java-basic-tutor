package interfaceInheritance;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void Y() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("mymethod()");
		
	}
	
	// 총 3개를 구현해야 함 
	
	public static void main(String[] args){
		MyClass myClass = new MyClass();
		
		X xClass = myClass;
		xClass.x(); // x메서드만 사용 가능 - 업캐스팅 
	}
}


