package string;

public class ImmutableTest {

	public static void main(String[] args) {

		String str1 = new String("abc"); // 이렇게 한 번 선언된 문자열은 변하지 않음 
		// String class 내부에 value 변수 찾아가보면 final로 선언되어 있음 
		
		String str2 = new String("def");
		
		
		//System.out.println(System.identityHashCode(str1));
		str1 = str1.concat(str2);
		//System.out.println(System.identityHashCode(str1));
		
		System.out.println(str1); // abcdef

		// 새로 생성된 문자열을 가리키게 됨 
		// concat 전후로 메모리 값 찍어보기 
		// 찍어보면 전혀 다르다는 것을 알 수 있음. 즉, 새로운 메모리가 할당됨 
		// 문자열 연결을 계속하면 새로운 메모리가 ㄱ계속 잡히고 그렇게 되면 가비지(쓰지않는 메모리)가 많이 생길 수 있음 
		// 따라서 그런 경우에는 StringBuilder, StringBUffer 사용하기 
		
		
		
	}

}
