package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Class 클래스 가져오기 
		
		Person person = new Person();
		
		// 1. Object의 getClass() 메서드 사용하기 
		Class pClass = person.getClass(); // getClass는 Object의 메서드  
		 
		System.out.println(pClass.getName()); // 클래스이름 
		
		// 2. 직접 class 파일 대입 
		Class pClass2 = Person.class; // 이 방법은 Person이라는 클래스가 컴파일되어있어야 쓸 수 있음 
		System.out.println(pClass2.getName());
		
		// 3. 클래스 이름으로 가져오기 
		Class pClass3 = Class.forName("classEx.Person");
		// forName 안에 있는 것은 String. 따라서 컴파일단계에서는 없는 클래스를 넣는다한들 에러가 안남 
		// 해당 클래스가 없을 경우에 대한 예외처리 요구 
		System.out.println(pClass3.getName());
		// 문자열을 써서 그 이름의 클래스가 있으면 걔를 메모리에 로딩을 시킴 
		// 동적 로딩이라고 함 - 컴파일 타임때는 모르고 런타임 때 아는 것 
		
	}

}
