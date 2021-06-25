package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c:cons) {
			System.out.println(c);
		}
		// String 클래스가 가진 Constructor(생성자)들의 종류를 알수 있음 
		// 우리가 사용하고자하는 생성자를 골라서 사용할 수 있음 
		
		// 필드 목록 
		Field[] fields = strClass.getFields();
		
		for(Field f: fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		
		// 메서드 목록 
		for(Method m : methods) {
			System.out.println(m);
		}
		
		
	}

}
