package dataTypes;

public class StringEx {

	public static void main(String[] args) {

		String str1 = "TEST"; // 리터럴 표기법 
		String str2 = new String("TEST");
		
		System.out.println(str1 == str2); // false -> ==연산자는 동일한 객체인지 판별
		System.out.println(str1.equals(str2));
		
		String str3 = "Hello World";
		System.out.println(str3.indexOf("World")); // index는 0부터 시작 
		
		System.out.println(str3.replaceAll("World", "Java"));
		System.out.println(str3);
		
		System.out.println(str3.substring(0, 4));// 시작위치 <= <끝위치
		
	}

}
