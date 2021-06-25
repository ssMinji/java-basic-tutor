package generics;

public class ThreeDPrinter {
	// 재료가 plastic 일수도있고 powder일수도있는 일반적인 3d 프린터를 만들어보자

	// 그 때 재료에 대한 자료형을 Object로 가져갈 수 있음 
	// 모든클래스의 최상위 클래스이기 때문
	// 어떤 타입이 들어오던 Object로 형변환이 이루어져서 사용 가능 
	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	} 
	
	
	
}

// 제네릭 클래스로 만들어보자! 한 이후 
public class ThreeDPrinter<T>{
	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	} 
	
	// 사용될 타입이 들어갈 곳에 동일한 문자로 작성 
	
	public String toString(){
		return material.toString(); // 재료의 toString을 호출 
	}
	
}

// 타입에 제한을 둬보자!!!한 이후
public class ThreeDPrinter<T extends Material>{ // Material 클래스를 상속받은 애들만 쓸 수있다는 것 
	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	} 
	
	
	public String toString(){
		return material.toString(); 
	}
	
}
