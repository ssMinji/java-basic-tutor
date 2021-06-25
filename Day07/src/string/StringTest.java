package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //false
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // true 
		// 상수풀 생성-> 동일한 메모리를 가리킴 
	}

}
