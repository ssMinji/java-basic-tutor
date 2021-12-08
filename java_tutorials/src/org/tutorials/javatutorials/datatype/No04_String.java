package org.tutorials.javatutorials.datatype;

public class No04_String {

	public static void main(String[] args) {
		String a = "Hello Java";
		String b = "a";
		String c = "123";
		
		// new 키워드: 객체 만들 때 사용 
		// 객체: 새로 생성된 자료형 정도의 의미로 알고있기 
		String a = new String("Happy Java");
		String b = new String("a");
		String c = new String("123");
		
		// 첫번째 방식(리터럴 표기)를 사용하는 것이 좋다. 
		// 리터럴이란, 어떤 값을 넣을 때 사용되는 값을 의미 
		// 가독성이 좋고, 컴파일 시 최적화에 도움
		
		
		//문자열 값 비교시 반드시 equals 사용 
		// 이유는 다음의 경우 발생 가능하기 때문 
		// ==는 두 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자 
		// .equals
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        // 변수 a와 b에 각각 문자열을 생성해서 저장했다. 
        //변수 b에 문자열을 만드는 방법은 생성자를 이용하고 있는데 이 방법은 후에 객체 지향 시간에 배우게 된다. 
        //지금은 new String의 괄호 안에 문자열을 넣으면 문자열을 생성할 수 있다고만 알아두자. 
        //결과는 false와 true이다. 
        //==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용하는 연산자이기 때문에 b에 담긴 객체와 일치하지 않는 것이다. 
        //이를 보완하는 비교 방법이 equals이고 이를 이용해서 서로 다른 객체들간에 값이 같은지를 비교할 수 있다. 
        // 이 이야기는 지금 단계에서는 이해하기 다소 어려움이 있다. 
        // 문자열와 문자열를 비교할 때는 '=='를 사용하지 않고 .equals를 사용한다고 일단은 알아두자.
        
		/*여기서 a == b 가 false로 나오는 이유는 String 객체에 대해서 JVM의 메모리할당 방식이 다르기 때문입니다.
		
		String a = "Hello world"로 할당하게 되는 경우에는 Heap안에 있는 String Constant Pool영역에 할당이 되게된다. 
		String b = new String("Hello world")로 할당하게 되는 경우에는 Heap내의 String Constant Pool영역이 아닌 Heap내의 어딘가에 하나의 "Hello world"라는 객체로 할당
		
		여기서 a와 b객체의 내용은 같지만 가르키고있는 객체가 각각 다른 객체이기때문에 a == b는 false가 나오는 것입니다.

		String에 대한 추가적인 내용...
		String a = "Hello World";
		String b = "Hello World";
		이렇게 선언을 하게되면 a,b객체는 SCP(String Constant Pool)내에 Hello World로 동일한 두 객체가 할당될 것 같지만 그렇지 않습니다. 
		SCP내에는 동일한 문자열에 대해서 하나의 Hello World객체로만 할당되며 a와 b는 동일한 레퍼런스를 가지게 되는 것입니다.
		*/
		
        // indexOf : 문자열에서 특정 문자가 시작되는 인덱스 리턴 
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        
        // replaceAll : 특정문자를 다른 문자로 바꿀 때 
        System.out.println(a.replaceAll("Java", "World"));

        // substring : 특정 부분 뽑아낼 때 
        // 끝위치 포함 안됨 
        System.out.println(a.substring(0, 4)); // Hell
        
        // toUpperCase: 대문자로 변경 , toLowerCase
        System.out.println(a.toUpperCase());
	}

}
