package com.itbank.javatutorials.exceptions;
// 예외의 종류

class A{
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Err");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Err");
		}catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
		
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		A a = new A();
		// a.z(10, 1);// 에러
		// ArrayIndexOutOfBoundsException
		// 배열은 3개의 값을 담을 수 있는데,10번째 인덱스를 호출하고 있기 때문에
		// 존재하지 않는 값을 가져오려고 시도하고 있기 때문에 에러 발생
		
		// a.z(1, 0); // 에러
		// ArithmeticException
		// arr[1]/ arr[0]
		// 10을 0으로 나누는 것이 수학적으로 불가능하기 때문에 에러 발생 
		
		// 같은 로직이지만 상황에 따라서 다른 예외가 발생할 수 있음
		
		a.z(10, 0); // Index Err
		a.z(1, 0); // Arithmetic Err
		a.z(2, 1);//2

	}

}
