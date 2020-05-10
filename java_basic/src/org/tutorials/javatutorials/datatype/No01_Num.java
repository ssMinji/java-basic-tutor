package org.tutorials.javatutorials.datatype;

public class No01_Num {

	public static void main(String[] args) {
		int age = 10;
		long countOfStar = 8764827384923849L; // int 최대값보다 큰 경우 L 붙여야함
		
		float pi = 3.14F; // float에 할당할때는 F 붙여야함 
		double morePi = 3.14159265358979323846;
		
		double d1 = 123.4;
		double d2 = 1.234e2; // 지수표현식가능 
		
		// 사칙연산 
		int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // 나머지 버려짐 
        
        System.out.println(7 % 3); // 나머지 
        System.out.println(3 % 7);
        
        // 증감연산
        int i = 0;
        int j= 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);
		
        // Quiz 
        int z = 0;
        System.out.println(z++); // 0 -> 해당코드 실행되는 순간에는 i값이 변경되지 않음 실행된 이후에 변경. 값이 참조된 후에 증가 
        System.out.println(z); // 1
        
        int i = 0;
        System.out.println(++i); // 값이 참조되기 전에 증가 
        System.out.println(i);
        
	}

}
