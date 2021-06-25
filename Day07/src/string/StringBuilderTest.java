package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 동기화: 쓰레드간의 순서를 보장하는 것. 두 개의 순서의 싱크를 맞춰주는 것 
		// 리소스에 락을 거는 것. 다쓴다음 락을 해제시키는 것
		// 멀티쓰레드가 아닌 상황에서 이런 기능을 사용하느 것은 부하를 주는 것. 따라서 단일 쓰레드에서는 StringBuilder
		
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소: "+ System.identityHashCode(javaStr)); // 인스턴스가 처음 생성됐을 때 메모리 주소
		
		StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBUilder 생성
		System.out.println("연산 전 buffer 메모리 주소: "+ System.identityHashCode(buffer));
		
		buffer.append(" is");
		buffer.append(" fun!"); // 문자열 추가 
		System.out.println("연산 후 buffer 메모리 주소: "+ System.identityHashCode(buffer)); //  연결하더라도 메모리 주소 변하지 않는 것 확인 가능 
		
		javaStr = buffer.toString(); // String 클래스로 반환
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소: "+ System.identityHashCode(buffer));
		
		// 결론: 문자열을 계속 연결해서 결과를 찍어내는 상황에서는 String을 사용하지 말고 StringBUilder, StringBuffer 사용 

	}

}
