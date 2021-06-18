package abstractEx;

public abstract class Notebook extends Computer{ // display만 구현하기. abstract로 선언 

	@Override
	public void display() {
		System.out.println("Notebook display()");
	}


}
