package dataTypes;

public class CharEx {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch = 66;
		System.out.println(ch); // 문자는 내부적으로 정수형으로 표현됨을 알 수 있음 
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
	}

}
