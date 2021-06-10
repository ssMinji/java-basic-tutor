package thisEx;

class Person {
	String name;
	int age;
	
	public Person() {
		/*name = "알수없음";
		age = 0;*/
		// 위 처럼 해도되지만 같은 대입 동작을 아래의 생성자에서 하고있기때문에  
		this("알수없음", 0); // 이렇게 하면 됨 
		// 다른 생성자 호출한 것
		// 이 때는 생성자의 종류가 여러개더라도 매개변수의 개수와 데이터타입이 일치하는 생성자를 호출하게 됨 
		
		// 이 파일의 마지막에 설명할 것 
		name = "test";
		this("알수없음", 0); 
		// 이런식으로 this 구문 위에 다른 구문은 사용하지 못함 
		// 이유: name이라는 변수는 Person이라는 인스턴스가 생성되어야 잡히는 변수
		// 인스턴스의 생성과 동시에 제일 처음 일어나는게 생성자 생성인데 이게 언제끝나냐면 
		//this("알수없음", 0); 요게 불리고 변수들의 초기화가 다 끝난다음에 Person의 인스턴스가 다 만들어지는 것 
		// 즉, Person()생성자가 호출됐는데 그 안에서 다른 생성자를 호출했다고 한다면 그 다른생성자에 의해 멤버변수의 초기화가 이루어져야 하는데 
		// 그 전에 다른 코드가 작성되어서 어떤 작업이 행해져버리면 오류가 발생할 수 있음. 아직 생성되지 않은 메모리에 값을 어사인 한다거나 하는 등의.
		// 따라서 멤버변수를 조작하는 코드 뿐만이아니라 모든 코드를 아예 작성하지 못하게 함 
		// 정리: 생성자내에서 다른 생성자를 호출하는 this를 사용하면, 그 코드는 제일 먼저 작성되어야 하는 규칙 기억하기 
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// this는 인스턴스 자신을 의미하기 때문에 그 타입은 Person. 즉 객체가 생성된 클래스. 
	// 따라서 return this를 했을 때 리턴타입은 본인의 클래스명이 될 것 
	public Person returnSelf(){
		return this;
	}
	
	
}

public class ThisEx2 {

	public static void main(String[] args) {

		Person p1 = new Person(); 
		//요구사항: 디폴트 생성자가 호출됐을 때 이름 = "알수없음" 나이=0으로 세팅해주고 싶다. 
		
		System.out.println(p1.name); // 확인해보기 
		
		System.out.println(p1.returnSelf());
		
	}

}
